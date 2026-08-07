package aula6_Strings;

import java.util.Locale;

public class aula6 {
public static void main(String[] args) {
/*
Modificando Strings
   
*/ 

Locale.setDefault(Locale.US);
int i;

String strings = "    ABCD efgh IJKLM abcd EFGH ijkml    ";
String[] linguagens = "Java Python JavaScript".split(" ");

// * .length()
System.out.println("\t* .length()");
System.out.println(strings.length());

// * .equalsIgnoreCase()
System.out.println("\t* .equalsIgnoreCase()");
System.out.println("ABCD".equalsIgnoreCase("abcd"));

// * .split()
System.out.println("\t* .split()");
for (i = 0; i <= 2; i++) {
   System.out.println(linguagens[i]);
}

// * .toUpperCase()
System.out.println("\t\n* .toUpperCase()");
System.out.println(strings.toUpperCase());

// * .toLowerCase()
System.out.println("\t\n* .toLowerCase()");
System.out.println(strings.toLowerCase());

// * .strip()
System.out.println("\t\n* .strip()");
System.out.println(strings.strip());

// * .replace()
System.out.println("\t\n* .replace()");
System.out.println(strings.replace("abcd", "1234"));

// * .substring()
System.out.println("\t\n* .substring()");
System.out.println(strings.substring(5,15));

// * .contais()
System.out.println("\t\n* .contais()");
System.out.println(strings.contains("ijk"));
System.out.println(strings.contains("999"));

// * .indexOf()
System.out.println("\t\n* .indexOf()");
System.out.println(strings.indexOf("cd"));

// * .repeat()
System.out.println("\t\n* .repeat()");
System.out.println("-".repeat(30));

// * .isEmpty()
System.out.println("\t\n* .isEmpty()");
System.out.println(strings.isEmpty());








}
}
