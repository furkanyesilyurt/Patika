import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("n: ");
        int n = scanner.nextInt();
        System.out.println("r: ");
        int r = scanner.nextInt();

        double komb = kombinasyon(n, r);

        System.out.println(komb);

        scanner.close();
    }

    public static double kombinasyon(int n, int r){
        
        int nfact=1, rfact=1, nrfact=1;
        double komb;

        for(int i=1; i<=n; i++) nfact *= i;
        for(int i=1; i<=r; i++) rfact *= i;
        for(int i=1; i<=(n-r); i++) nrfact *= i;

        int i = rfact*nrfact;
        double d=i;

        komb= nfact / i;

        return komb;
    }
}