package Day01.src.May12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeDemo {
    public static void main(String[] args) {
        User user = new User("张三",20,"123456");
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("user.dat"));
            oos.writeObject(user);
            System.out.println("单个对象序列化成功");
            List<User> users = new ArrayList<>();
            users.add(new User("李四",21,"000000"));
            users.add(new User("王五",18,"555555"));
            users.add(new User("沈星回",23,"20250109"));
            oos.writeObject(users);
            System.out.println("集合序列化完成");
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
