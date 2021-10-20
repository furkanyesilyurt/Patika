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
        System.out.println("Sıralanacak veri buyuklugunu giriniz: ");
        int len = scanner.nextInt();

        for(int i=0; i<len; i++){
            System.out.println(i+". indeksli sayi: ");
            int temp = scanner.nextInt();
            arr1.add(temp);            
        }

        System.out.println("==============================");

        Collections.sort(arr1);
        Collections.reverse(arr1);
        
        System.out.println(arr1);

        scanner.close();
    }
}