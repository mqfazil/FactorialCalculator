public class Main {
    public static void main(String[] args) {
        System.out.println("The factorial of 5 = " + fact(5));
        System.out.println("The fibonacci of 5 = " + fib(5));
        System.out.println("The number of zeros are = " + numberOfZeros(500));
    }
    public static int fact(int n){ // factorial calc
        System.out.println("The current n value = " + n);
        if (n==1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
    public static int fib(int n){ // fibonacci calc
        System.out.println("The current n value = " + n);
        if (n== 2 || n == 1) {
            return 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static int numberOfZeros(int n){
        int zeroCount;
        if (n==0)
            zeroCount = 1;
        else if (n < 10) // and not 0
            zeroCount = 0; // 0 for no zeros
        else if (n%10 == 0)
            zeroCount = numberOfZeros(n/10) + 1;
        else // n%10 != 0
            zeroCount = numberOfZeros(n/10);
        return zeroCount;
    }
}
