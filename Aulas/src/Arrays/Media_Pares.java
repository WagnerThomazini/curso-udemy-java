package Arrays;

import java.util.Scanner;

public class Media_Pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vetor[i]= sc.nextInt();
        }
        double media = 0;
        int cont = 0;
        for(int i=0; i<n; i++) {
            if (vetor[i] % 2 ==0) {
                media += vetor[i];
                cont++;

            }

        }
        if (media > 0){
            System.out.printf("MÉDIA DOS PARES = %.1f", media/cont);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
