package ExercicioEstruturaFor;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros a digitar");
        int N = sc.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);
        sc.close();

        System.out.println("ExercicioEstruturaFor.For diminuindo");
        for (int i=5; i>=0; i--) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println("ExercicioEstruturaFor.For aumentando");
        for (int i=0; i<5; i++) {
            System.out.println("Valor de i: " + i);
        }
    }
}
