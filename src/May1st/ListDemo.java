package Day01.src.May1st;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> link = new LinkedList<>();

        long start = System.currentTimeMillis();
        for(int i = 0;i < 10000; i++) {
            arr.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            link.add(0,i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("耗时：" + (finish - begin) + "ms");
    }



}
