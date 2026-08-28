package aula11_Data_Hora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class aula11p3 {
public static void main(String[] args) {
/*
-Formatação Data-Hora
   O DateTimeFormatter é a classe do Java usada para formatar e interpretar datas e horários. Ela permite transformar um objeto de data/hora em uma String com o formato desejado e também fazer o caminho inverso, convertendo uma String em um objeto de data/hora.

*/ 

//Formatação de data-hora Local
DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

//Formatação de data-hora Instant
//1. Pega apartir do sistema local - .withZone(ZoneId.systemDefault())
DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

//Local
LocalDateTime data1 = LocalDateTime.of(2026, 8, 23, 15, 30, 30);

//Global
Instant data2 = Instant.parse("2026-08-18T01:30:30Z");

//Saída
System.out.println("Data 1: " + data1);
System.out.println("Data 1: " + data1.format(format1));
System.out.println("Data 1: " + data1.format(format2));

//Para Global tem que escrever invertido
System.out.printf("\nData 3: %s", data2);
System.out.printf("\nData 3: %s", format3.format(data2));
// System.out.printf("\nData 3: %s", data3.format(format3)); //Vai dar erro

/*
-Métodos para acessar dados isolados
   Basta na variável após o ponto digitar get e em seguida ler o auto completar
*/

LocalDateTime local1 = LocalDateTime.of(2026, 8, 15, 23, 50);

System.out.printf("\n\nDados isolados\n");
System.out.println("Dia: " + local1.getDayOfMonth());
System.out.println("Mês: " + local1.getMonth());
System.out.println("Mês: " + local1.getMonthValue());
System.out.println("Ano: " + local1.getYear());







}   
}
