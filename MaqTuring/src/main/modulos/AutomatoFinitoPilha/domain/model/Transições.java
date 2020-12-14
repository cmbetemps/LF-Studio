package main.modulos.AutomatoFinitoPilha.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import main.modulos.AutomatoFinitoPilha.controllers.AFP_Injection;

public class Transições {
    String[][] matrizTransições;


    /** Construtor da Transições
     * @param matrizTransições matriz contendo todas a funções de transição do autômato
     **/
    public Transições(String[][] matrizTransições) {
        this.matrizTransições = matrizTransições;
    }

    /** Realiza todas as transições possíveis
     * @param configuração configuração do autômato onde serão testadas as transições
     * @param configurações árvore onde é salva a computação
     **/
    public void transição(Configuração configuração, Arvore configurações) {

        // Loop pelas funções de transição
        for (int x = 0; x < matrizTransições.length; x++) {
            // Se satisfazer todas as condições, realiza a transição
            if (configuração.estado.comparar(matrizTransições[x][0]) == true) {
                if (configuração.fita.comparar(matrizTransições[x][1]) == true) {
                    if (configuração.pilha.comparar(matrizTransições[x][2]) == true) {
                        Configuração novoEstado = new Configuração(matrizTransições[x], configuração.estado, configuração.fita, configuração.pilha);

                        novoEstado.estado.trocar(matrizTransições[x][3]);
                        novoEstado.fita.consumir(matrizTransições[x][1]);
                        novoEstado.pilha.consumir(matrizTransições[x][2]);
                        novoEstado.pilha.empilhar(matrizTransições[x][4]);

                        Arvore novoFilho = configurações.novoFilho(novoEstado);
                        // Se é estado final, retorna
                        // Se não, chama novamente o método com o novo estado
                        if (pertence(novoEstado)) {
                            return;
                        } else {
                            transição(novoEstado, novoFilho);
                        }
                    }
                }
            }
        }
    }

    /** Verifica se o estado é um estado final
     * @param configuração configuração do autômato para verificar se é estado final
     * @return true ou false para é estado final ou não
     **/
    public boolean pertence(Configuração configuração) {
        if (configuração.estado.pertence() && configuração.fita.pertence() && configuração.pilha.pertence()) {
            configuração.reconhecido = true;
        }
        return false;
        }

    /** Verifica se todos os símbolos utilizados pertencem aos alfabetos do autômato
     * @param estados conjunto de estados
     * @param alfabetoFita alfabeto da fita
     * @param alfabetoPilha alfabeto da pilha
     * @return true ou false para sim ou não
     **/
    public boolean validar(String estados, String alfabetoFita, String alfabetoPilha) {
        boolean flagValido = true;
        ArrayList<String> matrizEstados, matrizFita, matrizPilha, auxiliar;

        matrizEstados = new ArrayList<>();
        matrizFita = new ArrayList<>();
        matrizPilha = new ArrayList<>();

        for(int i = 0; i < matrizTransições.length; i++){
            matrizEstados.add(matrizTransições[i][0]);
            matrizFita.addAll(Arrays.asList(matrizTransições[i][1].split("")));
            matrizPilha.addAll(Arrays.asList(matrizTransições[i][2].split("")));
            matrizEstados.add(matrizTransições[i][3]);
            matrizPilha.addAll(Arrays.asList(matrizTransições[i][4].split("")));
        }

        auxiliar = new ArrayList<>();
        auxiliar.addAll(Arrays.asList(alfabetoFita.trim().split("")));

        if(!auxiliar.containsAll(matrizFita)){
            //System.out.println("Erro - Alguma entrada das transições não pertencem ao conjunto de símbolos de entrada.");
            flagValido = false;
        } else {
            //System.out.println("Ok - As entradas das transições pertencem ao conjunto de símbolos de entrada.");
        }

        auxiliar = new ArrayList<>();
        auxiliar.addAll(Arrays.asList(estados.trim().split("\\s*,\\s*")));

        if(!auxiliar.containsAll(matrizEstados)){
            //System.out.println("Erro - Algum estado das transições não pertence ao conjunto de estados.");
            flagValido = false;
        } else {
            //System.out.println("Ok - Os estados das transições pertencem ao conjunto de estados.");
        }

        auxiliar = new ArrayList<>();
        auxiliar.addAll(Arrays.asList(alfabetoPilha.trim().split("")));
        auxiliar.add(0, ""); // palavra vazia;

        if(!auxiliar.containsAll(matrizPilha)){
            System.out.println("Erro - Algum símbolo de pilha das transições não pertencem ao conjunto de símbolos da pilha.");
            flagValido = false;
        } else {
            System.out.println("Ok - Os símbolos de pilha das transições pertencem ao conjunto de símbolos da pilha.");
        }
        AFP_Injection.setConfirm(flagValido);
        return flagValido;
    }
}
