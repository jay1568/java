package Day01.src.April19th;

public class Person {
    protected String name;
    public Person(){
        System.out.println("Person无参构造");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("Person有参构造：名字是" + name);
    }
    public void showInfo() {
        System.out.println("父类的showInfo方法，name = " + name);
    }
}
