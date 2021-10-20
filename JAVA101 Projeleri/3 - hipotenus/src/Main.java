import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin a kenar uzunluğunu giriniz : ");
        double a = scanner.nextDouble();
        System.out.println("Üçgenin b kenar uzunluğunu giriniz : ");
        double b = scanner.nextDouble();
        scanner.close();
        
        if (a>0 && b>0){
            double hip = sqrt(pow(a,2) + pow(b,2));
            double area = a *b / 2;
            System.out.println("Hipotenus: " + hip + "\nAlan: " + area);
        } else {
            System.out.println("Gecersiz kenar uzunlugu girildi.");
        }

    }

    public static void main(String args[]) {
        System.out.println(run());
    }

    public static int run()
    {
        return 20;
    }
}
