package Day01.src.April24th;

public class Test {
    public static void main(String[] args) {
        BaseShape cir = new Circle("红", 5.0);
        BaseShape rec = new Rectangle("蓝", 4.0, 3.0);

        cir.showColor();
        System.out.println("圆面积：" + cir.getArea());
        System.out.println("圆周长：" + cir.getPerimeter());

        rec.showColor();
        System.out.println("长方形面积：" + rec.getArea());
        System.out.println("长方形周长：" + rec.getPerimeter());
    }
}
