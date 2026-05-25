package Day01.src.May15;

public class StopThreadDemo {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread t = new Thread(myTask);
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myTask.stop();
    }
}

class MyTask implements Runnable{
    private boolean running = true;
    public void stop() {
        running = false;
        System.out.println("线程被终止");
    }
    @Override
    public void run() {
        int i = 0;
        while (running) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}