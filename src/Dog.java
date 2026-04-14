package Day01.src;
//子类
public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println(name + "正在吃骨头");
    }

    public void bark(){
        System.out.println(name + "汪汪叫");
    }
}
