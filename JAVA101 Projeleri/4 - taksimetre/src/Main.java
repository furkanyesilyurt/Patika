import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac km yolculuk yapildi?");
        double road = scanner.nextDouble();
        scanner.close();

        double tutar = road * 2.20 + 10;
        if(tutar<20){
            System.out.println("Odenecek tutar: 20.0");
        } else {
            System.out.println("Odenecek tutar: " + tutar);
        }
    }
}
