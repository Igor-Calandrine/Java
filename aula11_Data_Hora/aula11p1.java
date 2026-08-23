package aula11_Data_Hora;

public class aula11p1 {
public static void main(String[] args) {
/*
-Horário Local e Horário Global
   Ao trabalhar com datas e horários em Java, é importante entender primeiro uma diferença fundamental: a diferença entre um horário local e um horário global.

-Horário local
   O horário local representa a data e a hora de acordo com um determinado contexto local, normalmente sem considerar informações de outros lugares do mundo.
   Isso é adequado para situações em que o contexto local é o que realmente importa, como: horário de funcionamento de uma loja, data de uma consulta, horário de uma aula, aniversário de uma pessoa
   Em Java, as classes:
   *LocalDate
   *LocalTime
   *LocalDateTime

   Ex:
   *LocalDateTime dataHora = LocalDateTime.now();

-Horário global
   O horário global representa um instante específico na linha do tempo, independentemente do local onde a pessoa esteja.
   Para isso, precisamos considerar informações como o fuso horário ou utilizar uma referência universal.
   Em Java, as classes:
   *Instant

-Duration e Period
   De forma simplificada, Duration mede uma quantidade de tempo.
   Ela é mais adequada quando queremos medir uma duração de tempo.
   LocalTime inicio = LocalTime.of(10, 0);
   LocalTime fim = LocalTime.of(12, 30);
*  Duration duracao = Duration.between(inicio, fim);

   Nesse caso, a duração é de 2 horas e 30 minutos.

   De forma simplificada, Period mede uma diferença no calendário.
   LocalDate inicio = LocalDate.of(2020, 5, 10);
   LocalDate fim = LocalDate.of(2023, 8, 15);
*  Period periodo = Period.between(inicio, fim);

   Nesse caso, a duração é de 3 anos, 3 meses e 5 dias.

-Padrão ISO
   Ao trabalhar com datas e horários, é importante que os sistemas utilizem uma forma padronizada de representar essas informações. Caso contrário, uma mesma data pode ser interpretada de maneiras diferentes por pessoas ou sistemas de países distintos.
   Java utiliza, por padrão, uma representação de datas e horários baseada no padrão ISO 8601, especialmente nas classes da API java.time.
   Por exemplo:

   -Local
   LocalDate data = LocalDate.parse("2026-08-22");
   LocalDateTime dataHora = LocalDateTime.parse("2026-08-22T20:30:00");

   ou 

   LocalDate data = LocalDate.of(2026, 8, 22);
   LocalDateTime dataHora = LocalDateTime.of(2026, 8, 22, 20, 30, 0);   
   
   O caractere T separa a parte da data da parte do horário.
   *2026-08-22T20:15:30

   -Global
   Instant instante = Instant.parse("2026-08-22T23:30:00Z");

   ou

   Instant instante = Instante.of(2026, 08, 22, 23, 30, 0);

   O caractere Z representa UTC, que é uma referência global de tempo.
   *2026-08-22T23:30:00Z

   Podemos obter o seguinte resultado em que o resultado será uma data e hora com a informação do fuso:
   Instant instante = Instant.parse("2026-08-22T23:30:00-03:00");
   
   Note que acrescentamos o fuso no final, com "-" ou "+"
   *2026-08-22T20:30-03:00






   
   








*/ 
}
}
