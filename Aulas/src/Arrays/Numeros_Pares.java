package Arrays;

import java.util.Scanner;

public class Numeros_Pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES: ");

        int qdte= 0;
        for(int i=0; i<n; i++){
            if (vect[i] % 2 == 0){
                System.out.print(vect[i] + "  ");
                qdte++;
            }
            }

        System.out.printf("\n\nQUANTIDADE DE PARES %1d", qdte);
        sc.close();


    }
}
