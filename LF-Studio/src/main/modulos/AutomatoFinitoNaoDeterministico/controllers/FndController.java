/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.controllers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import main.modulos.AutomatoFinitoNaoDeterministico.screens.FNDInjection;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.NaoDeterministico;
import main.modulos.AutomatoFinitoPilha.domain.AutomatoDePilha;
import main.modulos.Commons.FileChooser;
import main.modulos.Commons.JsonFormatter;

/**
 *
 * @author michel
 */
public class FndController {

  //
  private ArrayList<String> recebeTexto(javax.swing.JTextField FND_TextFieldAlfabeto ){

    String testa = FND_TextFieldAlfabeto.getText();
    String aux = "";
    ArrayList<String> possivelAlfabeto = new ArrayList<>();
    for (int i = 0; i < testa.length(); i++) {
      if(!String.valueOf(testa.charAt(i)).equals(",")){
        aux += testa.charAt(i);
      }else{
        possivelAlfabeto.add(aux);
        aux = "";
      }
    }
    return possivelAlfabeto;
  }

  /**
   * @author  Construtor com conversão de matriz int para char
   * para um automato nao deterministico com transição espontanea
   * @param alfabeto | String
   */
  public NaoDeterministico gerarAutomato(JTextField alfabeto, JTextField estadoInicialJ, JTextField estadosJ, JTextField estadosFinaisJ , JTable table, boolean isWriteObject) {
    // mandar direto
    String alfabetoInserido = alfabeto.getText();
    StringBuilder alfabetoFormatado = new StringBuilder();
    String estadoInicial = estadoInicialJ.getText();
    String estados = estadosJ.getText();
    String estadosFinais = estadosFinaisJ.getText();

    // Parte da tabela de transição
    String teste[][] = new String[table.getRowCount()][table.getColumnCount()];

    /// pos0 = string abc
    Map<Integer, String> mapaTransicao = new HashMap<>();
    Map<String, Integer> mapaTransInverso = new HashMap<>();
    Map<Integer, String> mapaTransicaoAlfabeto = new HashMap<>();
    Map<String, Integer> mapaTransInversoAlfabeto = new HashMap<>();

    for (int i = 0; i < table.getRowCount(); i++) {
      mapaTransicao.put(i, (String) table.getValueAt(i, 0));
      mapaTransInverso.put((String) table.getValueAt(i, 0), i);
      for (int j = 1; j < table.getColumnCount(); j++) {
        teste[i][j] = (String) table.getValueAt(i, j);
      }
    }

    // Parte estado inicial
    int chaveEstado = mapaTransInverso.get(estadoInicial);
    // Parte de estados finais
    int chaveEstadosFinais[] = new int[estadosFinais.split(",").length];
    String[] comparaEstadosFinais = estadosFinais.split(",");
    int contaEstadosFinais = 0;

    while (contaEstadosFinais < chaveEstadosFinais.length) {
      chaveEstadosFinais[contaEstadosFinais] = mapaTransInverso.get(comparaEstadosFinais[contaEstadosFinais]);
      contaEstadosFinais++;
    }

    int[][][] matrizConversao = new int[table.getRowCount()][table.getColumnCount() - 1][];
    for (int i = 0; i < table.getRowCount(); i++) {
      for (int j = 0; j < table.getColumnCount() - 1; j++) {
        if (teste[i][j + 1] != null) {
          matrizConversao[i][j] = new int[teste[i][j + 1].split(",").length];
        } else {
          matrizConversao[i][j] = new int[0];
        }
        for (int k = 0; k < matrizConversao[i][j].length; k++) {
          matrizConversao[i][j][k] = mapaTransInverso.get(teste[i][j + 1].split(",")[k]);
        }
      }
    }

    for (int i = 0; i < alfabetoInserido.split(",").length; i++) {
      mapaTransicaoAlfabeto.put(i, (String) alfabetoInserido.split(",")[i]);
      mapaTransInversoAlfabeto.put((String) alfabetoInserido.split(",")[i], i);
      alfabetoFormatado.append(String.valueOf(i));
    }

    Object[][] transicoes =  new Object[table.getRowCount()][table.getColumnCount()];
    for (int i = 0; i < table.getRowCount(); i++) {
      for (int j = 0; j < table.getColumnCount(); j++) {
        transicoes[i][j] = table.getValueAt(i, j);
      }
    }

    String elementosAlfabeto = alfabetoInserido.replaceAll(",", "");
    String[]  primeiraLinha = new String[elementosAlfabeto.length() + 1];
    primeiraLinha[0] = "Estados";

    for(int i = 0; i < elementosAlfabeto.length(); i++){
      primeiraLinha[i +1] = elementosAlfabeto.charAt(i) + "";

    }
    NaoDeterministico automato = new NaoDeterministico(chaveEstadosFinais, chaveEstado, matrizConversao, alfabetoFormatado.toString());
    automato.auxiliarMap.setMapAlfabeto((HashMap<Integer, String>) mapaTransicaoAlfabeto);
    automato.auxiliarMap.setMapAlfabetoInverso((HashMap<String, Integer>) mapaTransInversoAlfabeto);
    automato.auxiliarMap.setAlfabeto(alfabetoInserido);
    automato.auxiliarMap.setMap((HashMap) mapaTransicao);
    automato.auxiliarMap.setEstadoInicial(estadoInicial);
    automato.auxiliarMap.setEstadosFinais(estadosFinais);
    automato.auxiliarMap.setEstados(estados);
    automato.auxiliarMap.setTransicosTable(transicoes);
    automato.auxiliarMap.setAlfabetoTable(primeiraLinha);

    if(isWriteObject){
      saveNaoDeterministico(automato);
    } else {
      FNDInjection.setAutomato(automato);
    }

    return automato;
  }



  public void setarCampos(JTable table, JTextField alfabeto, JTextField estadosFinais, JTextField estadoInicial, JTextField estados){
    if(FNDInjection.getAutomato() != null){
      alfabeto.setText(FNDInjection.getAutomato().auxiliarMap.getAlfabeto());
      estadosFinais.setText(FNDInjection.getAutomato().auxiliarMap.getEstadosFinais());
      estadoInicial.setText(FNDInjection.getAutomato().auxiliarMap.getEstadoInicial());
      estados.setText(FNDInjection.getAutomato().auxiliarMap.getEstados());
      table.setModel(new javax.swing.table.DefaultTableModel(
        FNDInjection.getAutomato().auxiliarMap.getTransicosTable(),
        FNDInjection.getAutomato().auxiliarMap.getAlfabetoTable())
      );
    }
  }

  public NaoDeterministico instanciationAutomato(String pathAbsolute) throws FileNotFoundException {
    JsonFormatter json = new JsonFormatter();
    NaoDeterministico automato = json.readJNaoDeterministicoJson(pathAbsolute);
    System.out.println(automato.toString());
    return automato;
  }

  public void saveNaoDeterministico(NaoDeterministico automato) {
    FileChooser chooser = new FileChooser();
    String path = chooser.save();
    if(path != null){
      JsonFormatter json = new JsonFormatter();
      json.writeObject(path, automato);
      JOptionPane.showMessageDialog(null, "Arquivo Salvo em:" + path);
    }
  }

  public void validarPalavra(JTextArea Retorno, JTextField entrada) {
    String temp = "";
    HashMap map = FNDInjection.getAutomato().auxiliarMap.getMap();
    HashMap mapAlfabeto = FNDInjection.getAutomato().auxiliarMap.getMapAlfabeto();
    for (String x: entrada.getText().split("")) {
            temp = temp.concat(FNDInjection.getAutomato().auxiliarMap.getMapAlfabetoInverso().get(x).toString());
    }
        FNDInjection.getAutomato().config.clear();
        FNDInjection.getAutomato().reconhecer(temp);
        StringBuilder text = new StringBuilder();
        StringBuilder substitutoAlfabeto = new StringBuilder();
        for (String x : FNDInjection.getAutomato().config) {
            if (x.indexOf("[") != -1) {
                temp = x.substring(x.indexOf("["), x.indexOf("]") + 1).replace("[", "").replace("]", "");
                x = x.replace("[" + temp + "]", "[" + FNDInjection.getAutomato().auxiliarMap.getMap().get(Integer.valueOf(temp)) + "]");
            }
            if (x.contains("<<backTrack>>") || x.equals("Rejeitada") || x.equals("Aceita")) {
                substitutoAlfabeto.append(x);
            } else {
                for (int i = 0; i < x.length(); i++) {
                    if (x.charAt(i) == '[') {
                        substitutoAlfabeto.append(x.substring(i, x.indexOf("]", i) + 1));
                        i = x.indexOf("]", i);
                    } else {
                        substitutoAlfabeto.append(mapAlfabeto.get(Integer.valueOf(String.valueOf(x.charAt(i)))));
                    }
                }
            }
            text.append(substitutoAlfabeto);
            text.append("\n");
            substitutoAlfabeto = new StringBuilder();
        }
        Retorno.setText(text.toString());
    
    }

}
