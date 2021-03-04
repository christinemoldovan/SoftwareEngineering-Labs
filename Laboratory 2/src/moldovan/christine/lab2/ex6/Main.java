package moldovan.christine.lab2.ex6;

public class Main {
    //recursive
    public static void main(String[] args) {
        long num = 20;

        long factorial = recursiveFactorial(num);
        long nonFactorial = factorial(num);
        System.out.println("Recursive factorial of " + num + " = " + factorial);
        System.out.println("Non recursive factorial of " + num + " = " + nonFactorial);

    }

    public static long recursiveFactorial(long num) {
        if (num < 0) {
            return 1;
        }
        if (num >= 1)
            return num * recursiveFactorial(num - 1);
        else
            return 1;
    }

    //non-recursive
    public static long factorial(long n) {
        if (n < 0) {
            return 1;
        }
        long f = 1;
        for (long i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
