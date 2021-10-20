import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak: ");
        int i = scanner.nextInt();
        for(int j=0; j<=i; j++){
            System.out.print(fib(j)+" ");
        }
        scanner.close();
    }

    public static int fib(int n){       
        if(n==1 || n==2) return 1;
        else if(n==0) return 0;
        return fib(n-1) + fib(n-2);
    }
}