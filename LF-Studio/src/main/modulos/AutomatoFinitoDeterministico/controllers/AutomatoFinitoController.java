/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.JTable;
import main.layout.CustomTable;
import main.modulos.AutomatoFinitoDeterministico.domain.model.AFD;
import main.modulos.AutomatoFinitoDeterministico.validators.AFDValidator;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.exceptions.InvalidFormatException;

/**
 *
 * @author michel
 */
public class AutomatoFinitoController {
  AFDValidator validator = new AFDValidator();

  public CustomTable insertTabela( String[] estados,  String[] alfabeto ){

    CustomTable tableModel = new CustomTable();

    if(estados != null && estados.length > 1)
      estados = validator.inverterEstados(estados);

    tableModel.addColumn("estado");

    for (String rowName : estados) {
      Vector<String> vector = new Vector<String>();
      vector.add(rowName);
      tableModel.insertRow(0, vector);
    }

    for (String columnName : alfabeto) {
      tableModel.addColumn(columnName);
    }
    return tableModel;
  }


  public boolean processarAutomato(AFD automato){
    if(automato!= null){
      automato.configurarAutomato();
      return true;
    }
    return false;
  }

  public AFD gerarAutomato(String alfabeto, javax.swing.JTable FD_jTable, String estadoInicial, String estadosFinais) throws Exception {
    String[][] matrizTransicoes = validator.jTableToMatriz(FD_jTable, alfabeto);
    String transicoesFormatadas = validator.formatarTransicoes(matrizTransicoes);
    AFD automatoConfigurado = new AFD(alfabeto, estadoInicial, estadosFinais, transicoesFormatadas, validator.mapaEstados);
    automatoConfigurado.configurarAutomato();
    return automatoConfigurado;
  }


}
