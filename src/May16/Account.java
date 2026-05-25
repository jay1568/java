package Day01.src.May16;

public class Account {
    private String name;
    private double balance;

    public Account() {}

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // 加上 synchronized 保证线程安全
    public synchronized void withdraw(double money) {
        // 打印开始取款时的余额
        System.out.println(Thread.currentThread().getName() + " 开始取款，当前余额：" + balance);

        try {
            Thread.sleep(100);  // 模拟网络延迟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (money <= balance) {
            balance -= money;
            System.out.println(Thread.currentThread().getName() + " " + name + " 取款成功，余额：" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " 余额不足，当前余额：" + balance);
        }
    }
}