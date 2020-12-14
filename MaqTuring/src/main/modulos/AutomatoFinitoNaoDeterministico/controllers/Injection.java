/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.controllers;

import java.util.HashMap;
import main.modulos.AutomatoFinitoNaoDeterministico.domain.models.NaoDeterministico;

public class Injection {

    static NaoDeterministico automato ;
    static HashMap<Integer, String> map;

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
        Injection.map = map;
    }
    
    


}