package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02= LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/08/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2022,7,20,1,30);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;


        System.out.println("Instanciação");
        System.out.println("Local Date");
        System.out.println(d01);
        System.out.println("Local Date Time");
        System.out.println(d02);
        System.out.println("Instant");
        System.out.println(d03);
        System.out.println("Local Date iso");
        System.out.println(d04);
        System.out.println("Local Date Time iso");
        System.out.println(d05);
        System.out.println("Instant iso");
        System.out.println(d06);
        System.out.println("Instant iso GMT -3");
        System.out.println(d07);
        System.out.println("Local Date Texto Customizado");
        System.out.println(d08);
        System.out.println("Local Date Time Texto Customizado");
        System.out.println(d09);
        System.out.println("Local Date Dados separados");
        System.out.println(d10);
        System.out.println("Local Date Time Dados separados");
        System.out.println(d11);

        System.out.println("Formatação");
        System.out.println("d04 formatado antes ano/mes/dia");
        System.out.println(d04.format(fmt1));
        System.out.println("Pode ser chamado dessa forma");
        System.out.println(fmt1.format(d04));
        System.out.println("Instanciando o objeto junto com a chamada");
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Chamando um Date Time retirando a hora");
        System.out.println(d05.format(fmt1));
        System.out.println("Chamando date time");
        System.out.println(d05.format(fmt2));

        System.out.println("Alterando hora com fuso horario, para fuso horario especifico");
        //System.out.println(d06.format(fmt3)); dessa forma nao é possivel pq o instant nao tem o metodo format
        System.out.println(fmt3.format(d06)); // quando é instant precisa formatar com fuso horario

        System.out.println("Usando padrao existente");
        System.out.println(d05.format(fmt4));
    }
}
