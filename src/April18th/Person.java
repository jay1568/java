package Day01.src.April18th;

public class Person {
    String name;

    public Person() {
        System.out.println("Person 无参构造");
    }

   public Person(String name) {
        this.name = name;
       System.out.println("Person 有参构造：" +name);
   }
}
