import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int n=0, toplam=0;
        Scanner scanner = new Scanner(System.in);
        
        do{
            toplam += n;
            System.out.println("Bir sayi giriniz: ");
            n =  scanner.nextInt();
        } while(n%2==0);

        System.out.println("Girilen satilarin toplami: " +toplam);

        scanner.close();
    }
}