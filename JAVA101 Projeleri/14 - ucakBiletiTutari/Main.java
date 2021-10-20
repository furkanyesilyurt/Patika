import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi giriniz(km):");
        int mes = scanner.nextInt();
        System.out.println("Yolcunun yasini giriniz:");
        int yas = scanner.nextInt();
        System.out.println("Yolculuk türünü giriniz(1-tek gidis/2-gidis donus):");
        int tur = scanner.nextInt();

        double mesTotal = mes * 0.1;

        if(yas<12) mesTotal = mesTotal*0.5;
        else if(yas>=12 && yas<24) mesTotal = mesTotal*0.9;
        else if(yas>=65) mesTotal = mesTotal*0.7;

        if(tur==2) mesTotal = (mesTotal*0.8)*2;
        
        System.out.println("Bilet tutariniz: " + mesTotal);

        scanner.close();

    }
}