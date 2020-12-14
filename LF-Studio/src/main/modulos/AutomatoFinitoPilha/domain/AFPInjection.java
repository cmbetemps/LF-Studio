/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoPilha.domain;

public class AFPInjection {

    static AutomatoDePilha automato ;
    static String aviso;

    public static boolean isConfirm() {
        return confirm;
    }

    public static void setConfirm(boolean confirm) {
        AFPInjection.confirm = confirm;
    }
    static boolean confirm;

    public static String getAviso() {
        return aviso;
    }

    public static void setAviso(String aviso) {
        AFPInjection.aviso = aviso;
    }
    
    public static void setAutomato(AutomatoDePilha automatoI){
        automato =automatoI;
    }
    
    public static AutomatoDePilha getAutomato(){
        return automato;
    }



}