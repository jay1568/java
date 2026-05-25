package Day01.src;

public class Parent {
    public final void finalMethod() {
        System.out.println("父类的final方法，不能被覆盖");
    }
    public void normalMethod() {
        System.out.println("父类的普通方法");
    }
}

