package main.modulos.GramaticasLivreDeContexto.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import main.grupo03.AppController;
import main.modulos.GramaticasLivreDeContexto.domain.models.GLC;

/**
 *
 * @author Grupo-03
 */
public class GLCController extends AppController {
    private final Tooltip tipo = Tooltip.GLC;
    
    private String variaveis;
    private String simboloTerminal;
    private String regras;
    private char simboloInicial;
    private String palavra;
    private boolean statusOK;
    
    private GLC glc;
    
    private ArrayList<Character> variaveisGLC = new ArrayList();
    private ArrayList<Character> terminaisGLC = new ArrayList();
    private ArrayList<String> regrasGLC = new ArrayList();
    private ArrayList<String> resultado;

    public GLCController() {
        this.setStatusOK(false);
    }
    
    public void gerarGLC() throws Exception {
        addArrayListCharacter(this.variaveis, this.variaveisGLC);
        addArrayListCharacter(this.simboloTerminal, this.terminaisGLC);
        addRegras(this.regras);
        // glc = new GLC(variaveisGLC, terminaisGLC, regrasGLC, this.simboloInicial);
        // glc.derivar(this.palavra);
        // resultado = glc.getResultado();
        // statusOK = glc.isStatusOK();
    }
    
    public void gerarTexts() {
        
    }
    
    private void addArrayListCharacter(String string, ArrayList<Character> lista) {
        string = string.replaceAll(" ", "");
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(" ")) {
                lista.add(split[i].charAt(0));
            }
        }
    }
    
    private void addRegras(String rules) {
        rules = rules.replaceAll("\n", " ");
        String[] split = rules.split(",");
        for (int i = 0; i < split.length; i++) {
            regrasGLC.add(split[i].replace(",", ""));
        }
    }
    
    public String exportarGLC(String diretorio) {
        try {
            Gson json = new Gson();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String strJson = json.toJson(glc, GLC.class);
            try (FileWriter writer = new FileWriter(diretorio)) {
                gson.toJson(glc, writer);
            } catch (IOException e) {
                return "Erro ao exportar arquivo, falha ao criá-lo!";
            }
            // System.out.println(strJson);
            // System.out.println(glc.toString());
        } catch (Exception e) {
            return "Erro ao exportar arquivo!";
        }
        return "Arquivo exportado com sucesso!";
    }

    public String getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(String variaveis) {
        this.variaveis = variaveis;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getSimboloTerminal() {
        return simboloTerminal;
    }

    public void setSimboloTerminal(String simboloTerminal) {
        this.simboloTerminal = simboloTerminal;
    }

    public char getSimboloInicial() {
        return simboloInicial;
    }

    public void setSimboloInicial(char simboloInicial) {
        this.simboloInicial = simboloInicial;
    }
    
    public boolean isStatusOK() {
        return statusOK;
    }

    public void setStatusOK(boolean status) {
        this.statusOK = status;
    }

    public String getResultado() {
        String retorno = "";
        for(String result : resultado) {
            retorno += result + "\n";
        }
        return retorno;
    }
    
    @Override
    public String toString() {
        return "GLCController{" + "variaveis=" + variaveis + 
                ", terminais=" + simboloTerminal + 
                ", regras=" + regras + 
                ", raiz=" + simboloInicial + 
                ", derivar=" + palavra + '}';
    }
    
}
