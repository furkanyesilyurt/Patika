import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double pi = 3.14, r, a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaricap degerini giriniz: ");
        r = scanner.nextDouble();
        System.out.println("Aci degerini giriniz: ");
        a = scanner.nextDouble();
        scanner.close();

        double alan = alanHesaplama(pi, r, a);
        double cevre = cevreHesaplama(pi, r, a);

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);
    }

    public static double alanHesaplama(double pi, double r, double a) {
        return pi * r * r * a / 360;
    }

    public static double cevreHesaplama(double pi, double r, double a) {
        return 2 * pi * r * a / 360;
    }
}
