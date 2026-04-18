package Day01.src;

public final class FinalClass {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void show() {
        System.out.println("final类中的方法，name = " + name);
    }
}
