public class LoopDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("for: "+ i);
        }

        int j = 1;
        while (j <= 10){
            System.out.println("while: "+ j);
            j++;
        }

        int k = 1;
        do {
            System.out.println("do-while: " + k);
            k++;
        } while (k<=10);
    }
}
