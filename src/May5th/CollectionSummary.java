package Day01.src.May5th;

import java.util.*;

public class CollectionSummary {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三",20);
        map.put("李四",21);
        map.put("王五",19);
        System.out.println("====================================");
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("====================================");
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        map.put("张三",25);
        System.out.println("修改后张三的年龄：" + map.get("张三"));

        System.out.println("====================================");
        HashMap<Student,String> map2 = new HashMap<>();
        map2.put(new Student(1,"张三"),"数学成绩");
        map2.put(new Student(1,"李四"),"英语成绩");
        System.out.println(map2.size());
        System.out.println("get(new Student(1, \"任意名字\")) = " + map2.get(new Student(1, "任意名字")));
        System.out.println("====================================");
        Properties properties = new Properties();
        properties.setProperty("username","admin");
        properties.setProperty("password","123456");
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println("====================================");
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(3,"王五"));
        set.add(new Student(1,"张三"));
        set.add(new Student(2,"李四"));
        for(Student s : set) {
            System.out.println(s);
        }
        System.out.println("====================================");
        TreeSet<Student> set2 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().length() - o1.getName().length();
            }

        });
        set2.add((new Student(2,"王小明")));
        set2.add((new Student(1,"李雷")));
        set2.add((new Student(3,"韩")));
        for (Student s : set2) {
            System.out.println(s);
        }
        System.out.println("====================================");
        System.out.println("=== Collections 工具类 ===");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("原始集合：" + list);
        Collections.sort(list);
        System.out.println("排序后：" + list);
        int index = Collections.binarySearch(list, 5);
        System.out.println("查找元素5的索引：" + index);
        Collections.reverse(list);
        System.out.println("反转后：" + list);
        System.out.println("最大值：" + Collections.max(list) + "，最小值：" + Collections.min(list));
    }

}
