package Day01.src.April30th;

import java.util.ArrayList;

public class ListMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("B");
        arr.add("D");
        System.out.println(arr);

        System.out.println("==========================");
        System.out.println(arr.get(2));
        arr.set(3,"X");
        System.out.println(arr);
        System.out.println("============================");
        System.out.println(arr.indexOf("B"));
        System.out.println(arr.lastIndexOf("B"));
        System.out.println(arr.subList(1,4));
    }
}
