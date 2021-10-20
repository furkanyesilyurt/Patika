import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> rep = new ArrayList<>();
        int tempi,tempj;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Liste buyuklugunu yaz: ");
        int sz = scanner.nextInt();

        for(int i=0; i<sz; i++){
            System.out.print(i+". indeksli sayi: ");
            int temp = scanner.nextInt();
            arr1.add(temp);
        }

        Collections.sort(arr1);

        System.out.println("Dizi: " + arr1);

        for(int i=0; i<arr1.size(); i++){
            tempi = arr1.get(i);
            for(int j=i+1; j<arr1.size(); ){
                tempj = arr1.get(j);
                if(tempi==tempj && rep.indexOf(tempi)<0) rep.add(tempi); break;
            }

        }
        
        System.out.println(rep);

        scanner.close();
    }
}