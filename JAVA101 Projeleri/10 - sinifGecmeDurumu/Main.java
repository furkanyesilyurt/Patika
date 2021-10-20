import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> notes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik dersi sınav notunuzu giriniz: ");
        int matNote = scanner.nextInt();
        if(matNote>=0 && matNote<=100) notes.add(matNote);
        else System.out.println("Gecersiz not girildi.");

        System.out.println("Fizik dersi sınav notunuzu giriniz: ");
        int fizikNote = scanner.nextInt();
        if(fizikNote>=0 && fizikNote<=100) notes.add(fizikNote);
        else System.out.println("Gecersiz not girildi.");

        System.out.println("Kimya dersi sınav notunuzu giriniz: ");
        int kimyaNote = scanner.nextInt();
        if(kimyaNote>=0 && kimyaNote<=100) notes.add(kimyaNote);
        else System.out.println("Gecersiz not girildi.");

        System.out.println("Turkce dersi sınav notunuzu giriniz: ");
        int turkceNote = scanner.nextInt();
        if(turkceNote>=0 && turkceNote<=100) notes.add(turkceNote);
        else System.out.println("Gecersiz not girildi.");

        System.out.println("Tarih dersi sınav notunuzu giriniz: ");
        int tarihNote = scanner.nextInt();
        if(tarihNote>=0 && tarihNote<=100) notes.add(tarihNote);
        else System.out.println("Gecersiz not girildi.");

        System.out.println("Müzik dersi sınav notunuzu giriniz: ");
        int muzikNote = scanner.nextInt();
        if(muzikNote>=0 && muzikNote<=100) notes.add(muzikNote);
        else System.out.println("Gecersiz not girildi.");

        System.out.println("================================================");

        ortalamaHesaplama(notes);

        scanner.close();

    }

    public static void ortalamaHesaplama(ArrayList<Integer> notes) {
        int total = 0;
        for(int note : notes){
            total += note;
        }
        int ort = total / notes.size();
        boolean flag = ort >= 55;
        System.out.println("Başarı durumu: " + (flag==true ? "Sınıfı Geçti. " + ort : "Sınıfta Kaldı. " + ort));
    }
}
