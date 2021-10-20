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
        System.out.print("Liste buyuklugunu yaz: ");
        int sz = scanner.nextInt();

        for(int i=0; i<sz; i++){
            System.out.print(i+". indeksli sayi: ");
            int temp = scanner.nextInt();
            arr1.add(temp);
        }

        Collections.sort(arr1);

        System.out.println(arr1);

        scanner.close();
    }
}