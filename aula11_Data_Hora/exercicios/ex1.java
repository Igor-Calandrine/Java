package aula11_Data_Hora.exercicios;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ex1 {
/*
Crie um programa que represente uma reunião marcada para 25/08/2026 às 22:30:00 no horário de São Paulo.
Criar a hora local usando LocalDateTime.
Criar a zona America/Sao_Paulo usando ZoneId.
Transformar a hora local em ZonedDateTime.
Transformar o ZonedDateTime em Instant.
Criar um DateTimeFormatter para mostrar a hora local no formato: dd/MM/yyyy HH:mm:ss
Criar outro DateTimeFormatter para mostrar o Instant no mesmo formato, usando a zona UTC.
*/ 
public static void main(String[] args) {

LocalDateTime reuniao = LocalDateTime.parse("2026-05-25T22:30:00");
ZoneId AmericaSaoPaulo = ZoneId.of("America/Sao_Paulo");

LocalDateTime reuniaoSP = LocalDateTime.parse("2026-05-25T22:30:00");
Instant reuniaoSPGMT = reuniao.atZone(AmericaSaoPaulo).toInstant();

DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
DateTimeFormatter format1GMT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneOffset.UTC);

System.out.printf("\n%s", reuniao);
System.out.printf("\n%s", AmericaSaoPaulo);
System.out.printf("\n%s", reuniaoSP);
System.out.printf("\n%s", reuniaoSPGMT);

System.out.printf("\n%s", reuniaoSP.format(format1));
System.out.printf("\n%s", format1GMT.format(reuniaoSPGMT));
System.out.printf("\n%s", format1GMT.format(reuniaoSPGMT));

}
}
