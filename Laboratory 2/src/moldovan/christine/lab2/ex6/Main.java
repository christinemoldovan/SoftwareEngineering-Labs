package moldovan.christine.lab2.ex6;

public class Main {
    //recursive
    public static void main(String[] args) {
        int num = 5;
        long factorial = multiplyNumbers(num);
        long nonFactorial = factorial(num);
        System.out.println("Recursive factorial of " + num + " = " + factorial);
        System.out.println("Non recursive factorial of " + num + " = " +nonFactorial);

    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

    //non-recursive
   public static long factorial(int n) {
        int f = 1;
        for(int i=1;i<=n;i++) {
            f *= i;
        }
        return f;
    }
}
