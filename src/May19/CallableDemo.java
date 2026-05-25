package Day01.src.May19;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    sum += i;
                }
                System.out.println("线程正在计算");
                return sum;
            }
        };
        FutureTask<Integer> future = new FutureTask<>(callable);
        Thread t = new Thread(future);
        t.start();
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
