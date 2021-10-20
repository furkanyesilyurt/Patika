import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        float boy = 0, kilo=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz(m): ");
        boy = scanner.nextFloat();
        System.out.println("Kilonuzu giriniz(kg): ");
        kilo = scanner.nextFloat();
        scanner.close();

        System.out.println("Vücut indeksiniz: " + kilo / pow(boy,2));

    }
}
