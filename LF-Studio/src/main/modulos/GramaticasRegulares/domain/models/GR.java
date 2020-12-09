package main.modulos.GramaticasRegulares.domain.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import main.grupo03.AppModel;
import main.modulos.GramaticasRegulares.domain.utils.Regras;

public class GR extends AppModel{
    private final Tooltip tipo = Tooltip.GR;
    
    private int qtdPalavras;
    private String raizes;
    private String resultado;
    
    public List<String> nao_terminais; //LISTA DE NAO-TERMINAIS
    public List<String> terminais; //LISTA DE TERMINAIS
    public List<Regras> conj_regras; //LISTA DAS LISTAS DE DERIVACOES 

    public GR() {
        this.nao_terminais = new ArrayList(); //DEFINE NOVA LISTA DE NAO-TERMINAIS
        this.terminais = new ArrayList(); //DEFINE NOVA LISTA DE TERMINAIS
        this.conj_regras = new ArrayList(); //DEFINE NOVA LISTA DAS LISTAS DE DERIVACOES 
    }

    public int getQtdPalavras() {
        return qtdPalavras;
    }

    public void setQtdPalavras(int qtdPalavras) {
        this.qtdPalavras = qtdPalavras;
    }

    public String getRaizes() {
        return raizes;
    }

    public void setRaizes(String raizes) {
        this.raizes = raizes;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public Tooltip getTipo() {
        return tipo;
    }
    
    public String exportar(String diretorio) {
        try {
            Gson json = new Gson();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            // String strJson = json.toJson(this, ER.class);
            try (FileWriter writer = new FileWriter(diretorio)) {
                gson.toJson(this, writer);
            } catch (IOException e) {
                return "Erro ao exportar arquivo, falha ao cria-lo!";
            }
            // System.out.println(strJson);
            // System.out.println(toString());
        } catch (Exception e) {
            return "Erro ao exportar arquivo!";
        }
        return "Arquivo exportado com sucesso!";
    }
}
