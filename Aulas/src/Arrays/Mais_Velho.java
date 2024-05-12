package Arrays;

import java.util.Scanner;

public class Mais_Velho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] vetor = new String[n];
        int[] vetorB = new int[n];

        for(int i=0; i<n; i++){
            System.out.printf("Dados da %1da pessoa\n", i+1);
            System.out.print("Nome: ");
            vetor[i] = sc.next();
            System.out.print("Idade: ");
            vetorB[i] = sc.nextInt();
        }
        int maisVelho = 0;
        int maiorIdade = vetorB[0];

        for(int i=1; i<n; i++){
            if (vetorB[i] > maiorIdade){
                maiorIdade = vetorB[i];
                maisVelho = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+ vetor[maisVelho]);
    }
}
