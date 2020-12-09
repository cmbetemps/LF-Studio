
package main.modulos.GramaticasLivreDeContexto.domain.models;


public class Alfabeto {
    String[] terminais;
    String[] naoTerminais;

    /**
     * @author Yann Silva
     * Construtor
     * Recebe como parametro duas Strings de simbolosTerminais
     * e nao terminais para inserção no alfabeto
     * @param simbolosTerminaisRecebidos
     * @param simbolosNaoTerminaisRecebidos
     */
    public Alfabeto(String simbolosTerminaisRecebidos, String simbolosNaoTerminaisRecebidos) {
        terminais = simbolosTerminaisRecebidos.split("");
        naoTerminais = simbolosNaoTerminaisRecebidos.split("");
    }

    /**
     * @author Michel Silva
     * Metodo para validar inserção de simbolos terminais
     * @throws Exception
     */
    public void validar() throws Exception {
        for (int i  =0; i < naoTerminais.length; i++){
            for (int j = 0; j < terminais.length; j++) {
                if(naoTerminais[i].equals(terminais[j])){
                    throw new Exception("Não é permitido simbolos terminais [" + naoTerminais[i] + "] estarem contidos em nao terminais");
                }
            }
        }
    }



    /**
     * @author Michel Silva
     * Transformação de naoterminais vetor para string
     * @throws Exception
     */
    public String naoTerminaisToString() {
        String str = "";
        for (int i = 0; i < naoTerminais.length; i++) {
            for (int j = 0; j < naoTerminais[i].length(); j++) {
                str = str + naoTerminais[i];
            }
        }
        return str;
    }
}
