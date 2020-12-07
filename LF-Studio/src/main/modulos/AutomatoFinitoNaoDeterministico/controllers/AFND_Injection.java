/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.controllers;

import java.util.HashMap;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.models.NaoDeterministico;

public class AFND_Injection {

    static NaoDeterministico automato ;
    static HashMap<Integer, String> map;
    static HashMap<Integer, String> mapAlfabeto;
    static HashMap<String, Integer> mapAlfabetoInverso;
    

    public static void setAutomato(int[] aceitacao, int estadoInicial, int[][][] transicao, String alfabeto){
        automato = new NaoDeterministico(aceitacao, estadoInicial, transicao, alfabeto);
    }

    public static NaoDeterministico getAutomato(){
        return automato;
    }

    public static HashMap getMap() {
        return map;
    }

    public static void setMap(HashMap map) {
        AFND_Injection.map = map;
    }

    public static HashMap<Integer, String> getMapAlfabeto() {
        return mapAlfabeto;
    }

    public static void setMapAlfabeto(HashMap<Integer, String> mapAlfabeto) {
        AFND_Injection.mapAlfabeto = mapAlfabeto;
    }

    public static HashMap<String, Integer> getMapAlfabetoInverso() {
        return mapAlfabetoInverso;
    }

    public static void setMapAlfabetoInverso(HashMap<String, Integer> mapAlfabetoInverso) {
        AFND_Injection.mapAlfabetoInverso = mapAlfabetoInverso;
    }
    
    
    
    


}