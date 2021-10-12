import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut kac kilo?");
        float armut = scanner.nextFloat();
        System.out.println("elma kac kilo?");
        float elma = scanner.nextFloat();
        System.out.println("domates kac kilo?");
        float domates = scanner.nextFloat();
        System.out.println("muz kac kilo?");
        float muz = scanner.nextFloat();
        System.out.println("patlıcan kac kilo?");
        float patlican = scanner.nextFloat();

        scanner.close();

        double a = armut * 2.14;
        double e = elma * 3.67;
        double d = domates * 1.11;
        double m = muz * 0.95;
        double p = patlican * 5;
        double total = a + e + d + m + p;

        System.out.println("Armut: " + a);
        System.out.println("Elma: " + e);
        System.out.println("Domates: " + d);
        System.out.println("Muz: " + m);
        System.out.println("Patlican: " + p);
        System.out.println("Total: " + total);
    }
}
