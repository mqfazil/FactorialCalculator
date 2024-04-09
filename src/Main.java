public class Main {
    public static void main(String[] args) {
        System.out.println("The factorial of 5 = " + fact(5));
    }
    public static int fact(int n){
        System.out.println("The current n value = " + n);
        if (n==1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}