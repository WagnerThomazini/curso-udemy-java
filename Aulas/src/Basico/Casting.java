package Basico;

public class Casting {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Casting");
        int a, b ;
        double resultado;
        a = 5;
        b = 2;
        resultado =a/b;
        System.out.println("Valor sem casting " + resultado);
        System.out.println("Valor com casting " + (resultado = (double) a/b));

        double x;
        int z;
        x = 5.0;
        //Colocar (int) pro sistema saber que deseja continuar a operação
        z = (int) x;
    }
}
