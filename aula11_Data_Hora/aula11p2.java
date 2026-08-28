package aula11_Data_Hora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class aula11p2 {
public static void main(String[] args) {
/*
-Hora Local para Global
   Temos a seguinte sintaxe:
*/ 

LocalDateTime dataHora1 = LocalDateTime.of(2026, 8, 25, 22, 0);

Instant horaGlobal1 = dataHora1.atZone(ZoneId.of("Asia/Tokyo")).toInstant();
Instant horaGlobal2 = dataHora1.atZone(ZoneId.systemDefault()).toInstant();

System.out.printf("\n ===Local para Global===");
System.out.printf("\n %s", dataHora1);
System.out.printf("\n %s", horaGlobal1);
System.out.printf("\n %s", horaGlobal2);


/*
   Com o código abaixo podemos ter todos as ZoneId listadas
*      for (String e : ZoneId.getAvailableZoneIds()) {
*         System.out.println(e);
*      }
*/ 


/*
-Hora Global para Local
   Temos a sseguinte sintaxe, em que a diferença será a retirada do .toInstant():
*/ 

Instant horaGlobal3 = Instant.parse("2026-08-26T01:00:00Z");

ZonedDateTime dataHora2 = horaGlobal3.atZone(ZoneId.of("Asia/Tokyo"));
ZonedDateTime dataHora3 = horaGlobal3.atZone(ZoneId.systemDefault());

System.out.printf("\n\n ===Global para Local===");
System.out.printf("\n %s", horaGlobal3);
System.out.printf("\n %s", dataHora2);
System.out.printf("\n %s", dataHora3);


}
}
