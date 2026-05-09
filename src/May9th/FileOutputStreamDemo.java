package Day01.src.May9th;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("test.txt");
            byte[] bytes = "Hello IO".getBytes();
            fos.write(bytes);
            fos.close();
            fos = new FileOutputStream("test.txt",true);
            fos.write("\n追加的内容".getBytes() );
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
    }
}
