package ExercicioEstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Escreva numero inteiro");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
        sc.close();
    }
}
