import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alinacak sayi: ");
        int a = scanner.nextInt();
        System.out.println("Üs: ");
        int b = scanner.nextInt();

        int result=1;

        //System.out.println(Math.pow(a,b));

        for(int i=1; i<=b; i++) result *= a;

        System.out.println(result);
        
        scanner.close();
    }
}