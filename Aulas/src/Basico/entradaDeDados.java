package Basico;

import java.util.Locale;
import java.util.Scanner;
public class entradaDeDados {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          //String
          String d;
          System.out.println("Digite um nome");
          d = sc.next();
          System.out.println("Voce digitou: " + d);

          //inteiro
          int a;
          System.out.println("Digite um numero inteiro");
          a = sc.nextInt();;
          System.out.println("Voce digitou: " + a);

          //Double
          // se quiser alterar a , pelo . só adicionar o "Locale.setDefault(Locale.US);
          //Locale.setDefault(Locale.US);
          double b;
          System.out.println("Digite um numero double");
          b = sc.nextDouble();
          System.out.println("Voce digitou: " + b);

          //Char
          char c;
          //charAt(0) significa que pega o primeiro caracterer do String
          System.out.println("Digite uma letra");
          c = sc.next().charAt(0);
          System.out.println("Voce digitou: " + c);

          //Varios na mesma linha
          String x;
          int y;
          double z;
          System.out.println("Digite na mesma linha, Nome Inteiro Double");
          x = sc.next();
          y = sc.nextInt();;
          z = sc.nextDouble();
          System.out.println("Nome: " + x + " Inteiro: " + y + " Double:" + z);

          //Varios usando nextLine

          int x1;
          String s1,s2, s3;

          x1 = sc.nextInt();
          sc.nextLine(); //quebra de linha vazia, devido ao comando decima quando da o enter ele vai contar
          s1 = sc.nextLine();
          s2 = sc.nextLine();
          s3 = sc.nextLine();

          System.out.println("Dados Digitados");
          System.out.println(x1);
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);

          sc.close();

     }



}
