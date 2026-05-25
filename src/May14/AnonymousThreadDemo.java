package Day01.src.May14;

public class AnonymousThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }

            }
        });
        t1.start();
        System.out.println("=============================");
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };
        t2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main - " + i);
        }
    }
}
