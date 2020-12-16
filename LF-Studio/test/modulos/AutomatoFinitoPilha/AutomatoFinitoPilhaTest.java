package modulos.AutomatoFinitoPilha;

import main.modulos.AutomatoFinitoPilha.domain.Arvore;
import main.modulos.AutomatoFinitoPilha.domain.AutomatoDePilha;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AutomatoFinitoPilhaTest {

     // Linguagem das palavras com qualquer número de a's e b's, seguidos por c, seguido pelo inverso da primeira parte
    String estados = "s,f";
    String alfabetoFita = "abc";
    String alfabetoPilha = "ab";
    String estadoInicial = "s";
    String estadosFinais = "f";
    String pilhaInicial = "";

    String [][] matrizTransições = new String[][]{
        {"s", "a", "", "s", "a"},
        {"s", "a", "", "s", "b"},
        {"s", "b", "", "s", "b"},
        {"s", "c", "", "f", ""},
        {"f", "a", "a", "f", ""},
        {"f", "b", "b", "f", ""},
    };

    String palavraValida = "abcba";

    String palavraInvalida = "abbcba";

//    main.modulos.AutomatoFinitoPilha.domain.AutomatoDePilha AutomatoDePilha = new AutomatoDePilha(alfabetoFita, alfabetoPilha, estadoInicial, estadosFinais, pilhaInicial, matrizTransições);

    //        // Linguagem das palavras que possuem um número de a's seguido pelo mesmo número de b's;
        String estados2 = "p,q";
        String alfabetoFita2 = "ab";
        String alfabetoPilha2 = "A";
        String estadoInicial2 = "p";
        String estadosFinais2 = "q";
        String pilhaInicial2 = "";

        String[][] matrizTransições2 = new String[][]{
                {"p", "a", "", "p", "A"},
                {"p", "b", "A", "q", ""},
                {"p", "a", "A", "p", "AA"},
                {"q", "b", "A", "q", ""},
        };
//
       String palavra2 = "aaabbb";

       String palavra2Inv = "aababb";

//       AutomatoDePilha AutomatoDePilha2 = new AutomatoDePilha(alfabetoFita2, alfabetoPilha2, estadoInicial2, estadosFinais2, pilhaInicial2, matrizTransições2);

    @Before
    public void setup() {

    }

    @Test
    public void shouldRecognize() {
        Arvore configuracoes = new Arvore();
//        boolean test = AutomatoDePilha.Reconhecer(palavraValida, configuracoes);
//        assertEquals(test, true);
    }

    @Test
    public void shouldNotRecognize() {
        Arvore configuracoes = new Arvore();
//        boolean test = AutomatoDePilha.Reconhecer(palavraInvalida, configuracoes);
//        assertEquals(test, false);
    }

    @Test
    public void shouldRecognizeSecond() {
        Arvore configuracoes = new Arvore();
//        boolean test = AutomatoDePilha2.Reconhecer(palavra2, configuracoes);
//        assertEquals(test, true);
    }

    @Test
    public void shouldNotRecognizeSecond() {
        Arvore configuracoes = new Arvore();
//        boolean test = AutomatoDePilha2.Reconhecer(palavra2Inv, configuracoes);
//        assertEquals(test, false);
    }

}