package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programs {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //for (String s : ZoneId.getAvailableZoneIds()) {
        //System.out.println(s);
        //}

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r11 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("Data Cadastrada = " + d06);
        System.out.println("Transformando Instant em LocalDate = " +r1);
        System.out.println("Transformando Instant em LocalDateTime = " +r11);
        System.out.println("Transformando Instant em LocalDate Portugal = " +r2);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
        System.out.println();

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());





    }
}
