package main.modulos.AutomatoFinitoPilha.domain.model;

import java.util.LinkedList;
import java.util.Queue;
        
public class Fita {
    Queue<String> fita = new LinkedList<>();
    
    public Fita(String palavrainicial) {                                        // divido minha string da palavra para 
        String[] auxiliar = palavrainicial.split("");                           // reconhecer em um array
        for(int x = 0; x < palavrainicial.length(); x++) {                      // adiciono cada elemento do array numa
            fita.add(auxiliar[x]);                                              // lista encadeada
        }
    }
    
    public boolean comparar(String fitatransicaosimbolo) {                      // retorno "true" se o primeiro elemento
        return fita.peek().equals(fitatransicaosimbolo);                        // da lista é igual valor que vem como
    }                                                                           // argumento da matriz transições
    
    public void consumir() {                                                    // caso a lista não esteja vazia, 
        if(fita.isEmpty()) {                                                    // consumo o primeiro elemento da lista
        } else {
            fita.remove();
        }
    }
    
    public boolean pertence() {                                                 // retorno "true" caso minha lista 
        return fita.isEmpty();                                                  // esteja vazia ao fim das transições
    }
    
    @Override                                                                   // função overridepra receber conteúdo
    public String toString() {                                                  // da minha lista ao invés da localização
        if(fita.isEmpty()){
            return ("[]");
        } else{
            return fita.toString();
        }
    }
}
