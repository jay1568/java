package Day01.src;

public class Child extends Parent{
//    public void finalMethod();

    @Override
    public void normalMethod() {
        System.out.println("子类覆盖了普通方法");
    }
}
