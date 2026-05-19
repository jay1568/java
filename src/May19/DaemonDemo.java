package Day01.src.May19;

public class DaemonDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("守护线程运行中...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("主线程运行中...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
