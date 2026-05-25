package Day01.src.TestPackage;
import Day01.src.April18th.Person01;
public class DifferentPackageTest {
        public static void main(String[] args) {
            Person01 p = new Person01();

            System.out.println("=== 不同包非子类 ===");
            // System.out.println(p.id);      // ❌ private
            // System.out.println(p.name);    // ❌ default（不同包）
            // System.out.println(p.age);     // ❌ protected（不同包且非子类）
            System.out.println("public gender: " + p.gender);  // ✅ public 可访问
        }
    }

