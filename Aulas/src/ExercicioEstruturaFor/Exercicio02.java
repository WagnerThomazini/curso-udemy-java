package ExercicioEstruturaFor;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int N = sc.nextInt();
        int in = 0;
        int out = 0;
        
        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            int i1 = (x >= 10 && x <= 20 ? in++ : out++);
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
