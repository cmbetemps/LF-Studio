package transições;

import estado.Estado;
import fita.Fita;
import pilha.Pilha;

public class Transições {
    String[][] matriztransições;
    
    public Transições(String[][] matrizinicial) {
        this.matriztransições = matrizinicial;
    }
    
    public void transição(Estado estado, Fita fita, Pilha pilha){
        for(int x = 0; x < matriztransições.length; x++) {                      // faço o loop pela quantidade de linhas da matriz, ou seja, quantidade de transições configuradas
            if(estado.comparar(matriztransições[x][0]) == true) {               // uso metodo para comparar estado com elemento da transição
                if(fita.comparar(matriztransições[x][1]) == true) {             // uso metodo para comparar primeiro elemento da fita com elemento da transição
                    if(pilha.comparar(matriztransições[x][2]) == true) {        // uso metodo para comparar o elemento do topo da pilha com elemento da transição
                        System.out.println("------------");
                        System.out.println("Estado atual: " + estado);          // se todos ifs "true", encontrei a linha da transição que vou utilizar
                        System.out.println("Fita atual: " + fita);              // imprimo as informações atuais do autômato
                        System.out.println("Pilha atual: " + pilha);
                        fita.consumir();                                        // consumo elemento da fita que eu li
                        pilha.consumir();                                       // consumo elemento da pilha que eu li
                        estado.trocar(matriztransições[x][3]);                  // vou para o estado novo
                        pilha.empilhar(matriztransições[x][4]);                 // empilho elemento da transição
                        System.out.println("Estado novo: " + estado);           
                        System.out.println("Fita nova: " + fita);               // imprimo as informações novas do autômato
                        System.out.println("Pilha nova: " + pilha);
                        System.out.println("------------");
                        break;
                    }
                }
            }
        }
    }
}
