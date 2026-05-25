public class CombineDemo {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 60, 45};

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                System.out.println("第" + (i+1) + "个分数" + scores[i] + "：及格");
            } else {
                System.out.println("第" + (i+1) + "个分数" + scores[i] + "：不及格");
            }
        }
    }
}