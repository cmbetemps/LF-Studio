package main.grupo03.controller;

import java.util.ArrayList;
import main.grupo03.model.GLC;

/**
 *
 * @author Grupo-03
 */
public class GLCController {

    public GLCController() {
    }
    
    public String teste () {
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
            // System.out.println(testeGLC.exportar(null, null, testeGLC));
            return "";
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }
    
}
