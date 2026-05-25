package Day01.src.May11;

import javax.sql.rowset.RowSetWarning;
import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis,"utf-8");
            int readCount;
            while ((readCount = isr.read()) != -1) {
                System.out.print((char)readCount);
            }
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test_output.txt"),"utf-8" );
            osw.write("使用OutPutStreamWriter写入的内容");
            osw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
