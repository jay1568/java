public class IfDemo {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90){
            System.out.println("优秀");
        }
        else if (score >= 60){
            System.out.println("及格");
        }
        else{
            System.out.println("不及格");
        }

        int day = 3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tudeday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("others");
        }
    }
}
