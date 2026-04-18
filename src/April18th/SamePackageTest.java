package Day01.src.April18th;
import Day01.src.April18th.Person01;
public class SamePackageTest {
    public static void main(String[] args) {
        Person01 p = new Person01();

        System.out.println("=== 同包不同类 ===");
        // System.out.println(p.id);
        System.out.println("default name: " + p.name);
        System.out.println("protected age: " + p.age);
        System.out.println("public gender: " + p.gender);
    }
}