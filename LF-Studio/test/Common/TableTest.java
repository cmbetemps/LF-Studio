package modulos.Common;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

import javax.swing.*;

/**
 *
 * @author michel
 */
public class TableTest {
 
       
      @Test
      public void  shouldBeCreateATable(){


        JTable jTable1 = new JTable();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {
             {"q0", null, null, null},
             {null, "q1", null, null},
             {null, null, "q3", null},
             {null, null, null, "q4"}
           },
           new String [] {
             "Title 1", "Title 2", "Title 3", "Title 4"
           }
         ));


       }
}
