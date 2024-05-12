package ExercicioEstruturaFor;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1; i<=N; i++ ){
            if (N % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
