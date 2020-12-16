/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.MaquinaTuring.controllers;

import java.util.HashMap;
import main.modulos.AutomatoFinitoPilha.domain.AutomatoDePilha;

public class Turing_Injection {

    static AutomatoDePilha automato ;
    static String estados = "";
    static String aviso;

    public static boolean isConfirm() {
        return confirm;
    }

    public static void setConfirm(boolean confirm) {
        Turing_Injection.confirm = confirm;
    }
    static boolean confirm;

    public static String getAviso() {
        return aviso;
    }

    public static void setAviso(String aviso) {
        Turing_Injection.aviso = aviso;
    }
    
    public static void setAutomato(String alfabetoFita, String alfabetoPilha, String estadoInicial, String estadosFinais, String pilhaInicial, String[][] matrizTransições){
        automato = new AutomatoDePilha(alfabetoFita, alfabetoPilha, estadoInicial, estadosFinais, pilhaInicial, matrizTransições, estados);
    }
    
    public static AutomatoDePilha getAutomato(){
        return automato;
    }

}