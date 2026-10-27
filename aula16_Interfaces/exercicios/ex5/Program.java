package aula16_Interfaces.exercicios.ex5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

List<Integer> courseA = new ArrayList<>();
List<Integer> courseB = new ArrayList<>();
List<Integer> courseC = new ArrayList<>();

System.out.printf("How many studentd for course A: ");
int count = input.nextInt();
input.nextLine();
addStudent(count, courseA, input);

System.out.printf("How many studentd for course B: ");
count = input.nextInt();
input.nextLine();
addStudent(count, courseB, input);

System.out.printf("How many studentd for course C: ");
count = input.nextInt();
input.nextLine();
addStudent(count, courseC, input);

Set<Integer> studentAlex = new HashSet<>(courseA);

System.out.println(courseA);
System.out.println(courseB);
System.out.println(courseC);

studentAlex.addAll(courseB);
System.out.println(studentAlex);
System.out.println(studentAlex.size());

studentAlex.addAll(courseC);
System.out.println(studentAlex);
System.out.println(studentAlex.size());





input.close();
}
// Função para automatizar inserção de alunos
public static void addStudent(int count, List<Integer> list, Scanner input) {
   for (int i=0; i < count; i++) {
      int student = input.nextInt();
      list.add(student);
      
}
}
}
