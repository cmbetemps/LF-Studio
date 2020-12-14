package main.modulos.AutomatoFinitoDeterministico.domain.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AFD {
  private char processo[][];                              // Matriz gerada para passar como paramentro na função reconhecer.
  private String funcoes;
  private int cont = 0;
  private char alf[];
  private char fim = 0;
  private char estfim[];
  private char ini;
  private char atual;
  private int j = 0;
  private int i = 0;
  private int aux;

  public AFD(String alfabeto, String estinicial, String estfinal, String funcoes, HashMap<Integer, String> mapaEstados){
    this.alf = alfabeto.toCharArray();
    this.ini = estinicial.charAt(0);
    this.atual = this.ini;
    this.estfim =estfinal.toCharArray();
    this.funcoes = funcoes;
    converterMapa(mapaEstados);
  }

  public void converterMapa(HashMap<Integer, String> mapaEstados){
    String []transicoes = funcoes.split(",");
    for (int k = 0; k < mapaEstados.size(); k++) {
      String replace = "[" + mapaEstados.get(k) + "]";
      funcoes = funcoes.replace(replace ,  + k + "");
    }
  }
  public AFD( ){

  }

  private boolean rec;

  public void configurarAutomato() {
    String transicao[] = funcoes.split(",");     // Separa as funções de transição exemplo A0B, A1B
    processo = organiza(transicao);                 // Retorna a matriz gerada na função organiza.
  }

  /**
   * Função para organizar as transições na matriz e retorna a mesma.
   * ATRIBUI AS FUNÇÕES DE TRANSIÇÕES EM UMA MATRIZ
   * @param transicao
   * @return
   */
  public char[][] organiza(String transicao[]) {
    while (j < transicao.length) { // CONTADOR PARA SABER QUANTAS TRANSIÇÕES O USUARIO INSERIU
      j++;
    }

    char mat[][] = new char[j][3];
    // PERCORRE CARA TRANSIÇÃO PARA INSERIR NA MATRIZ
    while (cont < transicao.length) {

      mat[cont][0] = transicao[cont].charAt(0);
      mat[cont][1] = transicao[cont].charAt(1);
      mat[cont][2] = transicao[cont].charAt(2);

      System.out.println("Valores na matriz: " + mat[cont][0] + mat[cont][1] + mat[cont][2]);

      cont++;
    }

    cont = 0;
    return mat;
  }

  public boolean reconhecer(char palavra[]) {//Função onde será realizado as transições, e retorna true: reconhecida e false: não reconhecida
    char mat[][] = processo;
    cont = 0;
    int n = 0;
    int x = 0;
    char palPrint[] = palavra;
    int tam = palavra.length;

    // VERIFICA O TAMANHO DA PALAVRA PARA SER TESTADA
    System.out.println("----------TRANSIÇÔES----------");
    while (cont < palavra.length) {

      aux = 0;
      // LOGICA APLICADA PARA FAZER A TRANSIÇÃO DE UM ESTADO PARA O OUTRO
      while (aux != j) {

        if (mat[aux][1] == palavra[cont]) {
          if (mat[aux][0] == atual) {
            char ant = atual;
            atual = mat[aux][2];
            System.out.print("(" + ant + " ,");//Print para mostrar o estado onde estava

            for (n = x; n < tam; n++) {
              System.out.print("" + palPrint[n]);//Print para mostrar a palavra consumida
            }
            System.out.println(")");
            x++;
            aux = j - 1;
          }
        }
        aux++;
      }
      if (x == tam) {
        System.out.println("(" + atual + ",&)");
      }
      cont++;

    }

    System.out.println("----------TESTE INICIO FINALIZADO----------");
    System.out.println("Automato finalizado!!!");
    System.out.println("Estado final: " + atual);
    System.out.println("--------------------");
    cont = 0;

    while (cont != estfim.length) {
      if (atual == estfim[cont]) {
        fim = estfim[cont];
      }
      System.out.println("Teste de laço: " + estfim[cont]);
      cont++;
    }

    System.out.println("Estado final: " + fim);

    // MOSTRA SE FOI RECONHECIDA A PALAVRA OU NAO
    if (atual == fim) {
      System.out.println("Palavra reconhecida pelo automato!!!");
      return true;
    } else {
      System.out.println("Palavra rejeitada pelo automato!!!");
      return false;
    }
  }
}
