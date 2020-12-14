/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoNaoDeterministico;

import main.modulos.AutomatoFinitoNaoDeterministico.domain.NaoDeterministico;

public class FNDInjection {
    static NaoDeterministico automato ;


    public static void setAutomato(NaoDeterministico afnd){
        automato = afnd;
    }

    public static NaoDeterministico getAutomato(){
        return automato;
    }

}