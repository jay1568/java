package Day01.src.May6th;

import java.util.HashSet;
import java.util.TreeSet;

public class SetRecall {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
        TreeSet<String> set1 = new TreeSet();
        set1.add("B");
        set1.add("A");
        set1.add("C");
        System.out.println(set1);
        TreeSet<Integer> set2 = new TreeSet();
        set2.add(5);
        set2.add(2);
        set2.add(8);
        set2.add(1);
        set2.add(9);
        System.out.println(set2);
    }
}
