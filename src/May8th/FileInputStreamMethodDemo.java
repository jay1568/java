package Day01.src.May8th;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamMethodDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");
            int available = fis.available();
            System.out.println("文件大小：" + available);
            byte[] bytes = new byte[available];
            fis.read(bytes);
            System.out.println("完整内容：" + new String(bytes));
        } catch (IOException e) {
            System.out.println("文件不存在" + e.getMessage());
        }finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        System.out.println("====================================");
        FileInputStream fis1 = null;
        try {
            fis = new FileInputStream("test.txt");
            long skippend = fis.skip(3);
            System.out.println("跳过了" + skippend + "字节" );
            System.out.print("跳过前3个字节后的内容：");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null) {try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }}
        }


    }
}
