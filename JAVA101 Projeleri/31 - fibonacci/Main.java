import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci dizisi kac katmanli: ");
        int kat = scanner.nextInt();

        System.out.println("");

        int [] fibDizi = new int[kat+2];
        fibDizi[0]=0;
        fibDizi[1]=1;

        for(int i=2; i<=kat; i++){
            fibDizi[i] = fibDizi[i-1] + fibDizi[i-2];
        }
         
        for(int i=0;i<fibDizi.length-1;i++){
            System.out.println(fibDizi[i]);
        }

        scanner.close();

    }
}