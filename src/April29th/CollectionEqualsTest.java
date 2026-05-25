package Day01.src.April29th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEqualsTest {
    public static void main(String[] args) {
        Collection<User> c = new ArrayList<>();
        c.add(new User(1,"张三"));
        c.add(new User(2,"李四"));
        System.out.println(c.size());

        User u1 = new User(1,"王五");
        System.out.println(c.contains(u1));

        User u2 = new User(1,"赵六");
        c.remove(u2);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        User u3 = new User(3,"小明");
        c.remove(u3);
        Iterator it1 = c.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
