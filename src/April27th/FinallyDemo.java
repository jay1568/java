package Day01.src.April27th;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("捕获到算术异常");
        } finally {
            System.out.println("finally 代码块执行");
        }
    }
}
