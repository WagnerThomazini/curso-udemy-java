package ExercicioPoo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.print("Name ");
        stu.name = sc.nextLine();
        System.out.print("Nota 1 ");
        stu.n1 = sc.nextDouble();
        System.out.print("Nota 2 ");
        stu.n2 = sc.nextDouble();
        System.out.print("Nota 3 ");
        stu.n3 = sc.nextDouble();
        stu.passOrFailed();
         }
    }

