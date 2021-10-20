import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi:");
        String val1 = scanner.nextLine();

        String rev = new StringBuilder(val1).reverse().toString();

        if(val1.equals(rev)) System.out.println("Polindrom");
        else System.out.println("Polindrom degil");

        scanner.close();
    }
}