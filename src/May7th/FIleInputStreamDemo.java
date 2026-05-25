package Day01.src.May7th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test.txt");

            System.out.println("===单个字节读取===");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n");
            fis.close();
            fis = new FileInputStream("test.txt");

            System.out.println("===批量读取===");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                System.out.println(new String(buffer,0,len));
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在:" + e.getMessage());
        }catch (IOException e) {
            System.out.println("读取文件失败：" + e.getMessage());
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
         }
    }
}
