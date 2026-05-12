package Day01.src.May12;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeDemo {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("user.dat"));
            User user = (User) ois.readObject();
            System.out.println("反序列化结果：" + user );
            ArrayList<User> list = (ArrayList<User>) ois.readObject();
            for (User u : list) {
                System.out.println(u);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
