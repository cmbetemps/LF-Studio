package main.modulos.AutomatoFinitoDeterministico.domain.model;

import java.util.Arrays;
import java.util.Scanner;

public class AFD {

    private Scanner in = new Scanner(System.in);
    private String palavra;
    private String alfabeto;
    private String funcoes;
    private int cont = 0;
    private char alf[];
    private char pal[];
    private String estinicial;
    private String estfinal;
    private char fim = 0;
    private char estfim[];
    private char ini;
    private char atual;
    private int j = 0;
    private int i = 0;
    private int aux;
    //private   char mat[][];//o processo para ler a palavra

    private boolean rec;

    // DADOS INSERIDOS PELO USUARIO
    public void iniciaAFD() { // Função para a configuração do Autômato Finito Determinístico
        System.out.println("Digite o alfabeto?");
        this.alfabeto = in.nextLine();
        this.alf = this.alfabeto.toCharArray();

        // ESTADO INICIAL EX: A
        System.out.println("Digite o estado inicial?");
        this.estinicial = in.nextLine();
        this.ini = this.estinicial.charAt(i);
        this.atual = this.ini;
        // ESTADO FINAL PODE SER MAIS DE UM EX: BC
        System.out.println("Digite o estado final?");
        estfinal = in.nextLine();
        estfim = estfinal.toCharArray();
        // FUNÇOES DE TRANSIÇÃO DE ESTADOS
        // EX: A0B    ESTADO ATUAL: A  VALOR DA TRANSIÇÃO: 0 PROX. ESTADO: B
        System.out.println("Digite as transiçoes de estado separando por ',' uma da outra?");
        funcoes = in.nextLine();

        String transicao[] = funcoes.split(",");
        // PALAVRA PARA TESTAR O AUTOMATO
        System.out.println("Digite a palavra para testar o automato?");
        palavra = in.nextLine();
        pal = palavra.toCharArray();

        char processo[][];// Matriz gerada para passar como paramentro na função Reconhecer.

        processo = organiza(transicao);//Retorna a matriz gerada na função organiza.
        Reconhecer(pal, processo);
    }

    public char[][] organiza(String transicao[]) { //Função para organizar as transições na matriz e retorna a mesma.
        // ATRIBUI AS FUNÇÕES DE TRANSIÇÕES EM UMA MATRIZ 
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

    boolean Reconhecer(char palavra[], char mat[][]) {//Função onde será realizado as transições, e retorna true: reconhecida e false: não reconhecida
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

            //System.out.println("Estado atual: " +atual);
            cont++;

        }

        System.out.println("----------TESTE INICIO FINALIZADO----------");
        System.out.println("Automato finalizado!!!");
        System.out.println("Estado final: " + atual);
        System.out.println("--------------------");
        cont = 0;

        // VERIFICA SE EXISTE MAIS DE UM FINAL DIGITADO PELO USUARIO
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
