package Day01.src.May10th;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileCopyDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("test.txt");
            fw = new FileWriter("test_copy2.txt");
            char[] chars = new char[1024];
            int readCount;
            while((readCount = fr.read(chars)) != -1) {
                fw.write(chars,0,readCount);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e ) {
                    e.printStackTrace();
                }
            }
        }
    }
}
