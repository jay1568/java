package Day01.src;

public class ArrayUtil {
   public int getMax(int[] arr){
       int max = arr[0];
       for (int i = 1; i < arr.length;i++){
           if(arr[i] > max)
               max = arr[i];
       }
       return max;
   }
   public int getMin(int[] arr){
       int min = arr[0];
       for (int i = 1; i < arr.length;i++){
           if(arr[i] < min)
               min = arr[i];
       }
       return min;
   }
   public  int getSum(int[] arr){
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       return sum;
   }
   public  double getAverage(int[] arr){
       double sum = 0;
       double average;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       average = sum/arr.length;
       return average;
   }
   public boolean contains(int[] arr,int x){
       for (int i = 0; i < arr.length; i++) {
           if(x == arr[i]){
               return true;
           }
       }
       return false;
   }

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr1 = {12,5,6,9,58};
        System.out.println("最大值为："+util.getMax(arr1));
        System.out.println("最小值为："+util.getMin(arr1));
        System.out.println("总和为："+util.getSum(arr1));
        System.out.println("平均值为："+util.getAverage(arr1));
        System.out.println("是否包含58："+util.contains(arr1,58));
    }
}
