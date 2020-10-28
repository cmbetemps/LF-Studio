package linguagens.novo.metodo;
import java.util.Arrays;
import java.util.Scanner;

public class AFD {

    private    Scanner in = new Scanner(System.in);
    private    String palavra;
    private   String alfabeto;      
    private   String funcoes;
    private   int cont=0;
    private   char alf []; 
    private   char pal [];
    private   String estinicial;
    private   String estfinal;
    private   char fim = 0;
    private   char estfim[];
    private   char ini;
    private   char atual;
    private   int j=0;
    private   int i = 0;    
    private   int aux;      
    private   char mat[][];
      
                    // DADOS INSERIDOS PELO USUARIO

            
                    
             public void iniciaAFD(){

                System.out.println("Digite o alfabeto?");
               this.alfabeto = in.nextLine();
               this.alf = this.alfabeto.toCharArray();
               
                    // ESTADO INICIAL EX: A
               System.out.println("Digite o estado inicial?");
               this.estinicial = in.nextLine();
               this.ini = this.estinicial.charAt(i);
               this.atual = this.ini;
                    // ESTADO FINAL PODE SER MAIS DE UM EX: BC
               System.out.println("Digite o estado final?");
               estfinal = in.nextLine();
               estfim = estfinal.toCharArray();
                    // FUNÇOES DE TRANSIÇÃO DE ESTADOS
                    // EX: A0B    ESTADO ATUAL: A  VALOR DA TRANSIÇÃO: 0 PROX. ESTADO: B
               System.out.println("Digite as transiçoes de estado separando por ',' uma da outra?");
               funcoes = in.nextLine();
               
               String transicao[] = funcoes.split(",");
                // PALAVRA PARA TESTAR O AUTOMATO
              System.out.println("Digite a palavra para testar o automato?");
              palavra = in.nextLine();
              pal = palavra.toCharArray();
               
                // ATRIBUI AS FUNÇÕES DE TRANSIÇÕES EM UMA MATRIZ 
               while(j<transicao.length){ // CONTADOR PARA SABER QUANTAS TRANSIÇÕES O USUARIO INSERIU 
               j++;
               }

                mat = new char [j][3];
               // PERCORRE CARA TRANSIÇÃO PARA INSERIR NA MATRIZ
               while(cont< transicao.length){
                  
                   mat[cont][0] = transicao[cont].charAt(0);
                   mat[cont][1] = transicao[cont].charAt(1);
                   mat[cont][2] = transicao[cont].charAt(2);
          
                 System.out.println("Valores na matriz: " +mat[cont][0] +mat[cont][1] +mat[cont][2]);
                
                    cont++;
                   }
                
               cont=0;    
               
     
                // VERIFICA O TAMANHO DA PALAVRA PARA SER TESTADA
               while(cont < pal.length){
               
                   aux=0;
                   // LOGICA APLICADA PARA FAZER A TRANSIÇÃO DE UM ESTADO PARA O OUTRO
                   while( aux != j) {
                       
                       if(mat[aux][1]== pal[cont]){
                        if(mat[aux][0]== atual){
                            atual = mat[aux][2];
                            aux = j-1;
                        }
                       }
                       
                       aux++;
                       
                   }
                
                   System.out.println("Estado atual: " +atual);
                   
               
               cont++;
               
               
               }

               

                   System.out.println("Automato finalizado!!!");
                   System.out.println("Estado final: " +atual);
                   cont=0;
                   
                   
                   // VERIFICA SE EXISTE MAIS DE UM FINAL DIGITADO PELO USUARIO
                   while(cont!=estfim.length){
                       
                       if(atual == estfim[cont]){
                        fim = estfim[cont];
                       }
                       
                       System.out.println("Teste de laço: "+ estfim[cont]);
                       cont++;
                   }
  
                   System.out.println("Estado final: " +fim);
                   // MOSTRA SE FOI RECONHECIDA A PALAVRA OU NAO 
                   if(atual == fim ){
                    System.out.println("Palavra reconhecida pelo automato!!!");
                  }else{
                       System.out.println("Palavra rejeitada pelo automato!!!");
                 }


             }
    
}
