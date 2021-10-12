import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tutar giriniz: ");
        double tutar = scanner.nextDouble();

        if (tutar >= 0 && tutar <= 1000) {
            double kdvwith = tutar * 1.18;
            double kdv = tutar * 0.18;
            System.out.println("KDV'siz Fiyat: " + tutar + "\nKDV'li Fiyat: " + kdvwith + "\nKDV Tutarı: " + kdv);
        } else if (tutar>1000) {
            double kdvwith = tutar * 1.08;
            double kdv = tutar * 0.08;
            System.out.println("KDV'siz Fiyat: " + tutar + "\nKDV'li Fiyat: " + kdvwith + "\nKDV Tutarı: " + kdv);
        } else {
            System.out.println("Gecersiz tutar girdiniz.");
        }
    }
}
