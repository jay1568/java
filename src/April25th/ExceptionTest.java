package Day01.src.April25th;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch (Exception e) {
            System.out.println("捕获到异常： "+ e.getMessage());
        }
        System.out.println("程序继续执行");
    }
}
