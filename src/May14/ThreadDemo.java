package Day01.src.May14;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0;i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
