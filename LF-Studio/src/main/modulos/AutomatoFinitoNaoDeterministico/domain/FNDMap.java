/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author michel
 */
public class FNDMap {
  
//    TableModel model;
    protected HashMap<Integer, String> map;
    protected HashMap<Integer, String> mapAlfabeto;
    protected HashMap<String, Integer> mapAlfabetoInverso;
    public List<String> config = new ArrayList<String>();
    
    String estadosFinais;
    String estadoInicial;
    String estados;
    String alfabeto;
    
    private Object[][] transicoes;
    private String[] alfabetoTable;
    
  public void setEstadosFinais(String estados) {
        this.estadosFinais = estados;
    }
    
    public String getEstadosFinais( ) {
        return this.estadosFinais;
    }
    
    
    public void setEstadoInicial(String estadoInicial) {
        this.estadoInicial = estadoInicial;
    }
    
    public String getEstadoInicial( ) {
        return this.estadoInicial;
    }
    
       
    public void setEstados(String estados) {
        this.estados = estados;
    }
    
    public String getEstados( ) {
        return this.estados;
    }
    
   public void setAlfabeto(String alfabeto) {
        this.alfabeto = alfabeto;
    }
    
    public String getAlfabeto( ) {
        return this.alfabeto;
    }
    
    public HashMap getMap() {
        return this.map;
    }

    public  void setMap(HashMap map) {
        this.map = map;
    }

    public  HashMap<Integer, String> getMapAlfabeto() {
        return this.mapAlfabeto;
    }

    public  void setMapAlfabeto(HashMap<Integer, String> mapAlfabeto) {
        this.mapAlfabeto = mapAlfabeto;
    }

    public  HashMap<String, Integer> getMapAlfabetoInverso() {
        return this.mapAlfabetoInverso;
    }

    public  void setMapAlfabetoInverso(HashMap<String, Integer> mapAlfabetoInverso) {
        this.mapAlfabetoInverso = mapAlfabetoInverso;
    }

  public void setTransicosTable(Object[][] transicoes) {
       this.transicoes = transicoes;
  }

  public Object[][] getTransicosTable( ) {
    return this.transicoes;
  }


  public void setAlfabetoTable(String [] alfabetoTable) {
  this.alfabetoTable = alfabetoTable;
  }
  public String[] getAlfabetoTable() {
    return this.alfabetoTable;
  }
}
