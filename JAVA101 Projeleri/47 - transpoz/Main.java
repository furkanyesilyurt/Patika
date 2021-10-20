/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int[][] dizi1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] dizi2 = new int[3][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(dizi1[i][j] + " ");
            }
            System.out.println("");
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                dizi2[j][i] = dizi1[i][j];
            }
        }

        System.out.println("==============================");
        
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(dizi2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}