import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("A sayisi: ");
        int a = scanner.nextInt();
        System.out.println("B sayisi: ");
        int b = scanner.nextInt();

        for(int i=2; i<a; i++){
            if(a%i==0) arr1.add(i);
        }

        for(int i=2; i<b; i++){
            if(b%i==0) arr2.add(i);
        }
        
        //EBOB
        for(int arra : arr1){
            for(int arrb : arr2){
                if(arra == arrb) arr3.add(arra);
            }
        }
        int ebob = arr3.get(arr3.size()-1);
        System.out.println("Ebob: " + ebob);

        //EKOK
        System.out.println("Ekok: " + (a*b)/ebob);


        scanner.close();
    }
}