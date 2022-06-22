package controller;

import model.invoice;
import model.line;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static controller.inputAndOutputActions.headerArray;

public class TablesActions {
    public void showInvoiceData(JTable invoiceTable, JLabel invoiceField,JTextField dateField,JTextField customerNameField,JLabel totalField, JTable linesTable) {
        DefaultTableModel model = (DefaultTableModel) invoiceTable.getModel();
        int rowIndex = invoiceTable.getSelectedRow();
        invoiceField.setText(String.valueOf(model.getValueAt(rowIndex, 0)));
        dateField.setText(String.valueOf(model.getValueAt(rowIndex, 1)));
        customerNameField.setText(String.valueOf(model.getValueAt(rowIndex, 2)));
        totalField.setText(String.valueOf(model.getValueAt(rowIndex, 3)));

        DefaultTableModel model2 = (DefaultTableModel) linesTable.getModel();
        model2.setRowCount(0);

        Object[] records = new Object[4];
        for (invoice invoice : headerArray){
            for (line line : invoice.getLinesArray()){
                if (Integer.parseInt(invoiceField.getText()) == invoice.getInvoiceNumber()){
                    records[0] = line.getItem();
                    records[1] = line.getPrice();
                    records[2] = line.getCount();
                    records[3] = line.clcTotal();
                    model2.addRow(records);
                }
            }
        }

    }

}

