package Day01.src.April18th;

public class Person01 {
    private int id = 1;           // private
    String name = "张三";          // default（不写任何修饰符）
    protected int age = 23;       // protected
    public String gender = "男";   // public

    public void show() {
        System.out.println("=== 本类内部 ===");
        System.out.println("private id: " + id);
        System.out.println("default name: " + name);
        System.out.println("protected age: " + age);
        System.out.println("public gender: " + gender);
    }
}