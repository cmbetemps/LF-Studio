
package main.modulos.GramaticasLivreDeContexto.domain.models;

public class Regras {
    String[][] matrizregras;
    
   /**
     * @Author Yann Silva
     *
    */
    public Regras(String[][] matrizderegrasinicial) {
        this.matrizregras = matrizderegrasinicial;
    }
    
    public String getRegrasToString() {
        String retorno = "";
        for (int i = 0; i < matrizregras.length; i++) {
            for (int j = 0; j < 2; j++) {
                retorno += matrizregras[i][j] + ",";
            }
        }
        return retorno;
    }
}
