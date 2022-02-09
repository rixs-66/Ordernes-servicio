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
public class colorCelda2 extends DefaultTableCellRenderer {

    int index;

    public colorCelda2(int color) {
        this.index = color;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        switch (table.getValueAt(row, index).toString()) {

            case "Pagado":
                setBackground(new Color(133, 225, 150));
                break;
            case "No Pagado":
                setBackground(new Color(225, 133, 133));
                break;
        }
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        return this;

    }

}
