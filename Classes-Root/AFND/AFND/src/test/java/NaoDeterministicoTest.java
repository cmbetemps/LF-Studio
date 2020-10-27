import domain.NaoDeterministico;
import exceptions.IsNotBelongOnLanguage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaoDeterministicoTest {


  @Test
  public void shouldBeCorrectAlgorithmENFABasic() throws IsNotBelongOnLanguage   {
    ///
    //0  1  2
    int [][][]  transicao = {
      //     0       1
      /*q0*/{{0,1},{0}},
      /*q1*/{{},  {2}},
      /*q2*/{{2},   {2},
             {}, {1}}
          };
    String alfabeto = "01";
    String  entrada = "00001";
    int aceitacao[] = {2};
    int estadoInicial = 0;
    NaoDeterministico naoDeterministico = new NaoDeterministico(aceitacao,estadoInicial,  transicao, alfabeto);
    assertEquals("Deve retornar true para  ser uma Palavra valida, baseada no automato", true, naoDeterministico.reconhecer(entrada));
    System.out.println("CAMINHO");
    for (int i = 0; i < naoDeterministico.config.size();i++) {
      System.out.println(naoDeterministico.config.get(i));
    }
  }

}
