/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico.controllers;

import main.modulos.AutomatoFinitoNaoDeterministico.domain.models.NaoDeterministico;

public class Injection {

    static NaoDeterministico automato ;

    public static void setAutomato(int[] aceitacao, int estadoInicial, int[][][] transicao, String alfabeto){
        automato = new NaoDeterministico(aceitacao, estadoInicial, transicao, alfabeto);
    }

    public static NaoDeterministico getAutomato(){
        return automato;
    }


}