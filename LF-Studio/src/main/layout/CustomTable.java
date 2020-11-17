/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.layout;

import javax.swing.table.DefaultTableModel;

public class CustomTable extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == 0) {
            return false;
        } else {
            return true;
        }
    }
}
