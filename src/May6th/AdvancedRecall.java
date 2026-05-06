package Day01.src.May6th;

import Day01.src.April22th.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdvancedRecall {
    public static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(3);
        arrayList.add(22);
        arrayList.add(8);
        arrayList.add(11);
        arrayList.add(4);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("=================================");
        System.out.println("查找元素11的索引：" + Collections.binarySearch(arrayList,11));
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        System.out.println("=================================");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        System.out.println("=================================");
        System.out.println("最大值：" + Collections.max(arrayList));
        System.out.println("最小值：" + Collections.min(arrayList));
        System.out.println("=================================");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("dog");
        arr.add("cat");
        arr.add("rabbit");
        arr.add("bird");
        Collections.sort(arr, (a, b) -> a.length() - b.length());
        System.out.println(arr);
    }
}
