import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        String userName = "furkan";
        String password = "root123";
        int select;
        int balance = 1500;
        int hak = 3;

        Scanner scanner = new Scanner(System.in);

        while(hak>0){

            System.out.println("Kullanici adi: ");
            String girilenName = scanner.nextLine();
            System.out.println("Sifre: ");
            String girilenPassword = scanner.nextLine();

            System.out.println(girilenName + "/" + girilenPassword);

            if(userName.equals(girilenName) && password.equals(girilenPassword)){
                System.out.println("PATIKA BANKASINA HOSGELDINIZ'");
    
                System.out.println("1-Para yatırma\n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgula\n" +
                                "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = scanner.nextInt();
    
                switch(select){
                    case 1: {
                        System.out.print("Para miktarı : ");
                        int price = scanner.nextInt();
                        balance += price;
                        break;
                    }
                    case 2:{
                        System.out.print("Para miktarı : ");
                        int price = scanner.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                        break;
                    }
                    case 3: System.out.println("Bakiyeniz : " + balance); break;
                    case 4: System.out.println("Tekrar görüşmek üzere."); break;
                    default: System.out.println("Gecersiz islem!"); break;
                }
    
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }

            }
        }

    }
}