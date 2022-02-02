/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author rica_
 */
public class colorCelda extends DefaultTableCellRenderer {

    int index;

    public colorCelda(int color) {
        this.index = color;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        switch (table.getValueAt(row, index).toString()) {
            case "En proceso":
                setBackground(Color.red);
                break;
            case "Asignado":
                setBackground(new Color(36, 113, 163));
                break;
            case "Terminado":
                setBackground(Color.green);
                break;
        }
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        return this;

    }

}
