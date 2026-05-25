package Day01.src.May16;

public class AccountSolutionTest {
    public static void main(String[] args) {
        Account account = new Account("张三", 10000);

        Thread t1 = new Thread(() -> account.withdraw(5000));
        Thread t2 = new Thread(() -> account.withdraw(5000));

        t1.start();
        t2.start();
    }
}
