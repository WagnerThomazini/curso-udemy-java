package ExercicioEstruturaFor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fatorial = 1;

        for (int i=1; i<=N; i++){
            fatorial = fatorial * i;

        }
        System.out.println(fatorial);
    }
}
