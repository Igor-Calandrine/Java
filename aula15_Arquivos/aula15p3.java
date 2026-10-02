package aula15_Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aula15p3 {
public static void main(String[] args) {
/*
-Escrevendo Arquivos
   Assim como temos os Readers tb temos os Writers

   *import java.io.FileWriter;
   *import java.io.BufferedWriter;

   *FileWriter fw = new FileWriter("dados.txt");
   *BufferedWriter bw = new BufferedWriter(fw);

   Em FileWriter podemos ter 2 argumentos:

   *new FileWriter(path)
      Cria ou Recria
   
   *new FilwWriter(path, true)
      Acrescenta ao arquivo existe novas informações

*/ 

String[] lines = new String[] {"Bom dia", "Boa tardeÇãõ", "Boa noite"};

String path = "C:\\Users\\perni\\OneDrive\\Área de Trabalho\\Cursos\\Java\\aula15_Arquivos\\arquivo.txt";

try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
   for (String e : lines) {
      bw.write(e);
      bw.write("\n");
   }
} catch (IOException e) {
   e.printStackTrace();
}



}
}
