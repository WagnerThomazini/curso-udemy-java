package exercicioEstruturaWhile;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int x = sc.nextInt();

        while (x != 4){
            if (x == 1){
                alcool ++;
            } else if (x ==2) {
                gasolina ++;
            } else if (x ==3) {
                diesel ++;
            }

            x = sc.nextInt();

        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: "+ diesel);


    }
}
