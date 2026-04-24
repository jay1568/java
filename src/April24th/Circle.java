package Day01.src.April24th;

public class Circle extends BaseShape{
    double radius;
    @Override
    public double getArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(String color , double radius) {
        super(color);
        this.radius = radius;
        System.out.println("创建了一个圆，半径：" + radius);
    }
}
