package Day01.src;

public class TestFinal {
    public static void main(String[] args) {
        System.out.println("测试final变量");
        FinalVariableDemo.main(args);

        System.out.println("测试final方法");
        Child child = new Child();
        child.finalMethod();
        child.normalMethod();

        System.out.println("测试final类");
        FinalClass fc = new FinalClass();
        fc.setName("测试");
        fc.show();
    }
}
