package ExercicioConstrutores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter accout number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char decision = sc.next().charAt(0);

        if (decision == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta = new Conta(number,name,initialDeposit);
        }
        else {
            conta = new Conta(number, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);

        System.out.println("Updated account data");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        System.out.println("Updated account data");
        conta.withdraw(withdrawValue);
        System.out.println(conta);

    }
}
