package aula11_Data_Hora.exercicios;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ex2 {
/*
Crie uma hora local para: 15/09/2026 14:30:00
Crie a zona: America/Sao_Paulo
Transforme a hora local em um Instant
Formate e mostre: a hora local como e a hora global em UTC como dd/MM/yyyy HH:mm:ss
A reunião terá duração de 2 horas e 30 minutos.
Use Duration para calcular o horário de término da reunião a partir do Instant inicial.
Formate e mostre o horário de término também em UTC.
*/
public static void main(String[] args) {
   
ZoneId SP = ZoneId.of("America/Sao_Paulo");
LocalDateTime reuniaoSP = LocalDateTime.of(2026, 9, 15, 14, 30,0);
Instant reuniaoSP_GMT = reuniaoSP.atZone(SP).toInstant();

Duration durationReuniaoSP = Duration.of(2, ChronoUnit.HOURS).plus(30, ChronoUnit.MINUTES);

LocalDateTime reuniaoSP_end = reuniaoSP.plus(durationReuniaoSP);
Instant reuniaoSP_GMT_end = reuniaoSP_GMT.plus(durationReuniaoSP);

DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
DateTimeFormatter format1Global = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneOffset.UTC);

System.out.printf("\n===Início===");
System.out.printf("\n%s", reuniaoSP.format(format1));
System.out.printf("\n%s", format1Global.format(reuniaoSP_GMT));
System.out.printf("\n===Fim===");
System.out.printf("\n%s", reuniaoSP_end.format(format1));
System.out.printf("\n%s", format1Global.format(reuniaoSP_GMT_end));

}
}
