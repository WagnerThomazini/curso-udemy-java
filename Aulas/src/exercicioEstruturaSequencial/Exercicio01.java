package exercicioEstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int a, b, soma;
        System.out.println("Digite dois numeros");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        soma = a + b;
        System.out.println("Resultado = " + soma);

    }
}
