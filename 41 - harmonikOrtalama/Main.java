import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi gir: ");
        int a = scanner.nextInt();
        double toplam = 0;

        for(double i=1; i<=a; i++){
            toplam += 1.0/i;
        }
        System.out.println(a/toplam);
        scanner.close();

    }
}