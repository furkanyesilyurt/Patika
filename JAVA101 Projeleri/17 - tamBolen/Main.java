import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Son degeri giriniz: ");
        int end = scanner.nextInt();
        int toplam=0;

        for (int i=1; i<=end; i++){
            if(i%3==0 || i%4==0) arr1.add(i);
        }

        System.out.println(arr1);

        for(int arr : arr1) toplam += arr;
        
        System.out.println("Ortalama: " + toplam/arr1.size());

        scanner.close();
    }
}