package main.modulos.AutomatoFinitoDeterministico.validators;

import com.sun.media.sound.InvalidFormatException;

import java.util.HashMap;
import java.util.Vector;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michel
 */
public class AFDValidator {
    public HashMap<Integer, String> mapaEstados = new HashMap<Integer, String>();

    /**
     *
     * @param FD_jTable
     * @return
     * @throws InvalidFormatException
     */
    public String[][] jTableToMatriz(javax.swing.JTable FD_jTable, String alfabeto) throws InvalidFormatException {
        if(FD_jTable.getColumnCount() <= 1 || FD_jTable.getRowCount() <= 1)
            throw new InvalidFormatException("Tabela de Transições vazia");

        int numberRow = FD_jTable.getRowCount() + 1,
            numberColumn = FD_jTable.getColumnCount();
        String header [] = separarPorVirgula("estados, " + alfabeto);
        String matriz[][] = new String[numberRow][numberColumn];

        for (int j = 0; j < matriz[0].length; j++) {
            matriz[0][j] = header[j];
        }
        for (int i = 0; i < matriz.length -1; i++) {
            mapaEstados.put(i, (String) FD_jTable.getValueAt(i, 0));
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i + 1][j] = (String) FD_jTable.getValueAt(i , j );
            }
        }
        return matriz;
    }
      
   
    public  String[] inverterEstados(String[] estadosInvertidos){
        String [] estados = new String[estadosInvertidos.length];
        for (int i = estados.length -1, j = 0; i >= 0; i--, j ++) {
            estados[j] = estadosInvertidos[i];
        }
        return estados;
    }

    public String[] separarPorVirgula(JTextField JField) {
        return JField.getText().split(",");
    }

    public String[] separarPorVirgula(String text) {
        return text.split(",");
    }


    /**
     * Seguindo o mesmo padrão definido pelo AFD A0B , A1C     (estado atual, alfabeto, estado destino)
     * @param matriz
     * @return
     */
    public String formatarTransicoes(String[][] matriz) {
        StringBuilder transicoes = new StringBuilder();
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                transicoes.append("[");
                transicoes.append(matriz[i][0]);           //localizado meu estado
                transicoes.append("]");
                transicoes.append(matriz[0][j]);           //localizado meu alfabeto
                transicoes.append("[");
                transicoes.append(matriz[i][j]);        //localizado meu valor
                transicoes.append("]");
                transicoes.append(",");
            }
        }
        String transicoesString = transicoes.toString();
        return transicoesString.replaceAll(" ", "");
    }
}
