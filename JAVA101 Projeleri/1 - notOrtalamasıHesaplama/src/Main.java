import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik dersi sınav notunuzu giriniz: ");
        int matNote = scanner.nextInt();
        System.out.println("Fizik dersi sınav notunuzu giriniz: ");
        int fizikNote = scanner.nextInt();
        System.out.println("Kimya dersi sınav notunuzu giriniz: ");
        int kimyaNote = scanner.nextInt();
        System.out.println("Turkce dersi sınav notunuzu giriniz: ");
        int turkceNote = scanner.nextInt();
        System.out.println("Tarih dersi sınav notunuzu giriniz: ");
        int tarihNote = scanner.nextInt();
        System.out.println("Müzik dersi sınav notunuzu giriniz: ");
        int muzikNote = scanner.nextInt();

        System.out.println("================================================");

        ortalamaHesaplama(matNote, fizikNote, kimyaNote, turkceNote, tarihNote, muzikNote);

    }

    public static void ortalamaHesaplama(int matNote, int fizikNote, int kimyaNote, int turkceNote, int tarihNote, int muzikNote) {
        int ort = (matNote + fizikNote + kimyaNote + turkceNote + tarihNote + muzikNote) / 6;
        boolean flag = ort >= 60;
        System.out.println("Başarı durumu: " + (flag==true ? "Sınıfı Geçti." : "Sınıfta Kaldı."));
    }
}
