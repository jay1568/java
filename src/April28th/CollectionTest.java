package Day01.src.April28th;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("java");
        c.add("python");
        c.add("c++");
        System.out.println("集合内容：" + c);
        System.out.println("集合大小：" + c.size());
        System.out.println("是否包含java： " + c.contains("java"));

        c.remove("c++");
        System.out.println("删除c++后：" + c);

        Object[] arr = c.toArray();
        for(Object obj : arr) {
            System.out.println("数组元素：" + obj);
        }

        c.clear();
        System.out.println("清空后大小：" + c.size());
        System.out.println("是否为空：" + c.isEmpty());
    }
}
