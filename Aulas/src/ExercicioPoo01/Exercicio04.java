package ExercicioPoo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.many = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter());
    }
}
