package exercicioEstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double horas, valor, salario;
        int func;

        System.out.println("Digite o numero do trabalhador");
        Scanner sc = new Scanner(System.in);
        func = sc.nextInt();;
        System.out.println("Digite a quantidade de horas trabalhadas");
        horas = sc.nextDouble();
        System.out.println("Digite o valor por hora recebido");
        valor = sc.nextDouble();
        salario = horas * valor;

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
