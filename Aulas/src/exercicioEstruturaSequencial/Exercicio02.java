package exercicioEstruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double a, b, resultado, pii;
        System.out.println("Digite o valor do raio");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = 2;
        pii = 3.14159;
        resultado = Math.pow(a, b) * pii;
        System.out.printf("A = %.4f", + resultado);
    }
}
