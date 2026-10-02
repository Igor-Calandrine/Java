package aula15_Arquivos;

import java.io.File;

public class aula15p1 {
public static void main(String[] args) {
/*
-Caminho de Arquivos
   No Windows, a \ é um caractere especial dentro de uma String. Por isso, é necessário usar \\

   *     String caminho = "C:\\Users\\Igor\\Documents\\arquivo.txt";

   Java também aceita / mesmo no Windows:

   *     String caminho = "C:/Users/Igor/Documents/dados.txt";

   -Melhor abordagem: Path
      Para trabalhar realmente com arquivos, a API moderna do Java recomenda que se use Path, essa forma costuma ser mais simples porque evita ficar duplicando as barras.

      *import java.nio.file.Path;

      *Path caminho = Path.of("C:/Users/Igor/Documents/dados.txt");

      ou

      *Path caminho = Path.of("C:", "Users", "Igor", "Documents", "dados.txt");

-Arquivos
   A classe File faz parte do pacote java.io, que contém diversas classes relacionadas à entrada e saída de dados, conhecidas como I/O (Input/Output).
   Antes de utilizar File, normalmente precisamos importar a classe:

      *import java.io.File;

      *File arquivo = new File("C:/Users/Igor/Documents/dados.txt");

   !File não significa que o arquivo foi aberto, o que aconteceu foi a criação de um objeto Java que representa aquele caminho.
   Depois podemos verificar se realmente existe alguma coisa naquele local:
   
      *arquivo.exists();

   Para criar fisicamente um arquivo, podemos utilizar, por exemplo:

      *arquivo.createNewFile();

-Listando Aquivos e Pastas
   É possível listar arquivos e pastas, da forma mais moderna será utilizado um tipo de expressão lâmbida

   File[] pastas = path.listFiles(File::isDirectory)
*/ 


File path1 = new File("C:\\Users\\perni\\OneDrive\\Área de Trabalho\\Cursos\\Java");
File path2 = new File("C:\\Users\\perni\\OneDrive\\Área de Trabalho\\Cursos\\Java\\aula15_Arquivos");

File[] pastas = path1.listFiles(File::isDirectory);
File [] arquivos = path2.listFiles(File::isFile);

for (File e : pastas) {
   System.out.println(e);
}

for (File e : arquivos) {
   System.out.println(e);
}

/*
-Métodos
   Existem inúmeros métodos em File, vale a penas explorar
*/ 

}
}
