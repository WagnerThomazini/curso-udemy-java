package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantoas pessoas serao digitadas: ");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        double somaAltura = 0.0;
        double contador = 0;

        for (int i = 0; i < n; i++) {
            somaAltura += vect[i].getAltura();
            if (vect[i].getIdade() < 16) {
                contador++;
            }
        }

        double alturaMedia = somaAltura / n;
        double porcentagem = (contador/n)*100;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n ", porcentagem);


        for (int i = 0; i < n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }
    }
}
