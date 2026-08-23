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
LocalDateTime data1 = LocalDateTime.parse("2026-08-23T14:30:30");
LocalDateTime data2 = LocalDateTime.of(2026, 8, 23, 15, 30, 30);

//Global
Instant data3 = Instant.parse("2026-08-18T01:30:30Z");

//Saída
System.out.println("Data 1: " + data1);
System.out.println("Data 1: " + data1.format(format1));
System.out.println("Data 1: " + data1.format(format2));

//Pode escrever invertido
System.out.println("Data 2: " + format1.format(data2));
System.out.println("Data 2: " + format2.format(data2));

//Para Instant tem que escrever invertido
System.out.printf("\nData 3: %s", data3);
System.out.printf("\nData 3: %s", format3.format(data3));
// System.out.printf("\nData 3: %s", data3.format(format3)); //Vai dar erro

/*
-Convertendo Global para Local
   Temos o seguinte método para ter acesso ao inúmeras Zone.IDs
*/ 

// for (String e : ZoneId.getAvailableZoneIds()) {
//    System.out.println(e);
// }

LocalDateTime local1 = LocalDateTime.ofInstant(data3, ZoneId.systemDefault());
LocalDateTime local2 = LocalDateTime.ofInstant(data3, ZoneId.of("Portugal"));

System.out.printf("\n\nConvertendo Global para Local");
System.out.println("Local 1: " + local1);
System.out.println("Local 1: " + local2);

/*
-Métodos para acessar dados isolados
   Basta na variável após o ponto digitar get e em seguida ler o auto completar
*/

System.out.printf("\n\nDados isolados\n");
System.out.println("Dia: " + local1.getDayOfMonth());
System.out.println("Mês: " + local1.getMonth());
System.out.println("Mês: " + local1.getMonthValue());
System.out.println("Ano: " + local1.getYear());







}   
}
