package Day01.src;

public class Student {
    String name;
    int age;
    public void study(){
        System.out.println(name + "正在学习");
    }
    public void introduce(){
        System.out.println("我是" + name +"，今年" + age +"岁");
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 18;
        stu.introduce();
        stu.study();
    }

}
