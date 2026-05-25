package Day01.src.April24th;

public class Rectangle extends BaseShape{
    double length;
    double width;
    public Rectangle(String color,double length,double width){
        super(color);
        this.length = length;
        this.width = width;
        System.out.println("创建了一个长方形，长：" + length + "，宽：" + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }
}
