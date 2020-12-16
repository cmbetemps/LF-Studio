package main.modulos.AutomatoFinitoPilha.domain;

import java.util.Stack;

public class Pilha {
    Stack<String> pilha;

    /**
     * Construtor da Pilha
     *
     * @param simboloInicial simbolo que iniciará na pilha
     **/
    public Pilha(String simboloInicial) {
        pilha = new Stack<>();
        if (simboloInicial.isEmpty()) {
        } else {
            pilha.add(simboloInicial);
        }
    }

    /**
     * Construtor de cópia
     *
     * @param copia Pilha a ser copiada
     * @return a cópia do objeto
     **/
    public Pilha(Pilha copia) {
        this.pilha = (Stack<String>) copia.pilha.clone();
    }

    /**
     * Verifica se o topo da pilha é igual a entrada da função de transição
     *
     * @param pilhaTransição entrada da função de transição
     * @return true ou false para igual ou não
     **/
    public boolean comparar(String pilhaTransição) {
        // Se não houver símbolo na função de transição, significa que não importa o que
        // há na pilha
        if (pilhaTransição.isEmpty()) {
            return true;
        } else if (!pilhaTransição.isEmpty() && pilha.isEmpty()) {
            return false;
        } else {
            return pilha.peek().equals(pilhaTransição);
        }
    }

    /**
     * Empilha na pilha o que constar na função de transição
     *
     * @param pilhaEmpilhar entrada da função de transição a ser empilhada
     **/
    public void empilhar(String pilhaEmpilhar) {
        String[] auxiliar = pilhaEmpilhar.split("");
        for (int x = 0; x < pilhaEmpilhar.length(); x++) {
            pilha.add(auxiliar[x]);
        }
    }

    /**
     * Consome da pilha
     *
     * @param pilhaConsumir entrada da função de transição que será consumida da
     *                      pilha
     **/
    public void consumir(String pilhaConsumir) {
        if (!pilha.isEmpty()) {
            for (int x = 0; x < pilhaConsumir.length(); x++) {
                pilha.pop();
            }
        }
    }

    /**
     * Verifica se a pilha está vazia - Requisito para estado final
     *
     * @return true ou false para vazio ou não
     **/
    public boolean pertence() {
        return pilha.isEmpty();
    }

    @Override
    public String toString() {
        if (pilha.isEmpty()) {
            return ("[]");
        } else {
            return pilha.toString();
        }
    }
}
