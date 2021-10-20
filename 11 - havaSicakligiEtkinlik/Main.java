import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava sıcakligini giriniz: ");
        int heat = scanner.nextInt();

        if(heat<5) System.out.println("Kayak yapabilirsiniz.");
        else if (heat<=15) System.out.println("Sinemaya gidebilirsiniz.");
        else if (heat<=25) System.out.println("Pikniğe gidebilirsiniz.");
        else System.out.println("Yüzmeye gidebilirsiniz:");

        scanner.close();

    }
}