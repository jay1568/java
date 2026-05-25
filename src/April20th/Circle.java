package Day01.src.April20th;

public class Circle extends Shape {
    private double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
        System.out.println("Circle 有参构造，半径：" + radius);
    }
    @Override
    public void draw(){
        System.out.println("画一个" + color + "色的圆，半径" + radius);
    }

    @Override
    public void getArea() {
        System.out.println("圆的面积：" + Math.PI * radius * radius);
    }
}
