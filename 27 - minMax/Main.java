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
        System.out.println("Girilecek deger adedi: ");
        int amounth = scanner.nextInt();

        for(int i=1; i<=amounth; i++){
            System.out.println(i+". deger:");
            int temp = scanner.nextInt();
            arr1.add(temp);
        }

        Collections.sort(arr1);
        System.out.println("En kucuk deger: " + arr1.get(0));
        System.out.println("En buyuk deger: " + arr1.get(arr1.size()-1));

        scanner.close();
    }
}