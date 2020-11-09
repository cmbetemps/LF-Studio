/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.controllers;

import java.util.ArrayList;

/**
 *
 * @author michel
 */
public class AutomatoFinitoController {
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
}
