package aula11_Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class aula11p4 {
public static void main(String[] args) {

/*
-Calculo com Data-Hora
   Data-Hora é imutável, assim como Strings, deve-se criar uma nova variável para realizar os cálculos.
   Sendo as data-hora abaixo:
*/ 

LocalDateTime dataHora1 = LocalDateTime.parse("2026-05-10T02:10:15");
Instant dataHora2 = Instant.parse("2026-05-10T02:10:15Z");

System.out.println(dataHora1);
System.out.println(dataHora2);

// Reduzir ou Adicionar data-hora, basta digitar .minus ou plus para acessar a lista de métodos
LocalDateTime dataHora1Passado = dataHora1.minusDays(7);
LocalDateTime dataHora1Futuro = dataHora1.plusWeeks(1);

System.out.println(dataHora1Passado);
System.out.println(dataHora1Futuro);

Instant dataHora2Passado = dataHora2.minus(5, ChronoUnit.DAYS);
Instant dataHora2Futuro = dataHora2.plus(1, ChronoUnit.DAYS);

System.out.println(dataHora2Passado);
System.out.println(dataHora2Futuro);

/*

-Duration
   A classe Duration representa uma quantidade de tempo entre dois pontos temporais, sendo muito utilizada para trabalhar com horas, minutos, segundos e nanossegundos. Ela é útil, por exemplo, para calcular quanto tempo passou entre dois horários.
*/

Duration duration1 = Duration.between(dataHora1Passado, dataHora1Futuro);
Duration duration2 = Duration.between(dataHora2Passado, dataHora2Futuro);

System.out.printf("\n\n===Duration===\n");
System.out.println("Duração Dias: " + duration1.toDays());
System.out.println("Duração Horas: " + duration1.toHours());

System.out.println("Duração Dias: " + duration2.toDays());
System.out.println("Duração Horas: " + duration2.toHours());

//É imporante saber que caso seja LocalData, deve-se converter para LocalDateTime para .atTime()

LocalDate data3 = LocalDate.of(2026, 8, 5);
LocalDate data3Passado = data3.minusDays(2);
LocalDate data3Futuro = data3.plusDays(2);

Duration duration3 = Duration.between(data3Passado.atStartOfDay(), data3Futuro.atTime(0, 0));
Duration duration4 = Duration.between(data3Passado.atTime(0, 0), data3Futuro.atStartOfDay());

System.out.println("Duração Dias: " + duration3.toDays());
System.out.println("Duração Dias: " + duration4.toDays());



















}   
}
