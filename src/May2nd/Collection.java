package Day01.src.May2nd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Collection {
    public static void main(String[] args) {
        int sum = 0;
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        System.out.println(vector);

        System.out.println("=========================");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            sum = sum + it.next();
        }
        System.out.println(sum);

        System.out.println("==========================");
        int[] arr1 = {1,2,3,4,5};
        for(int data: arr1){
            System.out.println(data);
        }
    }
}
