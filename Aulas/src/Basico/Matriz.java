package Basico;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal");
        int cont = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
               if (i == j){
                   System.out.print(mat[i][j] + " ");
                   }
                if (mat[i][j] < 0){
                    cont++;
               }
            }
        }
        System.out.println();
        System.out.print("Negative number " + cont);
        sc.close();

    }
}
