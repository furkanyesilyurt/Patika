/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(usAlma(2, 7));
    }

    static int usAlma(int tbn, int us){
        if(tbn==0) return 0;
        else if (us==0) return 1;
        return tbn*usAlma(tbn, us-1);

    }
}