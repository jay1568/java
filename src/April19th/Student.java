package Day01.src.April19th;

public class Student extends Person{
    private int id;
    public Student(String name,int id){
        super(name);
        this.id =id;
        System.out.println("Student 有参构造：name = " + name + "id = " + id);
    }
    public void test() {
        super.showInfo();
        System.out.println("子类的test方法，id = " + id);
    }
}
