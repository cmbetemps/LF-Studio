
package domain;
import exceptions.IsNotBelongOnLanguage;
import utils.IOValidator;

import java.util.ArrayList;
import java.util.List;

public class NaoDeterministico extends Automato {
     static IOValidator validator = new IOValidator();
     public List<String> config = new ArrayList<String>();
     int count;
    /**
     * @author Michel Silva
     *  Construtor com conversão de matriz int para char para um automato nao deterministico com transição espontanea
     * @param aceitacao
     * @param estadoInicial
     * @param transicao
     * @param alfabeto
     */
    public NaoDeterministico(char[] aceitacao, char estadoInicial, char [][][] transicao, String alfabeto ) {
        super(validator.convertArrayCharToArrayInt(aceitacao), estadoInicial,  validator.convertMatrizCharToInt(transicao), alfabeto);
    }

    /**
     * @author Michel Silva
     *  Construtor para automato não deterministico
     *  este nao possui transição espontanea
     * @param aceitacao
     * @param estadoInicial
     * @param transicao
     * @param alfabeto
     */
    public NaoDeterministico(int[] aceitacao, int estadoInicial, int [][][] transicao, String alfabeto ) {
        super(aceitacao, estadoInicial, transicao, alfabeto);
    }

    /**
     * Ao final da execução é reconhecida uma palavra pertencente ao alfabeto
     * caso algum dos caminhos leve para algum estado final
     * @param fitaDeEntrada
     * @return
     */
    public boolean reconhecer(String fitaDeEntrada)   {
        this.fitaDeEntrada = fitaDeEntrada;
        boolean aceita = false;
        try {
            aceita = controleFinito(fitaDeEntrada);
        } catch (IsNotBelongOnLanguage isNotBelongOnLanguage) {
            isNotBelongOnLanguage.printStackTrace();
        }
        return aceita;
    }

    /**
     * @author Michel Silva
     * Validação de Entrada correta
     * a entrada deve pertencer ao Alfabeto
     * @param entrada
     * @return
     * @throws IsNotBelongOnLanguage
     */
    boolean isValidEntrada(String entrada) throws IsNotBelongOnLanguage {
        for ( char elemento:  entrada.toCharArray()) {
            if(!alfabeto.contains(elemento + ""))
                throw new IsNotBelongOnLanguage("caractere " + elemento + " não pertence a linguagem");
        }
        return true;
    }

    /**
     * @author Michel Silva
     * A execução inicia sempre no estado 0
     * Após inicialização o vetor estados finais espera a execução da função
     * que testa todos os caminhos
     * @return
     */
    private boolean controleFinito(String entrada) throws IsNotBelongOnLanguage {
        if(!isValidEntrada(entrada)) return false;
        estadoInicial  = 0;
        int [] estados ={estadoInicial};
        int [] estadosFinais = testa(entrada, estados, 0);
        if(aceita(estadosFinais)){
            System.out.println("aceita");
            return true;
        }else {
            System.out.println("rejeita");
            return false;
        }
    }

    /**
     * Função recursiva com backtrack
     * @param entrada
     * @param estados
     * @param posicao
     * @return
     */
    private int[] testa(String entrada, int[] estados, int posicao) {
        if(posicao == entrada.length()){  //chegou no final
            imprimeCI(entrada, estados[0], posicao);
            if(aceita(estados)){
                return estados;
            }
            config.add("<<backTrack>>Fim da cadeia");
            System.out.println("<<backtrack>> Fim da cadeia");
            return null;
        }
        /**                                     Matriz de transição                                            0       1
         *                                      Cada linha é equivalente a um estado                    q0  (q0,q1)   (q0)
         *                                      Cada coluna equivale a um possivel elemento de entrada  q1  (q0)      (q1)
         *                                      Os novos estados se darão na terceira dimensão da matriz transicao[0][0][0]  =q0    transicao[0][0][1] = q1
         */
        int elemento = Integer.parseInt(entrada.substring(posicao, posicao+1));
        for (int i : estados){
            imprimeCI(entrada, i, posicao);
            // acesso a matriz de transição com i ( estado)   elemento ( elemento)  e retorna um vetor equivalente aos estados possiveis a ir
            int[] novosEstados= transicao[i][elemento];
            if(novosEstados.length == 0){
                imprimeCI(entrada, i, posicao);
                config.add("<<backTrack>> sem transicoes");
                System.out.println("<<backTrack>> sem transicoes");
                return null;
            }
            System.out.println("Estado " + i);
            int[] transicoes = testa(entrada, novosEstados, posicao + 1);
            if(transicoes != null) return transicoes ;
        }
        return null;
    }

    /**
     * Só é preciso um dos estados ser final
     * para uma palavra ser aceita
     * portanto é percorrido o vetor de estados passados pela tabela de transição
     * @param estados
     * @return
     */
    private boolean aceita(int[] estados) {
        if(estados == null) return false;
        for (int i : estados){
            for(int j : aceitacao){
                if(i == j){
                    return true;
                }
            }
        }
        return false ;
    }

    /**
     * Imprime cada interação
     * @param entrada
     * @param estado
     * @param posicao
     */
    private void imprimeCI(String entrada,int estado,  int posicao) {
        config.add(entrada.substring(0, posicao) + "[q" +  estado+ "]" + entrada.substring(posicao) + "");
        System.out.println(entrada.substring(0, posicao) + "[q" +  estado+ "]" + entrada.substring(posicao));
    }

}