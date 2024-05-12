package exercicioEstruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double a, b, c, d, triangulo, circulo, trapezio, quadrado, retangulo, pi;
        pi = 3.14159;
        System.out.println("Digite os tres valores");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = 2;

        triangulo = a * c / 2;
        circulo = Math.pow(c, d) * pi;
        trapezio = (a + b) * c / 2;
        quadrado = b * b;
        retangulo = a *b ;

        System.out.printf("TRIANGULO : %.3f%n", triangulo);
        System.out.printf("CIRCULO : %.3f%n", circulo);
        System.out.printf("TRAPEZIO : %.3f%n", trapezio);
        System.out.printf("QUADRADO : %.3f%n", quadrado);
        System.out.printf("RETANGULO : %.3f%n", retangulo);
    }

}
