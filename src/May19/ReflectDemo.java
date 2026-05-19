package Day01.src.May19;

import java.util.Date;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 1. 方式一：Class.forName()
        Class<?> clazz1 = Class.forName("java.lang.String");
        System.out.println("方式一（Class.forName）：" + clazz1.getName());

        // 2. 方式二：对象.getClass()
        String str = "hello";
        Class<?> clazz2 = str.getClass();
        System.out.println("方式二（对象.getClass）：" + clazz2.getName());

        // 3. 方式三：类名.class
        Class<?> clazz3 = String.class;
        System.out.println("方式三（类名.class）：" + clazz3.getName());

        // 4. 通过反射实例化 Date 对象
        Class<?> dateClass = Class.forName("java.util.Date");
        Date date = (Date) dateClass.getDeclaredConstructor().newInstance();
        System.out.println("反射创建 Date 对象：" + date);
    }
}
