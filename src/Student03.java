package Day01.src;

public class Student03 {
    private String name;
    private int age;
    private String gender;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public Student03(){
        this("沈星回",23,"男");
    }
    public Student03(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public static void doSome(){
        System.out.println("doSome");
        Student03 stu3 = new Student03();
    }
    public void doOther(){
        doSome();
        System.out.println("doOther");
    }
}
