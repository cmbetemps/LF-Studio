package pilha;

import java.util.Stack;

public class Pilha {
    Stack<String> pilha = new Stack<>();
    
    public Pilha(String simboloinicial) {                                       // recebo string como argumento e insiro
        if(simboloinicial.isEmpty()){                                           // como primeiro elemento da pilha
        } else {
            pilha.add(simboloinicial);
        }
    }
    
    public boolean comparar(String pilhatransicaosimbolo) {                     // retorno "true" caso pilha e argumento
        if(pilhatransicaosimbolo.isEmpty() && pilha.isEmpty()) {                // da matriz são vazios
            return true;
        } else {
            return pilha.peek().equals(pilhatransicaosimbolo);                  // retorno "true" caso topo da pilha
        }                                                                       // seja igual argumento da matriz
    }
    
    public void empilhar(String pilhaempilharsimbolo) {                         // recebo string da matriz e converto em
        String[] auxiliar = pilhaempilharsimbolo.split("");                     // array, adiciono cada elemento
        for(int x = 0; x < pilhaempilharsimbolo.length(); x++) {                // do array no topo da pilha
            pilha.add(auxiliar[x]);
        }
    }
    
    public void consumir() {                                                    // caso a pilha não seteja vazia, 
        if(pilha.isEmpty()) {                                                   // consumo o elemento no topo da pilha
        } else {
            pilha.pop();
        }
    }
    
    public boolean pertence() {                                                 // retorno "true" caso minha pilha
        return pilha.isEmpty();                                                 // esteja vazia ao fim das transições
    }
    
    @Override                                                                   // função override para receber conteúdo
    public String toString() {                                                  // da minha pilha ao invés da localização
        if(pilha.isEmpty()){
            return ("[]");
        } else{
            return pilha.toString();
        }
    } 
}
