package modulos.Common;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import main.modulos.AutomatoFinitoDeterministico.domain.AFD;
import main.modulos.AutomatoFinitoDeterministico.domain.Configuracoes;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.NaoDeterministico;
import main.modulos.Commons.JsonFormatter;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michel
 */
public class JsonTest {

    @Test
    public void shouldBeReadAnObject(){
        JsonFormatter<NaoDeterministico> test = new JsonFormatter<NaoDeterministico>();
        try {
            test.readJNaoDeterministicoJson("/home/michel/Desktop/test-one.json");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @Test
    public void shouldBeInstanceAnObject(){
         String alfabeto = "ab";

        // ESTADOS
        String estados = "q1,q2,q3,q4,q5,q6,q7,q8";

        // ESTADO INICIAL EX: A
        String estadoInicial = "q1";

        // ESTADO FINAL PODE SER MAIS DE UM EX: BC
        String estadosFinais = "q1,q3,q7";

        // FUNÇÕES DE TRANSIÇÃO DE ESTADOS
        String [][] transicoes = new String[][]{
                {"q1", "a", "q2"},
                {"q1", "b", "q4"},
                {"q2", "a", "q5"},
                {"q2", "b", "q3"},
                {"q3", "a", "q2"},
                {"q3", "b", "q6"},
                {"q4", "a", "q1"},
                {"q4", "b", "q5"},
                {"q5", "a", "q5"},
                {"q5", "b", "q5"},
                {"q6", "a", "q3"},
                {"q6", "b", "q5"},
                {"q7", "a", "q6"},
                {"q7", "b", "q8"},
                {"q8", "a", "q7"},
                {"q8", "b", "q3"},
        };

        // CRIA UM AFD COM OS DADOS INSERIDOS
//        AFD meuAFD = new AFD(estados, alfabeto, estadoInicial, estadosFinais, transicoes);
 

    }
}
