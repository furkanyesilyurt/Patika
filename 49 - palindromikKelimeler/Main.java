import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String rawInput = scanner.nextLine();
        String reverseInput = "";

        for(int i=rawInput.length()-1;i>=0; i--){
            reverseInput += rawInput.charAt(i);
        }

        if(rawInput.equals(reverseInput)){
            System.out.println(reverseInput + " kelime Palindromik Kelime'dir");
        } else System.out.println(reverseInput + " kelime Palindromik Kelime değildir");


        scanner.close();
    }
}