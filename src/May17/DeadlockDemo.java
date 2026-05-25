package Day01.src.May17;

public class DeadlockDemo {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            synchronized (lockA) {
                System.out.println("线程1 获得了lockA");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB) {
                    System.out.println("线程1 获得了lockB");
                }
            }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    System.out.println("线程2 获得了lockB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lockA) {
                        System.out.println("线程2 获得了lockA");
                    }
                }
            }
        });
        t1.start();
        t2.start();
        // 避免嵌套锁
        //按固定顺序获取锁
    }
}
