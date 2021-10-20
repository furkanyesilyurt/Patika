import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liste buyuklugu:");
        int sz = scanner.nextInt();
        System.out.println("Girilen sayi:");
        int in = scanner.nextInt();

        for(int i=1; i<=sz; i++){
            System.out.print(i+". indeksli veri:");
            int temp = scanner.nextInt();
            arr1.add(temp);
        }

        Collections.sort(arr1);
        System.out.println("Dizi: "+ arr1);

        for(int arr : arr1){
            if(arr<in){
                min.add(arr);
            }
            if(arr>in){
                max.add(arr);
            }
        }

            System.out.println("Girilen sayidan küçük en yakin sayi: " + min.get(min.size()-1));
            System.out.println("Girilen sayidan büyük en yakin sayi: " + max.get(0));

        scanner.close();
    }
}