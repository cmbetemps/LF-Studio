/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoPilha.controllers;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import main.modulos.AutomatoFinitoPilha.domain.AFPInjection;
import main.modulos.AutomatoFinitoPilha.domain.AutomatoDePilha;
import main.modulos.Commons.FileChooser;
import main.modulos.Commons.JsonFormatter;

/**
 *
 * @author michel
 */
public class PilhaController {
    public void gerarAutomato(JTextField AlfabetoJText, 
            JTextField AlfabetoDaPilhaJText, JTextField EstadoInicialJText, 
            JTextField EstadosFinaisJText, String pilhaInicial, 
            JTable AFP_jTable, boolean isWrite) {
        AutomatoDePilha automato = null;
        if(isWrite){
          saveDeterministico(automato);
        } else {
          AFPInjection.setAutomato(automato);
        }
    }

    private void saveDeterministico(AutomatoDePilha automato) {
        FileChooser chooser = new FileChooser();
        String path = chooser.save();
        if(path != null){
          JsonFormatter json = new JsonFormatter();
          json.writeObject(path, automato);
          JOptionPane.showMessageDialog(null, "Arquivo Salvo em:" + path);
        }
    }
}
