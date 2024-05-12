package Arrays.Pensionato;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        //a dona de um pensionato possui dez quartos para alugar para estudantes, sendo
        // esses quartos identificados pelos numeros de 0 a 9.

        // Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representado o
        //numero de estudantes que vao alugar quartos(N pode ser de 1 a 10). Em seguida, registre o aluguel dos N
        // estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos
        //ele escolhe(de 0 a 9). Suponha que seja escolhido um quarto vago.Ao final, seu programa deve imprimir um
        //relatorio de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.

        Scanner sc = new Scanner(System.in);
        Quartos[] vect = new Quartos[10];

        System.out.print("Quantos quartos deseja alugar? ");
        int n = sc.nextInt();


        for(int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Aluguel #"+ i +":");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numero = sc.nextInt();

            vect[numero] = new Quartos(nome,email);

        }
        System.out.println();
        System.out.println("Quartos ocupados");
        for(int i=0; i<10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
            sc.close();
        }



    }
}
