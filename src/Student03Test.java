package Day01.src;

public class Student03Test {
    public static void main(String[] args) {
        System.out.println("创建第一个对象：");
        Student03 stu1 = new Student03("沈星回",23,"男");

        System.out.println("创建第二个对象：");
        Student03 stu2 = new Student03("光猎",23,"男");

        System.out.println("验证静态变量");
        System.out.println("stu1看到的学校："+Student03.getSchoolName());
        System.out.println("stu2的学校："+Student03.getSchoolName());



    }
}
