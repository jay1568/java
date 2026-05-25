package Day01.src.May16;

import Day01.src.April22th.A;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("张三", 10000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(5000);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(5000);
            }
        });
        t1.start();
        t2.start();
    }
}
