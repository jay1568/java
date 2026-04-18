package Day01.src.April18th;

public class Student extends Person{
    int id;
    public Student(){
        super();
        System.out.println("Student 无参构造");
    }

    public Student(String name, int id){
        super(name);
        this.id = id;
        System.out.println("Student 有参构造：" + name + id);
    }
}
