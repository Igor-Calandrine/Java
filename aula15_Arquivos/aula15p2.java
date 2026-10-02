package aula15_Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aula15p2 {
public static void main(String[] args) {
/*
-Lendo Arquivos
   FileReader e BufferedReader aparecem juntos com bastante frequência quando começamos a trabalhar com leitura de arquivos de texto em Java. O mais importante é entender que eles têm responsabilidades diferentes: o FileReader faz a ligação com o arquivo, enquanto o BufferedReader facilita e otimiza a leitura do conteúdo

   O FileReader fornece o fluxo de caracteres proveniente do arquivo
   O BufferedReader recebe esse fluxo e fornece métodos mais convenientes para trabalhar com o texto

   *import java.io.FileReader;
   *import java.io.BufferedReader;

   *FileReader fr = new FileReader("C:/dados.txt");
   *BufferedReader br = new BufferedReader(fr);

   O método seguinte lê uma linha inteira do arquivo.

   *br.readLine()

-Lendo Arquivos Java Moderno
   O try-with-resources é uma forma especial do bloco try que permite declarar recursos dentro do próprio try, sua principal vantagem é que:
      
   *Ao terminar o bloco try, o Java fecha automaticamente os recursos declarados nele.

   A estrutura básica é:

   try (recurso) {
    // código 
   } catch (Exception e) {
   // tratamento 
   }
*/ 

String path = "C:\\Users\\perni\\OneDrive\\Área de Trabalho\\Cursos\\Java\\aula15_Arquivos\\arquivo.txt";

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
   String line = br.readLine();

   while (line != null) {
      System.out.println(line);
      line = br.readLine();
   }
   
} catch (IOException e) {
   System.out.println("Erros:" + e.getMessage());
}



}
}
