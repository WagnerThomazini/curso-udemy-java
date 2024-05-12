package ExercicioEstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        System.out.println("Digite dois numeros inteiros");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0 || b % a ==0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao multiploes");
        }
        sc.close();

    }
}
