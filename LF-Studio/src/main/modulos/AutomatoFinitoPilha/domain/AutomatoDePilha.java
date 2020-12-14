package main.modulos.AutomatoFinitoPilha.domain;

import java.util.ArrayList;

public class AutomatoDePilha {
    Alfabeto alfabetos;
    Estado estados;
    public Pilha pilha;
    Transicoes transicoes;
    String palavra;

    /** Construtor do autômato
     * @param alfabetoFita - Alfabeto de símbolos da fita
     * @param alfabetoPilha - Alfabeto de símbolos da pilha
     * @param estadoInicial - Estado inicial
     * @param estadosFinais - Conjunto de estados finais separados por vírgula
     * @param pilhaInicial - Símbolo inicial da pilha;
     * @param matrizTransicoes - Conjunto de relações de transições:
     *  {"s", "a", "B", "f", "Y"}
     *      s - Estado atual
     *      a - Símbolo lido do início da fita de entrada
     *      B - Símbolo lido do topo da pilha
     *      f - Próximo estado
     *      Y - Símbolo a ser empilhado
     **/
    public AutomatoDePilha(String alfabetoFita, String alfabetoPilha, String estadoInicial, String estadosFinais, String pilhaInicial, String[][] matrizTransicoes){
        this.alfabetos = new Alfabeto(alfabetoFita, alfabetoPilha);
        this.estados = new Estado(estadoInicial, estadosFinais);
        this.pilha = new Pilha(pilhaInicial);
        this.transicoes = new Transicoes(matrizTransicoes);
    }
    
    
    // Exemplo de utilização
    /*
    public static void main(String[] args) {
        String estados;
        String alfabetoFita;
        String alfabetoPilha;
        String estadoInicial;
        String estadosFinais;
        String pilhaInicial = "";

        String [][] matrizTransições = new String[][]{
                {"s", "a", "", "s", "a"},
                {"s", "a", "", "s", "b"}, // Só para criar uma árvore
                {"s", "b", "", "s", "b"},
                {"s", "c", "", "f", ""},
                {"f", "a", "a", "f", ""},
                {"f", "b", "b", "f", ""},
        };
        String palavra = "abcba";
        
         
        
        /*
        // Linguagem das palavras com qualquer número de a's e b's, seguidos por c, seguido pelo inverso da primeira parte
        String estados = "s,f";
        String alfabetoFita = "abc";
        String alfabetoPilha = "ab";
        String estadoInicial = "s";
        String estadosFinais = "f";
        String pilhaInicial = "";

        String [][] matrizTransições = new String[][]{
                {"s", "a", "", "s", "a"},
                {"s", "a", "", "s", "b"}, // Só para criar uma árvore
                {"s", "b", "", "s", "b"},
                {"s", "c", "", "f", ""},
                {"f", "a", "a", "f", ""},
                {"f", "b", "b", "f", ""},
        };
        
        String palavra = "abcba";
*/
//  Outro autômato
//        // Linguagem das palavras que possuem um número de a's seguido pelo mesmo número de b's;
//        String estados = "p,q";
//        String alfabetoFita = "ab";
//        String alfabetoPilha = "A";
//        String estadoInicial = "p";
//        String estadosFinais = "q";
//        String pilhaInicial = "";
//
//        String[][] matrizTransições = new String[][]{
//                {"p", "a", "", "p", "A"},
//                {"p", "b", "A", "q", ""},
//                {"p", "a", "A", "p", "AA"},
//                {"q", "b", "A", "q", ""},
//        };
//
//        palavra = "aaabbb";
/*
        // Inicializa um autômato com os dados inseridos
        AutomatoDePilha AutomatoDePilha = new AutomatoDePilha(alfabetoFita, alfabetoPilha, estadoInicial, estadosFinais, pilhaInicial, matrizTransições);

         // Verifica se os símbolos utilizados se encontram nos alfabetos
        AutomatoDePilha.estados.validar(estados);
        AutomatoDePilha.transições.validar(estados, alfabetoFita, alfabetoPilha);


        // Cria uma árvore para receber as configurações
        Arvore configurações = new Arvore();

        // Chama a função de reconhecer a palavra
        boolean teste = AutomatoDePilha.Reconhecer(palavra, configurações);

        AutomatoDePilha.printArvore(configurações);
        System.out.println();

        if(teste){
            System.out.println("A palavra '"+ palavra +"' pertence a linguagem.");
        } else {
            System.out.println("A palavra '"+ palavra +"' não pertence a linguagem.");
        }*/
    /*
    }
     */
    /** Verifica se a palavra pertence ou não ao conjunto de palavras reconhecidas pelo autômato
     * @param palavra String cujos elementos devem pertencer ao alfabeto de entrada
     * @param configuracoes objeto onde serão salvas as configuracoes da computação realizada
     * @return true ou false para palavra reconhecida ou não
     */
    public boolean Reconhecer(String palavra, Arvore configuracoes) {
        if(!this.alfabetos.validar(palavra)){
            return false;
        }
        Fita fita = new Fita(palavra);

        Configuracao configuracaoInicial = new Configuracao(null, estados, fita, pilha);

        configuracoes.iniciarArvore(configuracaoInicial);

        transicoes.transição(configuracaoInicial, configuracoes);

        return configuracoes.encontrarEstadoValido() != null;
    }

    /** Imprime árvore de configuracoes
     * @param configuracoes objeto contendo a computação que será impressa
     */
    public ArrayList <String> printArvore(Arvore configuracoes) {
        ArrayList <String>  retorno = new ArrayList ();
        Arvore raiz = configuracoes.encontrarRaiz();
        int level = -1;

        for (Arvore no : raiz) {
            // Se o nível do no for diferente do contador, aumenta o nível e imprime
            if(level != no.getLevel()){
                level = no.getLevel();
                retorno.add("-----------\n--Nível "+ (level+1)+"--\n-----------");
                //System.out.println("-----------\n--Nível "+ (level+1)+"--\n-----------");
            }

            if(no.pai != null) {
                retorno.add("Estado anterior: " + no.pai.configuracao.estado);
                retorno.add("Fita anterior: " + no.pai.configuracao.fita);
                retorno.add("Pilha anterior: " + no.pai.configuracao.pilha);
                //System.out.println("Estado anterior: " + no.pai.configuração.estado);
                //System.out.println("Fita anterior: " + no.pai.configuração.fita);
                //System.out.println("Pilha anterior: " + no.pai.configuração.pilha);

                String[] trans = no.configuracao.transição;
                retorno.add("-> Transição: "+"(('"+trans[0]+"','"+ trans[1]+"','"+trans[2]+"'), ('"+trans[3]+"','"+trans[4]+ "'))");
                //System.out.println("-> Transição: "+"(('"+trans[0]+"','"+ trans[1]+"','"+trans[2]+"'), ('"+trans[3]+"','"+trans[4]+ "'))");
            }
            retorno.add("Estado atual: " + no.configuracao.estado);
            retorno.add("Fita atual: " + no.configuracao.fita);
            retorno.add("Pilha atual: " + no.configuracao.pilha);
            //System.out.println("Estado atual: " + no.configuração.estado);
            //System.out.println("Fita atual: " + no.configuração.fita);
            //System.out.println("Pilha atual: " + no.configuração.pilha);
        }
         return retorno;
    }
}