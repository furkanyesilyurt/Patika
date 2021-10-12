import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk degeri giriniz: ");
        int val1 = scanner.nextInt();
        System.out.println("Ikinci degeri giriniz: ");
        int val2 = scanner.nextInt();

        double d1= val1;
        double d2= val2;

        System.out.println("==================================");

        System.out.println("1-Toplama"+"\n2-Cikarma"+"\n3-Carpma"+"\n4-Bolme");
        System.out.println("Secim yapiniz: ");
        int chs = scanner.nextInt();

        System.out.println("==================================");

        switch(chs){
            case 1:
                System.out.println("Islem sonucu: " + (val1+val2));
                break;
            case 2:
                System.out.println("Islem sonucu: " + (val1-val2));
                break;
            case 3:
                System.out.println("Islem sonucu: " + (val1*val2));
                break;
            case 4:
                if(val1<0 || val2<=0){
                    System.out.println("Bu bolme islemi yapilamaz");
                } else {
                    double bol = d1/d2;
                    System.out.println("Islem sonucu: " + bol);
                }
                break;
            default : System.out.println("Gecersiz islem sectiniz.");
        }

        scanner.close();
        
    }
}