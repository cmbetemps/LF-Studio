package main.modulos.GramaticasLivreDeContexto.domain.utils;

import java.io.IOException;
import java.util.Scanner;
import main.modulos.GramaticasLivreDeContexto.domain.models.GLC;

/**
 * @author Michel Silva
*/
public class Arquivo {

  /**
   * Recebe uma gramatica como entra e gera uma saida
   * no formato JSON
   * @param gramatica
   */
  public static void output(GLC gramatica) {
    Scanner ler = new Scanner(System.in);
    String pergunta;
    String s;
    System.out.printf("Informe o nome do arquivo a ser salvo:(para sair digite X)\n");
    s = ler.next(); //
    if (s.toLowerCase().equals("x")) return;
    System.out.println("Tem certeza que deseja colocar o nome do arquivo de: \"" + s + "?(S/N)");
    pergunta = ler.next();
    if (pergunta.toLowerCase().equals("s")) {
      System.out.println("Arquivo será criado no diretório atual");

      JsonFormatter json = new JsonFormatter();

    json.writeObject(gramatica, s);

    } else if(pergunta.toLowerCase().equals("n")){
      System.out.println("Entendi, redigite para um novo nome\"");
       output(gramatica);
       return;
    }
    return;
  }

  /**
   * @return Lê um arquivo JSON
   * e retorna m objeto do tipo GLC(gramatica)
   */
  public static GLC input() {
    Scanner ler = new Scanner(System.in);
    String pergunta;
    String s;
    System.out.println("\nEscolha uma das opções abaixo:\nCaminho Absoluto --- A\nCaminho Local . --- L");
    pergunta = ler.next(); //
    if (pergunta.toLowerCase().equals("l")){
      System.out.printf("Informe o nome do arquivo json: Ex GramaticaTest.json (para sair digite X)\n");
      s = ler.next(); //
      if(s.toLowerCase().equals("x")){
        return null;
      }
      JsonFormatter json = new JsonFormatter();
      try{
        return json.readJson(s, true);
      } catch (IOException e) {
        System.out.println("Erro na leitura do arquivo você provavelmente digitou errado o nome do arquivo, tente novamente .");
        return input();
      }
    } else if(pergunta.toLowerCase().equals("a")){
      System.out.printf("Informe o caminho completo até o arquivo ex: "+System.getProperty("user.dir") +"/exemplo.json (para voltar digite x)\n");
      s = ler.next(); //
       if(s.toLowerCase().equals("x")){

         return input();
      }
      JsonFormatter json = new JsonFormatter();
      try{
        return json.readJson(s, false);
      } catch (IOException e) {
        System.out.println("Erro na leitura do arquivo, tente novamente");
      }
    }
    return null;
  }


}
