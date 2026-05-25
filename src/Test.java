package Day01.src;

public class Test {
    public static void main(String[] args) {
        Master master = new Master();
        master.feed(new Dog());
        master.feed(new Cat());
        master.feed(new Snake());
    }
}
