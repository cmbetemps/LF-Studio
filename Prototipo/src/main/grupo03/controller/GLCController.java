package main.grupo03.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import main.grupo03.model.GLC;

/**
 *
 * @author Grupo-03
 */
public class GLCController {
    
    private String variaveis;
    private String terminais;
    private String regras;
    private char raiz;
    private String derivar;

    public GLCController() {
    }
    
    public void gerarGLC() {
        
    }

    public String getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(String variaveis) {
        this.variaveis = variaveis;
    }

    public String getTerminais() {
        return terminais;
    }

    public void setTerminais(String terminais) {
        this.terminais = terminais;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public char getRaiz() {
        return raiz;
    }

    public void setRaiz(char raiz) {
        this.raiz = raiz;
    }

    public String getDerivar() {
        return derivar;
    }

    public void setDerivar(String derivar) {
        this.derivar = derivar;
    }

    @Override
    public String toString() {
        return "GLCController{" + "variaveis=" + variaveis + 
                ", terminais=" + terminais + 
                ", regras=" + regras + 
                ", raiz=" + raiz + 
                ", derivar=" + derivar + '}';
    }
    
    public void teste () {
        ArrayList<Character> variaveis = new ArrayList();
        ArrayList<Character> terminais = new ArrayList();
        ArrayList<String> regras = new ArrayList();
        char raiz = 'E';

        variaveis.add('E');
        variaveis.add('I');
        variaveis.add('a');
        variaveis.add('b');
        variaveis.add('c');
        variaveis.add('+');
        variaveis.add('*');
        variaveis.add('(');
        variaveis.add(')');

        terminais.add('a');
        terminais.add('b');
        terminais.add('c');
        terminais.add('+');
        terminais.add('*');
        terminais.add('(');
        terminais.add(')');

        regras.add("E -> I|E*E");
        regras.add("E -> E + E");
        regras.add("E -> (E)");
        regras.add("E -> a");
        regras.add("E -> c");
        regras.add("I -> a");
        regras.add("I -> b");
        regras.add("I -> Ia");
        regras.add("I -> Ib");

        
        try {
            GLC testeGLC = new GLC(variaveis,terminais,regras,raiz);
            testeGLC.derivar("aa*a+c");
            Gson json = new Gson();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String strJson = json.toJson(testeGLC, GLC.class);
            try (FileWriter writer = new FileWriter("staff.json")) {
                gson.toJson(testeGLC, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(strJson);
            System.out.println(testeGLC.toString());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
    
}
