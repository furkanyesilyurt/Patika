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
        System.out.println("Yildiz buyuklugu giriniz: ");
        int siz = scanner.nextInt();

        System.out.println("====================");

        for(int i=1; i<=siz; i++){
            if(i%2==1) arr1.add(i);
        }


        for(int arr : arr1){
            for(int t=1; t<=arr1.size()-arr1.indexOf(arr);t++){
                System.out.print(" ");
            }
            for(int y=1; y<=arr; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        Collections.reverse(arr1);
        arr1.remove(0);

        for(int arr : arr1){
            for(int t=-1; t<=arr1.indexOf(arr);t++){
                System.out.print(" ");
            }
            for(int y=1; y<=arr; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
                   
        scanner.close();
    }
}