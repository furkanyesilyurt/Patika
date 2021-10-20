import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int [] dizi = new int[]{10,20,20,10,10,20,5,20,20,20,20};
        int tempi, tempj,rep;

        for(int i=0; i<dizi.length; i++){
            rep =1;
            tempi = dizi[i];
            for(int j=i+1; j<dizi.length; j++){
                tempj = dizi[j];
                if(tempi==tempj){
                    rep++;
                }
            }
            if (rep>1 && dizi[i + 1] != dizi[i])  {
                System.out.println(dizi[i] + " sayısı " + rep + " kere tekrar edildi");
            }
            if(rep!=1) i += rep-1; 
        }

    }
}