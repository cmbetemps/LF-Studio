package main.modulos.AutomatoFinitoPilha.domain.model;

import java.util.*;

public class Fita {
    Queue<String> fita = new LinkedList<>();

    /** Construtor da Fita
     * @param palavra String que será inserida na fita
     **/
    public Fita(String palavra) {
        String[] auxiliar = palavra.split("");
        for(int x = 0; x < palavra.length(); x++) {
            fita.add(auxiliar[x]);
        }
    }

    /** Construtor cópia
     * @param copia Fita a ser copiada
     * @return a cópia do objeto
     **/
    public Fita(Fita copia) {
        this.fita = new LinkedList<>(copia.fita);
    }

    /** Compara a fita com a entrada da função de transição
     * @param fitaTransição entrada a ser comparada
     * @return a cópia do objeto
     **/
    public boolean comparar(String fitaTransição) {
        String fitaStr = String.join("", Arrays.asList(fita.toArray(new String[0])));

        if(fita.isEmpty()){
            return false;
        } else {
            return fitaStr.startsWith(fitaTransição);
        }
    }

    /** Consome a fita
     * @param fitaConsumir String lida na entrada
     **/
    public void consumir(String fitaConsumir) {
        // Consome a quantidade de caracteres lidos na entrada
        if(!fita.isEmpty()) {
            for(int i = 0; i < fitaConsumir.length(); i++) {
                fita.remove();
            }
        }
    }

    /** Verifica se a fita está vazia - Requisito para estado final
     * @return true ou false para pertence ou não
     **/
    public boolean pertence() {
        return fita.isEmpty();
    }
    
    @Override
    public String toString() {
        if(fita.isEmpty()){
            return ("[]");
        } else{
            return fita.toString();
        }
    }
}
