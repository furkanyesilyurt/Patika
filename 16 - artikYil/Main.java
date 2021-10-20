import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yili giriniz: ");
        int year = scanner.nextInt();

        if(year%100==0 && (year/100)%4!=0) System.out.println("Artik yil degildir: " +year);
        else if (year%4==0) System.out.println("Artik yildir: " + year);
        else System.out.println("Artik yil degildir: " +year);

        scanner.close();
    }
}