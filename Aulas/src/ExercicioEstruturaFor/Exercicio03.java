package ExercicioEstruturaFor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double m1, m2 ,m3 , media= 0;
        for (int i=0; i<N; i++){
            m1 = sc.nextDouble();
            m2 = sc.nextDouble();
            m3 = sc.nextDouble();
            media = (m1*0.2) + (m2*0.3) + (m3*0.5);
            System.out.printf("%.1f%n" , media);
        }
    }
}
