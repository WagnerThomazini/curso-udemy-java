package ExercicioEstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Digite a hora inicial e a hora final");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado;

        if (b > a) {
            resultado = (b - a);
        } else {
            resultado = ((24 - a) + b);


        }
        System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
    }
}
