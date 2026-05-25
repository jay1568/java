package Day01.src;

public class Student02Test {
    public static void main(String[] args) {
        Student02 stu = new Student02();
        stu.setName("沈星回");
        stu.setAge(23);
        stu.setGender("男");
        stu.setNum(230210221);
        System.out.println(stu.getName()+" "+stu.getAge()+" "+stu.getGender()+" "+stu.getNum());
        System.out.println("有参构造");
        Student02 stu1 = new Student02("沈星回",23,"男",230210240);
        System.out.println(stu1.getName()+" "+stu1.getAge()+" "+stu1.getGender()+" "+stu1.getNum());
    }
}
