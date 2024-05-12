package ExercicioEstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("""
                Codigo   Especificação    Preco
                1        Cachorro Quente  R$4.00
                2        X-Salada         R$4.50
                3        X-Bacon          R$5.00
                4        Torrada Simples  R$2.00
                5        Refrigerante     R$1.50
                """);
        System.out.println("Digite o Codigo e a quantidade");
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int qtde = sc.nextInt();
        double total = 0;
        if (codigo == 1){
            total = qtde * 4.0;
        }
        else if (codigo == 2){
            total = qtde * 4.50;
        }
        else if (codigo == 3){
            total = qtde * 5.00;
        }
        else if (codigo == 4){
            total = qtde * 2.00;
        }
        else if (codigo == 5){
            total = qtde * 1.50;
        }else{
            System.out.println("Valor errado");
        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
