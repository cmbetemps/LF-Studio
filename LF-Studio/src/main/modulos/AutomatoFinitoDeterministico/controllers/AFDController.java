/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.modulos.AutomatoFinitoDeterministico.controllers;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import main.layout.CustomTable;
import main.modulos.AutomatoFinitoDeterministico.FdInjection;
import main.modulos.AutomatoFinitoDeterministico.domain.AFD;
import main.modulos.AutomatoFinitoDeterministico.validators.AFDValidator;
import main.modulos.Commons.JsonFormatter;
import main.modulos.Commons.FileChooser;

/**
 *
 * @author michel
 */
public class AFDController {

    AFDValidator validator = new AFDValidator();

    public boolean processarAutomato(AFD automato) {
        if (automato != null) {
            return true;
        }
        return false;
    }

    public AFD gerarAutomato(String alfabeto, javax.swing.JTable FD_jTable, String estadoInicial, String estadosFinais) throws Exception {
        String[][] matrizTransicoes = validator.jTableToMatriz(FD_jTable, alfabeto);
        String transicoesFormatadas = validator.formatarTransicoes(matrizTransicoes);
        return null;
    }

    public AFD instanciationAutomato(String path) {
        JsonFormatter json = new JsonFormatter();
        AFD automato = json.readAFDJson(path);
        return automato;
    }

    public void writeAFD(AFD automato) {
        FileChooser chooser = new FileChooser();
        String path = chooser.save();
        if (path != null) {
            JsonFormatter json = new JsonFormatter();
            json.writeObject(path, automato);
        }
    }

    public void saveDeterministico(AFD automato) {
        FileChooser chooser = new FileChooser();
        String path = chooser.save();
        if (path != null) {
            JsonFormatter json = new JsonFormatter();
            json.writeObject(path, automato);
            JOptionPane.showMessageDialog(null, "Arquivo Salvo em:" + path);
        }
    }

    public void setarCampos(JTable table, JTextField alfabeto, JTextField estadosFinais, JTextField estadoInicial, JTextField estados, DefaultTableModel model) {
        if(FdInjection.getAutomato() != null){
            String alfabetoMap = FdInjection.getAutomato().getAlfabetoToString();
            String estadosFinaisMap = FdInjection.getAutomato().getEstadosFinaisToString();
            String estadoInicialMap = FdInjection.getAutomato().getEstadoInicial();
            String estadosMap = FdInjection.getAutomato().getEstadosToString();
            alfabeto.setText(alfabetoMap);
            estadosFinais.setText(estadosFinaisMap);
            estadoInicial.setText(estadoInicialMap);
            estados.setText(estadosMap);

            for (int i = 0; i < FdInjection.getAutomato().transicoes.length; i++) {
                Vector<String> test = new Vector<>();
                for (int j = 0; j < FdInjection.getAutomato().transicoes[i].length; j++) {
                    test.add((String) FdInjection.getAutomato().transicoes[i][j]);
                }
                model.addRow(test);
            }
            table.setModel(model);
        }
    }

    public void gerarAutomato(String alfabeto, String estadoIni, String estados, String estadoFinalis, JTable table, boolean isWrite) {
        AFD automato = null;
        String[][] transicoes = mapearTransicoes(table);
        if (isWrite) {
            automato = new AFD(estados, alfabeto, estadoIni, estadoFinalis, transicoes);
            saveDeterministico(automato);
        } else {
            FdInjection.setAutomato(automato);
        }

    }

    private String[][] mapearTransicoes(JTable table) {
        String[][] transicoes = new String[table.getRowCount()][table.getColumnCount()];
        for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                        transicoes[i][j] = (String) table.getValueAt(i, j);
                }
            }
        return transicoes;
    }

}
