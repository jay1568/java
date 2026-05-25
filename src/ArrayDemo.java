public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println("遍历数组：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i +"]=" + arr1[i]);
        }
        arr1[0] = 99;
        System.out.println("修改后第一个元素：" + arr1[0]);

        int[] arr2 = new int[3];
        arr2[0] = 100;
        arr2[1] = 200;
        arr2[2] = 300;
        System.out.println("arr2的第二个元素：" + arr2[1]);
    }
}
