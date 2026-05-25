package Day01.src.May17;

public class SynchronizedDemo {
    private int count = 0;
    public synchronized void increment() {
        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - 实例方法 - count = " + count);
        }
    }
    public static synchronized void staticMethod() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "静态方法执行");
        }
    }
    public void blockMethod() {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                count++;
                System.out.println(Thread.currentThread().getName() + " - 代码块 - count = " + count);
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.blockMethod();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                staticMethod();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
