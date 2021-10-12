import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int inputNumber;
        System.out.println("Bir sayi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String inputKey = scanner.nextLine();
        try {
            inputNumber = Integer.parseInt(inputKey);
            perfectNumber(inputNumber);
        } catch (Exception exception) {
            System.out.println("Hata: " + exception);
        }

    }

    public static void perfectNumber(int number1){
        int remainder, total=0;
        ArrayList<Integer> remainders = new ArrayList<Integer>();

        if(number1 <= 0){
            System.out.println("Gecersiz sayi girdiniz! " + number1);
            return;
        }

        for(int a=1; a<number1; a++){
            if(number1 % a == 0){
                remainders.add(a);
            }
        }

        for(int rem : remainders){
            total += rem;
        }

        if (total == number1){
            System.out.println("Girilen sayi mükemmel sayidir. " + number1);
        } else {
            System.out.println("Girilen sayi mükemmel sayi degildir. " + number1);
        }
    }
}
