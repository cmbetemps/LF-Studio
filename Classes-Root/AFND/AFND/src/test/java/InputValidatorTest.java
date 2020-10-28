import exceptions.InvalidFormatException;
import org.junit.Test;
import utils.IOValidator;

import static org.junit.Assert.assertEquals;

public class InputValidatorTest {
  @Test
  public void shouldBeCorrectInput() throws InvalidFormatException {
    String  entrada = "011012";
    String[] alfabeto = {"0", "1", "2"};
    assertEquals("Deve retornar true para  ser uma entrada valida, baseada no alfabeto", true, IOValidator.input(entrada, alfabeto));
  }

  @Test
  public void shouldBeConvertMatrizCharToInt()   {
    char [][][]  tabelaTransicao ={
      //alf|estados  a     b       c     d     e    f    g    h
      /*q1*/      {{'1','1','2', '1', '2','5'},{'0'}, {'1'}, {'1'}},
      /*q2*/      {{'1'},{'2'} , {'3'}, {'3'}, { '4'}, { '4'}, { '4'}},
      /*q3*/      {{'1'},{'2'} , {'3'}, {'3'}, { '4'}, { '4'}, { '4'}},
      /*q4*/      {{'1'},{'2'} , {'3'}, {'3'}, { '4'}, { '4'}, { '4'}},
      /*q5*/      {{'1'},{'2'} , {'3'}, {'3'}, { '4'}, { '4'}, { '4'}},};
    IOValidator test = new IOValidator();
    int [][][]  tabelaTransicaoInt = test.convertMatrizCharToInt(tabelaTransicao, true);
    assertEquals("Deve passar uma matriz 3Dimensoes como char e retornar uma matriz em matriz",  true, tabelaTransicaoInt != null ? true : false);
  }

  @Test
  public void shouldBeConvertArrayCharToInt(){
    char []  tabelaTransicao =
       {'1','1','2', '1', '2', '5'};
    IOValidator test = new IOValidator();
    int []  tabelaTransicaoInt = test.convertArrayCharToArrayInt(tabelaTransicao);
    for ( int i: tabelaTransicaoInt) {
      System.out.println(tabelaTransicaoInt[i]);
    }
  }
}
