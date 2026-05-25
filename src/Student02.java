package Day01.src;

public class Student02 {
    private int num;
    private String name;
    private int age;
    private String gender;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 130){
            System.out.println("The age is invalid");
        }else {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student02(){
    }
    public Student02(String name,int age,String gender,int num){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.num = num;
    }
}
