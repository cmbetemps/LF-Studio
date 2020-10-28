package main.modulos.AutomatoFinitoPilha.domain.model;

import static java.lang.System.exit;

public class Alfabeto {
    String[] alfabeto;
    String[] alfabetopilha;
    
    public Alfabeto(String alfabetoinicial, String alfabetopilhainicial) {      // separo as strings alfabeto e alfabeto pilha
       alfabeto =  alfabetoinicial.split("");                                   // em um array
       alfabetopilha = alfabetopilhainicial.split("");
    }
    
    public void válidos(Alfabeto alfabetos, String estadoinicial, String estadosfinaisinicial, String palavrainicial, String simboloinicial, String[][] matrizinicial) {
        String[] auxiliar; boolean auxiliarmatriz;
        
        auxiliar = estadoinicial.split("");
        for(int x = 0; x < auxiliar.length; x++) {                              // Verificando se os símbolos estados está contido no conjunto alfabeto
            for(int y = 0; y < alfabetos.alfabeto.length; y++) {
                if(alfabetos.alfabeto[y].contains(auxiliar[x])) {
                    System.out.println("Estados pertencem ao alfabeto");
                }
            }
        }
        auxiliar = estadosfinaisinicial.split("");
        for(int x = 0; x < auxiliar.length; x++) {                              // Verificando se símbolo estado final está contido no conjunto alfabeto
            for(int y = 0; y < alfabetos.alfabeto.length; y++) {
                if(alfabetos.alfabeto[y].contains(auxiliar[x])) {
                    System.out.println("Estado final[" + x + "] pertence ao alfabeto");
                }
            }
        }
        auxiliar = simboloinicial.split("");
        for(int x = 0; x < auxiliar.length; x++) {                              // Verificando se todos símbolos da pilha está contido no conjunto alfabetopilha
            for(int y = 0; y < alfabetos.alfabetopilha.length; y++) {
                if(alfabetos.alfabetopilha[y].contains(auxiliar[x])) {
                    System.out.println("Símbolo inicial da pilha pertence ao alfabeto");
                }
            }
        }
        auxiliar = palavrainicial.split("");                                    // Verificando cada elemento do array
        for(int x = 0; x < auxiliar.length; x++){                               // da palavra inicial pertence ao alfabeto
            for(int y = 0; y < alfabetos.alfabeto.length; y++){
                if(alfabetos.alfabeto[y].contains(auxiliar[x])) {
                    System.out.println("Fita[" + x + "] pertence ao alfabeto");
                }
            }
        }
        for(int w = 0; w < 4; w++) {
            for(int z = 0; z < 5; z++) {
                auxiliar = matrizinicial[w][z].split("");
                auxiliarmatriz = false;
                for(int x = 0; x < auxiliar.length; x++) {                      // Verificando se todos símbolos de transições está contido no conjunto alfabeto
                    for(int y = 0; y < alfabetos.alfabeto.length; y++) {
                        if(alfabetos.alfabeto[y].contains(auxiliar[x]) && auxiliarmatriz != true) {
                            System.out.println("Matriz [" + w + "][" + z + "] pertence ao alfabeto");
                            auxiliarmatriz = true;
                        }
                    }
                    if(auxiliarmatriz == true){
                        break;
                    }
               }
            }
        }
        for(int w = 0; w < 4; w++) {
            for(int z = 0; z < 5; z++) {
                auxiliar = matrizinicial[w][z].split("");
                auxiliarmatriz = false;
                for(int x = 0; x < auxiliar.length; x++) {                      // Verificando se todos símbolos de transições está contido no conjunto alfabeto piljs
                    for(int y = 0; y < alfabetos.alfabetopilha.length; y++) {
                        if(alfabetos.alfabetopilha[y].contains(auxiliar[x]) && auxiliarmatriz != true) {
                            System.out.println("Matriz [" + w + "][" + z + "] pertence ao alfabetopilha");
                            auxiliarmatriz = true;
                        }
                    }
                    if(auxiliarmatriz == true){
                        break;
                    }
                }
            }
        }
    }
}
