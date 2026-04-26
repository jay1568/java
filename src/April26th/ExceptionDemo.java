package Day01.src.April26th;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionDemo {

    public static void method1() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("test.txt");
    }

    public static void method2() {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到：" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println("method1 的异常被main 捕获");
        }

        method2();

        System.out.println("程序继续执行");
    }
}
