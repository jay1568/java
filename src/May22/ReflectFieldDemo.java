package Day01.src.May22;

import java.lang.reflect.Field;

public class ReflectFieldDemo {
    public static void main(String[] args) throws Exception {
        // 1. 获取 Class 对象（同包下直接用类名）
        Class<?> studentCls = Class.forName("Day01.src.May22.Student");

        // 2. 获取所有声明的字段
        Field[] fields = studentCls.getDeclaredFields();
        System.out.println("所有声明的字段：");
        for (Field f : fields) {
            System.out.println(f.getName() + " - " + f.getType());
        }

        // 3. 获取 name 字段并设置为可访问
        Field nameField = studentCls.getDeclaredField("name");
        nameField.setAccessible(true);

        // 4. 创建 Student 对象实例
        Student stu = (Student) studentCls.getDeclaredConstructor().newInstance();

        // 5. 给字段赋值（第一个参数是对象实例 stu）
        nameField.set(stu, "张三");

        Field ageField = studentCls.getField("age");
        ageField.set(stu, 20);  // age 是 int，直接传 20

        // 6. 输出对象
        System.out.println("反射赋值后的对象：" + stu);
    }
}