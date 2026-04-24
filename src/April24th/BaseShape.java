package Day01.src.April24th;

public abstract class BaseShape implements Shape{
    String color;
    public BaseShape(String color){
        this.color = color;
        System.out.println("BaseShape构造，颜色：" + color);
    }
    public void showColor() {
        System.out.println("颜色是：" + color);
    }
}
