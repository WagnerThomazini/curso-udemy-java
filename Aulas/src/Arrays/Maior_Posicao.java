package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double valor = 0;
        double posicao = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] > valor) {
                valor = vect[i];
                posicao = i;
            }

        }
        System.out.printf("\n\nMAIOR VALOR = %.1f\n", valor);
        System.out.printf("POSICAO DO MAIOR VALOR = %.0f", posicao);
    }
}
