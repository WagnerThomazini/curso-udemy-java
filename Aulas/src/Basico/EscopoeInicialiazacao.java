package Basico;

public class EscopoeInicialiazacao {
    public static void main(String[] args) {
        double price = 0;
        //codigo com erro pq variavel nao foi inicializada com um valor
        // modo com deveria double price = 30;
        System.out.println(price);

       double discount = 0; //exemplo de como é
        if (price < 200.00) {
            //double discount = price * 0.1; //variavel dentro do escopo e nao pode ser usada fora do escopo
        }

        System.out.println(discount);
    }
}
