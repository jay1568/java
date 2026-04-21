package Day01.src.Apri21th;

public class Test {
    public static void main(String[] args) {
        Usb mouse = new Mouse();
        mouse.connect();
        Usb keyb = new Keyboard();
        keyb.connect();
    }
}
