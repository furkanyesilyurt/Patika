import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
                
        ArrayList<Integer> arr1 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int end = scanner.nextInt();

        for(int i=4; i<=end; i*=4) arr1.add(i);
        for(int i=5; i<=end; i*=5) arr1.add(i);
        
        Collections.sort(arr1);
        System.out.println(arr1);

        scanner.close();
    }
}