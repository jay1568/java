package Day01.src;

public class Student02Test {
    public static void main(String[] args) {
        Student02 stu = new Student02();
        stu.setName("沈星回");
        stu.setAge(23);
        stu.setGender("男");
        stu.setNum(230210221);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getGender());
        System.out.println(stu.getNum());
    }
}
