package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoData {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaAnteriorLocalDate = d04.minusDays(7);
        LocalDate proximaSemanaLocalDate = d04.plusDays(7);

        System.out.println("Semana Anterior " + semanaAnteriorLocalDate);
        System.out.println("Proxima Semana  " + proximaSemanaLocalDate);
        System.out.println();

        LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d05.plusDays(7);

        System.out.println("Semana Anterior " + semanaAnteriorLocalDateTime);
        System.out.println("Proxima Semana  " + proximaSemanaLocalDateTime);
        System.out.println();

        Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println();

        System.out.println("Semana Anterior " + semanaAnteriorInstant);
        System.out.println("Proxima Semana  " + proximaSemanaInstant);
        System.out.println();

        Duration t1 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(semanaAnteriorLocalDateTime, d05);
        Duration t3 = Duration.between(semanaAnteriorInstant, d06);
        Duration t4 = Duration.between(d06, semanaAnteriorInstant);


        System.out.println("T1 dias = "+t1.toDays());
        System.out.println("T2 dias = "+t2.toDays());
        System.out.println("T3 dias = "+t3.toDays());
        System.out.println("T4 dias = "+t4.toDays());



    }
}
