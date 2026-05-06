package Day01.src.May6th;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRecall {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("张三",20);
        map.put("李四",21);
        map.put("王五",19);
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + "=" + map.get(key));
        }
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        map.put("张三",25);
        System.out.println("修改后的张三年龄：" + map.get("张三"));
    }
}
