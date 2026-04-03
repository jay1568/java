package Day01.src;

public class CaculatorDemo {
    public int Add(int a, int b){
        return a+b;
    }
    public int Subtract(int a,int b){
        return a-b;
    }
    public int Mul(int a,int b){
        return a*b;
    }
    public double Divide(double a,double b){
        return a/b;
    }

    public static void main(String[] args) {
        CaculatorDemo calc = new CaculatorDemo();

        System.out.println(calc.Add(10,5));
        System.out.println(calc.Subtract(10,5));
        System.out.println(calc.Mul(10,5));
        System.out.println(calc.Divide(10,5));
    }
}
