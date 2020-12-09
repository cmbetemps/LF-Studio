package main.modulos.GramaticasLivreDeContexto.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import main.grupo03.AppController;
import main.modulos.GramaticasLivreDeContexto.domain.models.Alfabeto;
import main.modulos.GramaticasLivreDeContexto.domain.models.GLC;
import main.modulos.GramaticasLivreDeContexto.domain.models.Regras;

/**
 *
 * @author Grupo-03
 */
public class GLCController extends AppController {
    private final Tooltip tipo = Tooltip.GLC;
    
    private int qtdPalavras;
    private String simbolosTerminais;
    private String simbolosNaoTerminais;
    private String[][] matrizRegras;
    private String simboloInicial;
    private String palavra;
    private boolean statusOK;
    
    GLC glc;

    public GLCController() {
        this.setStatusOK(false);
    }

    public GLCController(int qtdPalavras, String simbolosTerminais, String simbolosNaoTerminais, String regras, String simboloInicial) {
        this.qtdPalavras = qtdPalavras;
        this.simbolosTerminais = addArrayListCharacter(simbolosTerminais);
        this.simbolosNaoTerminais = addArrayListCharacter(simbolosNaoTerminais);
        addRegras(regras);
        this.simboloInicial = simboloInicial;
    }
    
    public GLC gerarGLC() {
        // glc.quantidade = this.qtdPalavras;
        Alfabeto alfabeto = new Alfabeto(this.simbolosTerminais, this.simbolosNaoTerminais);
        Regras regras = new Regras(this.matrizRegras);
        glc = new GLC(this.simboloInicial, alfabeto, regras);
        return glc;
    }
    
    public void gerarTexts() {
        
    }
    
    private String addArrayListCharacter(String string) {
        String retorno = "";
        string = string.replaceAll(" ", "");
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(" ")) {
                retorno += (split[i].charAt(0));
            }
        }
        return retorno;
    }
    
    private void addRegras(String string) {
        string = string.replaceAll(" ", "");
        String[] split = string.split(",");
        int numMatriz = split.length/2;
        int contadorSplit = 0;
        this.matrizRegras = new String[numMatriz][2];
        for (int i = 0; i < numMatriz; i++) {
            for (int j = 0; j < 2; j++) {
                if (!split[i].equals(" ")) {
                    this.matrizRegras[i][j] = split[contadorSplit++];
                }
            }
        }
    }

    public int getQtdPalavras() {
        return qtdPalavras;
    }

    public void setQtdPalavras(int qtdPalavras) {
        this.qtdPalavras = qtdPalavras;
    }

    public String getSimbolosTerminais() {
        return simbolosTerminais;
    }

    public void setSimbolosTerminais(String simbolosTerminais) {
        this.simbolosTerminais = simbolosTerminais;
    }

    public String getSimbolosNaoTerminais() {
        return simbolosNaoTerminais;
    }

    public void setSimbolosNaoTerminais(String simbolosNaoTerminais) {
        this.simbolosNaoTerminais = simbolosNaoTerminais;
    }

    public String[][] getMatrizRegras() {
        return matrizRegras;
    }

    public void setMatrizRegras(String[][] matrizRegras) {
        this.matrizRegras = matrizRegras;
    }

    public String getSimboloInicial() {
        return simboloInicial;
    }

    public void setSimboloInicial(String simboloInicial) {
        this.simboloInicial = simboloInicial;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public GLC getGlc() {
        return glc;
    }

    public void setGlc(GLC glc) {
        this.glc = glc;
    }
    
    

    public boolean isStatusOK() {
        return statusOK;
    }

    public void setStatusOK(boolean status) {
        this.statusOK = status;
    }
   
}
