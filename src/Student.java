package Day01.src;

public class Student {
    String name;
    int age;
    String gender;
    int num;

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 20;
        stu1.gender = "男";
        stu1.num = 2024001;
        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 19;
        stu2.gender = "女";
        stu2.num = 2024002;

        System.out.println(stu1.name+","+stu1.age+","+stu1.gender+","+stu1.num);
        System.out.println(stu2.name+","+stu2.age+","+stu2.gender+","+stu2.num);
    }

}
