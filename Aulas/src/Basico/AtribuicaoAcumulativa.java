package Basico;

import java.util.Scanner;

public class AtribuicaoAcumulativa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
            //conta += ele é igual a conta = conta +
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
    }

}
