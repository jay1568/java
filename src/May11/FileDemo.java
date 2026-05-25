package Day01.src.May11;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("test_dir");
        if(!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir,"test.txt");
        if(!file.exists()) {
            file.mkdir();
        }
        System.out.println("test.txt是否存在：" + file.exists());
        System.out.println("test.txt的绝对路径:" + file.getAbsolutePath());
        System.out.println("test.txt的文件名：" + file.getName());
        System.out.println("test.txt的父目录：" + file.getParentFile());
        System.out.println("test_dir是文件吗：" + dir.isFile());
        System.out.println("test_dir是目录吗：" + dir.isDirectory());
        System.out.println("目录内容");
        String[] list = dir.list();
        if(list != null) {
            for(String name : list) {
                System.out.println(name);
            }
        }
        if (file.delete()) {
            System.out.println("删除文件：" + file.getName());
        }
        if (dir.delete()) {
            System.out.println("删除目录：" + dir.getName());
        }
    }
}
