package exercicioEstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int peca1, peca2;
        double qtde1, qtde2, valor1, valor2, resultado;
        System.out.println("Digite na mesma linha | Codigo peça, Quantidade, Valor");
        Scanner sc = new Scanner(System.in);
        peca1 = sc.nextInt();
        qtde1 = sc.nextDouble();
        valor1 = sc.nextDouble();
        System.out.println("Digite na mesma linha segunda | Codigo, Qtde, Valor");
        peca2 = sc.nextInt();
        qtde2 = sc.nextDouble();
        valor2 = sc.nextDouble();
        resultado = qtde1 * valor1 + qtde2 * valor2;
        System.out.printf("VALOR A PAGAR : R$ %.2f", resultado);
    }
}
