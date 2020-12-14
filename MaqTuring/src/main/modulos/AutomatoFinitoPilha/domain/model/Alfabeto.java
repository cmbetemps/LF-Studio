package main.modulos.AutomatoFinitoPilha.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import main.modulos.AutomatoFinitoPilha.controllers.AFP_Injection;

public class Alfabeto {
    ArrayList<String> alfabetoFita;
    ArrayList<String> alfabetoPilha;


    /** Construtor do alfabeto
     * @param alfabetoFita - Alfabeto de símbolos da fita
     * @param alfabetoPilha - Alfabeto de símbolos da pilha
     **/
    public Alfabeto(String alfabetoFita, String alfabetoPilha) {
       // Faz split dos valores e armazena nas ArrayList
       this.alfabetoFita = new ArrayList<>(Arrays.asList(alfabetoFita.split("")));
       this.alfabetoPilha = new ArrayList<>(Arrays.asList(alfabetoPilha.split("")));
       // Palavra vazia
       this.alfabetoPilha.add(0, "");
    }

    /** Verifica se os símbolos da palavra pertencem ao alfabeto de entrada
     * @param palavra palavra a ser verificada
     * @return true ou false para pertence ou não
     **/
    public boolean validar(String palavra) {
        boolean flagValido = true;
        ArrayList<String> auxiliar;

        auxiliar = new ArrayList<>(Arrays.asList(palavra.split("")));

        if(!alfabetoFita.containsAll(auxiliar)){
            AFP_Injection.setAviso("Erro - A palavra possui símbolos que não pertencem ao alfabeto de entrada.");
            flagValido = false;
        } else {
            AFP_Injection.setAviso("Ok - Todos os símbolos da palavra pertencem ao alfabeto de entrada.");
        }
        AFP_Injection.setConfirm(flagValido);
        return flagValido;
    }
}
