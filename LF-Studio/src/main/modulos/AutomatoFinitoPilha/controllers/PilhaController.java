/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoPilha.controllers;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import main.modulos.AutomatoFinitoDeterministico.domain.AFD;
import main.modulos.AutomatoFinitoPilha.domain.AFPInjection;
import main.modulos.AutomatoFinitoPilha.domain.AutomatoDePilha;
import main.modulos.Commons.FileChooser;
import main.modulos.Commons.JsonFormatter;

import java.util.Vector;

/**
 *
 * @author michel
 */
public class PilhaController {

    private void saveDeterministico(AutomatoDePilha automato) {
        FileChooser chooser = new FileChooser();
        String path = chooser.save();
        if(path != null){
          JsonFormatter json = new JsonFormatter();
          json.writeObject(path, automato);
          JOptionPane.showMessageDialog(null, "Arquivo Salvo em:" + path);
        }
    }

  public void setarCampos(JTextField alfabetoFita, JTextField alfabetoPilha,  JTextField estadoInicial, JTextField estadosFinais ,String pilhaInicial, JTable table, DefaultTableModel model) {
    if(AFPInjection.getAutomato() != null){
      for (int i = 0; i < AFPInjection.getAutomato().transicoes.matrizTransições.length ; i++) {
        Vector<String> test = new Vector<>();
        for (int j = 0; j < AFPInjection.getAutomato().transicoes.matrizTransições[i].length ; j++) {
          test.add(AFPInjection.getAutomato().transicoes.matrizTransições[i][j]);
          if(j == 4){
            model.addRow(test);
          }
        }
      }
      table.setModel(model);
      alfabetoFita.setText(AFPInjection.getAutomato().alfabetos.getAlfabetoFita());
      alfabetoPilha.setText(AFPInjection.getAutomato().alfabetos.getAlfabetoPilha());
      estadoInicial.setText(AFPInjection.getAutomato().estados.getEstadoInicial());
      estadosFinais.setText(AFPInjection.getAutomato().estados.getEstadosFinais());
    }
  }


  public void gerarAutomato(String alfabetoFita, String alfabetoPilha,  String estadoInicial, String estadosFinais ,String pilhaInicial, JTable table, boolean isWrite) {
    if (isWrite) {
      AutomatoDePilha automato = null;
      String[][] matrizTransicoes = mapearTransicoes(table);
      automato = new AutomatoDePilha( alfabetoFita.replaceAll(",", ""),
        alfabetoPilha.replaceAll(",", ""),
        estadoInicial.replaceAll(",", ""),
        estadosFinais,
        pilhaInicial.replaceAll(",", ""),
        matrizTransicoes
      );
      saveDeterministico(automato);
      AFPInjection.setAutomato(automato);
    } else {

    }

  }

  private String[][] mapearTransicoes(JTable table) {
    String[][] transicoes = new String[table.getRowCount()][table.getColumnCount()];
    for (int i = 0; i < table.getRowCount(); i++) {
      for (int j = 0; j < table.getColumnCount(); j++) {
        transicoes[i][j] = (String) table.getValueAt(i, j);
      }
    }
    return transicoes;
  }


  public AutomatoDePilha instanciationAutomato(String pathAbsolute) {
    JsonFormatter json = new JsonFormatter();
    AutomatoDePilha automato = json.readAutomatoDePilhaJson(pathAbsolute);
    return automato;
  }
}
