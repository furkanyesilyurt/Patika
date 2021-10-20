/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        say(11);
    }

    static int say(int a){

        System.out.print(a + " ");
        if(a <= 0) return a;
        say(a-5);
        System.out.print(a + " ");
        return a;
    }
}