package Day01.src;

public class Student03Test {
    public static void main(String[] args) {
        Student03 stu1 = new Student03();
        System.out.println(stu1.getName()+","+stu1.getAge()+","+stu1.getGender());

        Student03 stu2 = new Student03("光猎",23, "男");
        System.out.println(stu2.getName()+","+stu2.getAge()+","+stu2.getGender());

        Student03.doSome();
        stu1.doOther();
    }
}
