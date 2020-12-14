package main.modulos.Commons;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import main.modulos.AutomatoFinitoDeterministico.domain.AFD;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.Automato;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.FNDMap;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.NaoDeterministico;
import main.modulos.AutomatoFinitoPilha.domain.AutomatoDePilha;

public class JsonFormatter<T> {

  
  public JsonFormatter(){
      
  }

  /**
   * Recebe um objeto instanciado de automato
   * e escreve em um arquivo JSON
   *
   */
  public void writeObject(String path, T object) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    String json = gson.toJson(object);
    if(!path.contains(".json")  ){
      path = path + ".json";
    } 
    try (FileWriter writer = new FileWriter(path)) {
      gson.toJson(object, writer);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public AFD readAFDJson(String path) {
    Gson gson = new Gson();
    System.out.println(System.getProperty("user.dir"));
    try {
      Reader reader = new FileReader(path);
      AFD automato = gson.fromJson(reader, AFD.class);
      return automato;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public AutomatoDePilha readAutomatoDePilhaJson(String path) {
    Gson gson = new Gson();
    System.out.println(System.getProperty("user.dir"));
    try {
      Reader reader = new FileReader(path);
      AutomatoDePilha automato = gson.fromJson(reader, AutomatoDePilha.class);
      return automato;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public NaoDeterministico readJNaoDeterministicoJson(String path) throws FileNotFoundException {
    Gson gson = new Gson();
    Reader reader = new FileReader(path);
    NaoDeterministico automato = gson.fromJson(reader, NaoDeterministico.class);
    return automato;
 
  }
}

        