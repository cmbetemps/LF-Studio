import domain.Automato;
import domain.NaoDeterministico;
import org.junit.Test;
import utils.JsonFormatter;

public class JsonFormatterTest {
  JsonFormatter formatter = new JsonFormatter();

  @Test
  public void shouldBeCreatedAJsonFile(){
    String  entrada = "02020101aaaaa";
    String alfabeto = "012a";
    int [][][]  transicao =
        {{{1,0,1},   {},    {},  {}},
        {{},    {1},   {1}, {1}},
        {{},    {},    {}}, {}} ;
    int estadoInicial = 0;
    int aceitacao[] = {0};
    NaoDeterministico naoDeterministico = new NaoDeterministico(aceitacao,estadoInicial, transicao, alfabeto);
    formatter.writeObject(naoDeterministico);
    System.out.println("Aquivo preenchido");
  }

  @Test
  public void shouldBeRead() {
    Automato automato = formatter.readJson();
    System.out.println(automato.toString());
  }
}
