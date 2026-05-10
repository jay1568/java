package Day01.src.May10th;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
             fw = new FileWriter("test.txt");
             fw.write("沈星回\n");
             fw.close();
             fw = new FileWriter("test.txt",true);
             fw.write("追加的内容：有时候，一个人的独行，是为了两个人更好的同行。我想我已经走了那么远的路，早就把我们要分开走的路走完了。");
             fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
