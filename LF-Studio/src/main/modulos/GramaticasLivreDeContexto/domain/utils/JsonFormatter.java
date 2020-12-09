package main.modulos.GramaticasLivreDeContexto.domain.utils;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import main.modulos.GramaticasLivreDeContexto.domain.models.GLC;

public class JsonFormatter {

  /**
   * @author Michel Silva
   * Recebe um objeto gramatica para ser escrito
   * em JSON
   * @param gramatica
   * @param nome
   */
  public String writeObject(GLC gramatica, String nome)   {
    String userDirectory =  System.getProperty("user.dir") + "/";
    String nomeDoArquivo;
    String test = "";
    if(nome.length()> 5){
      test = nome.substring(nome.length() -5 , nome.length());
    }
    if(test.equals(".json")){
      nomeDoArquivo= nome;
    }else {
      nomeDoArquivo = nome +  ".json";
    }

    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.setExclusionStrategies(new ExclusionStrategy() {
      @Override
      public boolean shouldSkipField(FieldAttributes f) {
        return f.getName().contains("_");
      }
      @Override
      public boolean shouldSkipClass(Class<?> aClass) {
        return false;
      }
    });

    Gson gson = gsonBuilder.setPrettyPrinting().create();
    try (FileWriter writer = new FileWriter(nomeDoArquivo)) {
      gson.toJson(gramatica, writer);
      if(gramatica.is_gramaticaValida()) 
          return ("Arquivo criado com sucesso no diretorio:" + nomeDoArquivo);
      else 
          return "Erro ao exportar arquivo, falha ao cria-lo!";
    } catch (IOException e) {
      // e.printStackTrace();
      return "Erro ao exportar arquivo!";
    }
  }

  /**
   * @author Michel Silva
   * Le um caminho do usuario para leitura de arquivo
   * @param nome
   * @param diretorioAtual
   * @return
   * @throws FileNotFoundException
   */
  public GLC readJson(String nome, boolean diretorioAtual) throws FileNotFoundException {
    String userDirectory= System.getProperty("user.dir") + "/";
    String nomeDoArquivo=nome;
    String pathAbsoluto = userDirectory + nomeDoArquivo;
    if(!diretorioAtual){
      pathAbsoluto = nome;
    }
    System.out.println("arquivo:" + pathAbsoluto);
    Gson gson = new Gson();
    Reader reader = new FileReader(pathAbsoluto );
    // Convert JSON File to Java Object
    GLC gramatica = gson.fromJson(reader, GLC.class);

    return gramatica;
  }
}
