package ExercicioPoo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Digite o nome: ");
        emp.name = sc.nextLine();
        System.out.print("Digite o salario: ");
        emp.groossSalary = sc.nextDouble();
        System.out.print("Digite a taxa: ");
        emp.tax = sc.nextDouble();
        System.out.println();

        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();

        System.out.println("Updated data "+ emp);
        sc.close();
    }
}
