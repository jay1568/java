package Day01.src.May2nd;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setContent("Hello");
        System.out.println(box1.getContent());

        Box<Integer> box2 = new Box<>();
        box2.setContent(100);
        System.out.println(box2.getContent());
    }

}
