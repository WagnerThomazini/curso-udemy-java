package ExercicioEstruturaFor;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro");
        int x = sc.nextInt();

        for (int i=0; i<x; i++){
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
