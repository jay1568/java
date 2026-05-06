package Day01.src.May6th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRecall {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(8);
        arr.add(1);
        arr.add(9);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println("反转后：" + arr);
        System.out.println("查找元素5的索引" + Collections.binarySearch(arr,5));
    }
}
