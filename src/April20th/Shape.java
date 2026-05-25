package Day01.src.April20th;

public abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
        System.out.println("Shape有参构造，颜色： " + color);
    }
    public void getArea() {
        System.out.println("Shape 的 getArea方法");
    }
    public abstract void draw();
}
