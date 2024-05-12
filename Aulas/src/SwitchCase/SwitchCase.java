package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        System.out.println("Digite o numero da semana");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x){
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terca";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sabado";
            break;
        default:
            dia = "Valor invalido";
            break;
        }
        System.out.println("Dia da seamna: " + dia);
        sc.close();
    }
}
