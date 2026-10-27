package aula16_Interfaces;

public class aula16p4 {
/*
-Map
   O Map é uma interface do Java que representa uma coleção de pares de chave e valor, conhecidos como key-value pairs e não permitem suplicadas.
   Enquanto uma List permite acessar um elemento pela posição e um Set trabalha com elementos únicos, o Map permite acessar um valor por meio de uma chave associada a ele.

   Você também precisa importar a classe:
   *import java.util.Map;

   Existem três implementações que vale a pena conhecer:
   
   *HashMap 
   Não garante uma ordem específica dos elementosm, permite valores repetidos e null

   *LinkedHashMap
   Preserva a ordem de inserção.

   *TreeMap
   Mantém os elementos ordenados conforme um critério de comparação, não permite chaves null

-Sintaxe
   A declaração normalmente utiliza a interface Map como tipo da variável, deixando a implementação para o lado direito:

   *Map<Integer, String> mapA = new HashMap<>();

   *Map<String, String> mapB = new LinkedHashMap<>();

   *Map<Integer, Double> mapC = new TreeMap<>();

-Métodos
   Assim, você pode utilizar métodos comuns da interface, como:

   *put()
   *get()
   *remove()
   *contains()

   Aqui, temos dois métodos importantes:
   *entry.getKey() - retorna a chave
   *entry.getValue() - retorna o valor

   Ex:

   *Map<Integer, String> students = new HashMap<>();

   *students.put(30, "Carlos");
   *students.put(10, "Mariana");

   System.out.println(students.get(30));

   *for (Map.Entry<Integer, String> entry : students.entrySet()) {
   *   if (entry.getValue().equals("Mariana")) {
   *      System.out.println(entry.getKey());
   *   }
   *}


*/ 
}
