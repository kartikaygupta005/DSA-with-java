import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] m3 = new int[3][3];
        for(int i = 0 ; i < 3 ;i++){
            for(int j = 0 ; j < 3 ; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < 3 ;i++){
            for(int j = 0 ; j < 3 ; j++){
                m2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0  ; j < 3 ; j++){
                m3[i][j] = 0;
                for(int k = 0 ; k < 3 ; k++){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0  ; j < 3 ; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
