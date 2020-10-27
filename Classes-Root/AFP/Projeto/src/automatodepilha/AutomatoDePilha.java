package automatodepilha;

import alfabeto.Alfabeto;
import estado.Estado;
import fita.Fita;
import pilha.Pilha;
import transições.Transições;

public class AutomatoDePilha {
    static String alfabetoinicial;                                              // conjunto do alfabeto
    static String alfabetopilhainicial;                                         // conjunto do alfabeto da pilha
    static String estadoinicial;                                                // simbolo do meu estado inicial
    static String estadosfinaisinicial;                                         // simbolos dos estados finais
    static String palavrainicial;                                               // palavra que quero reconhecer
    static String simboloinicial;                                               // símbolo inicial da pilha
    static String[][] matrizinicial = new String[4][5];                         // matriz de transições inicial
                                                                                // [quantidade de transições][elementos de uma transição]
    
    static Alfabeto alfabetos;                                                  // iniciando meus construtores, alfabeto
    static Estado estado;                                                       // estado
    static Fita fita;                                                           // fita
    static Pilha pilha;                                                         // pilha
    static Transições transições;                                               // transições
    
    public static void main(String[] args) {
        
        alfabetoinicial = "ab";                                                // atribuindo valores de testes
        alfabetopilhainicial = "A";
        estadoinicial = "p";
        estadosfinaisinicial = "pq";
        palavrainicial = "aaabbb";
        simboloinicial = "";
        
        matrizinicial[0][0] = "p";
        matrizinicial[0][1] = "a";
        matrizinicial[0][2] = "";
        matrizinicial[0][3] = "p";
        matrizinicial[0][4] = "A";

        matrizinicial[1][0] = "p";
        matrizinicial[1][1] = "b";
        matrizinicial[1][2] = "A";
        matrizinicial[1][3] = "q";
        matrizinicial[1][4] = "";

        matrizinicial[2][0] = "p";
        matrizinicial[2][1] = "a";
        matrizinicial[2][2] = "A";
        matrizinicial[2][3] = "p";
        matrizinicial[2][4] = "AA";

        matrizinicial[3][0] = "q";
        matrizinicial[3][1] = "b";
        matrizinicial[3][2] = "A";
        matrizinicial[3][3] = "q";
        matrizinicial[3][4] = "";
        
        alfabetos = new Alfabeto(alfabetoinicial, alfabetopilhainicial);        // atribuindo os valores de testes
        estado = new Estado(estadoinicial, estadosfinaisinicial);              // nos construtores
        fita = new Fita(palavrainicial);
        pilha = new Pilha(simboloinicial);
        transições = new Transições(matrizinicial);
        
        alfabetos.válidos(alfabetos, estadoinicial, estadosfinaisinicial,       // verificando se todos os símbolos
                palavrainicial, simboloinicial, matrizinicial);                 // pertencem aos alfabetos
        
        for(int x = 0; x < palavrainicial.length(); x++){                       // realizo as transições pela quantidade
            transições.transição(estado, fita, pilha);                          // de símbolos da palavra à reconhecer
        }
        pertence();                                                             // verifica se o a palavra pertence a linguagem
    }
    
    static public void pertence() {                                             // método para reconhecer a linguagem após todas transições
        if(estado.pertence() == true) {                                         // se estado vazio, avança
            if(fita.pertence() == true) {                                       // se palavra na fita vazia, avança
                if(pilha.pertence() ==  true){                                  // se pilha vazia, avança
                    System.out.println("A palavra pertence a linguagem");       // printa que a palavra pertence se todos os 3 ifs verdadeiros
                }
            }
        }
    }
}
