package ExercicioEstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Escreva um numero inteiro");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Nao Negativo");
        }else
            System.out.println("Negativo");
        sc.close();
    }

}
