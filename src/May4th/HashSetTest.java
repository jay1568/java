package Day01.src.May4th;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1,"张三"));
        set.add(new Student(1,"李四"));
        System.out.println("集合大小：" + set.size());
        for(Student s : set){
            System.out.println(s);
        }
    }
}
