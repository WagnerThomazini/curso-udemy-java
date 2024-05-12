package Basico;

public class CondicionalTernaria {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println("Desconto " + desconto);

        // condicao ternaria
        double preco2 = 35;
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
        System.out.println("Desconto " + desconto2);

    }
}
