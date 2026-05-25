package Day01.src.May3rd;

import java.util.HashMap;
import java.util.Set;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashSet<String> hash= new HashSet<>();
        hash.add("B");
        hash.add("A");
        hash.add("C");
        hash.add("B");
        System.out.println(hash);
        System.out.println("============================");
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(5);
        tree.add(1);
        tree.add(4);
        tree.add(2);
        tree.add(3);
        System.out.println(tree);
        System.out.println("============================");
        HashMap<String,Integer> map = new HashMap<>();
        map.put("张三" ,20);
        map.put("李四",21);
        map.put("王五",19);
        Set<String> set = map.keySet();
        for(String key : set) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("============================");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
