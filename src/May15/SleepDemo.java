package Day01.src.May15;

public class SleepDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(System.currentTimeMillis());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(3000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("线程被中断");
        }
    }
}
