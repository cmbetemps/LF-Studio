/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos.AutomatoFinitoDeterministico.controllers;

import main.layout.CustomTable;
import main.modulos.AutomatoFinitoDeterministico.controllers.AutomatoFinitoController;
import main.modulos.AutomatoFinitoDeterministico.domain.model.AFD;
import main.modulos.AutomatoFinitoDeterministico.validators.AFDValidator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author michel
 */
public class AutomatoFinitoTest {
    AFDValidator validator;
    javax.swing.JTable FD_jTable;
    String header [], estados [];
    String estadoInicial, alfabeto , estadosFinais;
    AutomatoFinitoController controller;

    @Before
    public void setup() {

        validator  = new AFDValidator();
        controller = new AutomatoFinitoController();
        FD_jTable  = new JTable();

        alfabeto ="0,1";
        estadosFinais = "q0";
        header   = new String[]{"estados", "0", "1"};
        estados  = new String[]{"q0", "q1", "q2", "q3"};
        estadoInicial = "q0";

        FD_jTable.setModel(new javax.swing.table.DefaultTableModel(
          new Object [][] {
            {estados[0], "q0", "q2"},
            {estados[1], "q1", "q1"},
            {estados[2], "q2", "q2"},
            {estados[3], "q0", "q3"}

          },
          header
        ));

    }

    @Before
    public void destroy() {
        validator = null;
        controller = null;
        alfabeto = null;
        header = null;
        estados = null;
        estadosFinais = null;
        estadoInicial = null;
        FD_jTable = null;
        estadoInicial = null;
    }

    @Test
    public void insertAutomato() throws Exception {
        AFD automato = controller.gerarAutomato(alfabeto, FD_jTable, estadoInicial, estadosFinais);
        assertNotNull( "Deve retornar uma instancia de Automato",  automato);

    }
    
  
}
