package Day01.src.May19;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 0;
            @Override
            public void run() {
                    count++;
                    System.out.println("第" + count + "次执行，当前时间：" + System.currentTimeMillis());
                    if(count >= 5) {
                        timer.cancel();
                        System.out.println("定时器已取消");
                    }
            }
        };
        timer.schedule(task,1000,2000);
    }
}
