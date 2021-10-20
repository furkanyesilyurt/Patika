import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int a = scanner.nextInt();
        int bas=0 ,top = 0;

        while(a != 0){
            top += a%10;
            a /= 10;
            bas++;
        }

        System.out.println(top);

        scanner.close();
    }
}