package exercicioEstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        System.out.println("Digite os quatro valores");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        diferenca = a * b - c * d;
        System.out.println(diferenca);

    }
}
