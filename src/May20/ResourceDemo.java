package Day01.src.May20;

import java.util.ResourceBundle;

public class ResourceDemo {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        System.out.println(bundle.getString("url"));
        System.out.println(bundle.getString("username"));
        System.out.println(bundle.getString("password"));
    }
}