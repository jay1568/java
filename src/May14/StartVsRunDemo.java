package Day01.src.May14;

public class StartVsRunDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        };
        System.out.println("===调用run()方法");
        t1.run();
        System.out.println("调用start()方法");
        t1.start();
        for (int  i = 0;  i < 5;  i++) {
            System.out.println("main - " + i);
        }
    }
}
