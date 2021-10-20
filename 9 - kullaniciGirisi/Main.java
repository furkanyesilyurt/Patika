import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        String userName = "furkan";
        String password = "patikajava101";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz: ");
        String girilenUser = scanner.nextLine();
        System.out.println("Sifrenizi giriniz: ");
        String girilenPwd = scanner.nextLine();

        System.out.println("==============================");

        if(girilenUser.equals(userName) && girilenPwd.equals(password)){

            System.out.println("Basarili giris yaptiniz.");

        } else {

            System.out.println("Giris bilgileri dogrulanamadi.\nParolayi degistirmek ister misiniz?(Y/N)");
            String yn = scanner.nextLine();

            if(yn.equals("y") || yn.equals("Y")){
                
                System.out.println("Yeni sifreyi giriniz: ");
                String tempPwd = scanner.nextLine();

                if(tempPwd.equals(password)){
                    System.out.println("Sifre eski sifre ile ayni olamaz.");
                } else {
                    password = tempPwd;
                    System.out.println("Sifre degistirildi");
                }

            } else {
                System.out.println("Sifre degistirilmedi");
            }
        }




        scanner.close();
    }
}