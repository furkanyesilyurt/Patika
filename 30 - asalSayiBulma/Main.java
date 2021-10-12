/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        for(int i=2; i<=100; i++){
            asalCheck(i);
        }
        

    }
    public static void asalCheck(int sayi1) {
        int kalan;
        if (sayi1 >= 2) {

            for (int a = 2; a <= sayi1; a++) {
                kalan = sayi1 % a;
                if (kalan == 0 && sayi1 != a) {
                    //System.out.println("Bu sayi asal degildir. " +sayi1);
                    break;
                } else if (kalan == 0 && sayi1 == a){
                    System.out.print(sayi1 + " ");
                }
            }

        } else if (sayi1 == 0 || sayi1 == 1) {
            //System.out.println("Bu sayi icin asal kontrolü yapılamaz! " + sayi1);
        } else if (sayi1 < 0) {
           // System.out.println("Eksi sayilar icin asal kontrolü yapılamaz! " + sayi1);
        } else {
           // System.out.println("Gecersiz giris yapildi! " + sayi1);
        }
    }

}