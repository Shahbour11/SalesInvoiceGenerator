package controller;

import model.invoice;
import model.line;
import view.InvoiceDialoge;
import view.LineDialoge;
import view.mainFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class inputAndOutputActions {

    public static ArrayList<invoice> headerArray = new ArrayList<>();

    public void openFile(JTable invoicesTable) throws IOException {
        JOptionPane.showMessageDialog(null, "Please select the Invoices' CSV File", "Sales Invoice Generator", JOptionPane.INFORMATION_MESSAGE);

        // Open CSV Headers' file and Save it in Header Array
        JFileChooser myFileChooser = new JFileChooser();
        int result = myFileChooser.showOpenDialog(null);
        String headersPath = myFileChooser.getSelectedFile().getPath();
        if (result == JFileChooser.APPROVE_OPTION) {
            headerArray.clear();
            BufferedReader theBuffReader = null;
            try {
                theBuffReader = new BufferedReader(new FileReader(headersPath));
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.ERROR_MESSAGE);
            }
            while (true) {
                try {
                    if (!((headersPath = theBuffReader.readLine()) != null)) break;
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,
                            e.getMessage(),
                            "Sales Invoice Generator",
                            JOptionPane.ERROR_MESSAGE);
                }
                String[] recordData = headersPath.split(",", 3);
                invoice newInvoice = null;
                try {
                    newInvoice = new invoice(Integer.parseInt(recordData[0]), new SimpleDateFormat("dd-MM-yyyy").parse(recordData[1]),recordData[2]);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null,
                            e.getMessage(),
                            "Sales Invoice Generator",
                            JOptionPane.ERROR_MESSAGE);
                }
                headerArray.add(newInvoice);
            }

            // Add Lines to its associate Header in the Array List
            addLinesToHeaders();

            try {
                theBuffReader.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.ERROR_MESSAGE);
            }

            // Show Headers in the Table of the main frame
            showInvoiceData(invoicesTable);
        }
        testMethod();

    }
    private void showInvoiceData(JTable invoicesTable){
        DefaultTableModel model = (DefaultTableModel) invoicesTable.getModel();
        model.setRowCount(0);
        Object[] record = new Object[4];
        for (invoice invoice : headerArray){
            record[0] = invoice.getInvoiceNumber();
            record[1] = invoice.getDate();
            record[2] = invoice.getCustomer() ;
            record[3]= invoice.clcInvoiceTotal();
            model.addRow(record);
        }
    }
    private void addLinesToHeaders(){

        JOptionPane.showMessageDialog(null, "Select the Lines CSV File", "Sales Invoice Generator", JOptionPane.INFORMATION_MESSAGE);

        JFileChooser myFileChooser = new JFileChooser();
        int result = myFileChooser.showOpenDialog(null);
        String linesPath = myFileChooser.getSelectedFile().getPath();
        if (result == JFileChooser.APPROVE_OPTION) {
            BufferedReader theBuffReader = null;
            try {
                theBuffReader = new BufferedReader(new FileReader(linesPath));
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.ERROR_MESSAGE);
            }
            while (true) {
                try {
                    if (!((linesPath = theBuffReader.readLine()) != null)) break;
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,
                            e.getMessage(),
                            "Sales Invoice Generator",
                            JOptionPane.ERROR_MESSAGE);
                }
                String[] recordData = linesPath.split(",", 4);

                for (invoice invoice : headerArray) {
                    if (invoice.getInvoiceNumber() == Integer.parseInt(recordData[0])){
                        invoice.getLinesArray().add(new line(Integer.parseInt(recordData[0]), recordData[1], Double.parseDouble(recordData[2]), Integer.parseInt(recordData[3])));
                    }
                }
            }

            try {
                theBuffReader.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void testMethod() {

        System.out.println("Sales Invoice Generator");
        for (invoice invoiceHeader : headerArray) {

            System.out.println(invoiceHeader.getInvoiceNumber() + "    " + invoiceHeader.getDate() + "    " + invoiceHeader.getCustomer() + "    " + invoiceHeader.clcInvoiceTotal());
            System.out.println("Items Purchased");
            for (line invoiceLine : invoiceHeader.getLinesArray()) {
                System.out.println(invoiceLine.getItem() + "    " + invoiceLine.getPrice() + "    " + invoiceLine.getCount() + "    " + invoiceLine.clcTotal());
            }

            System.out.println("_________________________Next Invoice Data______________________");
        }

    }
    public void addItem(){
        LineDialoge lineDialoge = new LineDialoge(null,true);
        lineDialoge.setVisible(true);
    }
    public void deleteInvoiceLine(JTable linesTable, JLabel invoiceTotal, JLabel invoiceNumber) {

        int theSelectedRowIndex = linesTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) linesTable.getModel();

        double itemValue = Double.parseDouble(model.getValueAt(theSelectedRowIndex,3).toString());
        String itemName = model.getValueAt(theSelectedRowIndex,0).toString();

            model.removeRow(theSelectedRowIndex);

            // Remove Lines from the Array List
            for (invoice invoiceHeader : headerArray) {
                invoiceHeader.getLinesArray().removeIf(item -> item.getInvoiceNo() == Integer.parseInt(invoiceNumber.getText()) && item.getItem().equals(itemName));
            }

            // Set Total TextField
            invoiceTotal.setText(String.valueOf(Double.parseDouble(invoiceTotal.getText())- itemValue));

            // Set Total in the Headers Table
            for (int i = 0; i < mainFrame.getInvoiceTable().getModel().getRowCount() ; i ++){
                if (Integer.parseInt(mainFrame.getInvoiceTable().getModel().getValueAt(i,0).toString()) == Integer.parseInt(invoiceNumber.getText())){
                    mainFrame.getInvoiceTable().getModel().setValueAt(Double.parseDouble(invoiceTotal.getText()),i,3);
                }
            }

            JOptionPane.showMessageDialog(null,
                    "The Invoice Deleted!",
                    "Sales Invoice Generator",
                    JOptionPane.INFORMATION_MESSAGE);
    }

    public void addNewInvoice() {
        InvoiceDialoge invoiceDialog = new InvoiceDialoge(null, true);
        invoiceDialog.setVisible(true);
    }
    public void deleteInvoiceHeader(JTable invoiceTable, JLabel invoiceNumber) {
        int theSelectedRowIndex = invoiceTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) invoiceTable.getModel();

        model.removeRow(theSelectedRowIndex);
        headerArray.removeIf(item -> item.getInvoiceNumber() == Integer.parseInt(invoiceNumber.getText()));
        JOptionPane.showMessageDialog(null,
                        "The Invoice is Deleted!",
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);
    }

    public void saveFile() {
        // Save Invoice Headers Data
        JOptionPane.showMessageDialog(null, "Select Headers' File Location",
                "Sales Invoice Generator", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser myFileChooser = new JFileChooser();
        myFileChooser.setSelectedFile(new File("InvoiceHeader"));
        int result = myFileChooser.showSaveDialog(null);
        myFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String HeadersPath = myFileChooser.getCurrentDirectory()+"\\"+"InvoiceHeader"+".csv";
        myFileChooser.setDialogTitle("Please select the folder");
        myFileChooser.setAcceptAllFileFilterUsed(false);
        if (result == 0){
            FileWriter file = null;
            try {
                file = new FileWriter(HeadersPath);
                for (invoice invoice : headerArray) {
                    file.append(String.valueOf(invoice.getInvoiceNumber()));
                    file.append(",");
                    file.append(formatDate(invoice.getDate()));
                    file.append(",");
                    file.append(invoice.getCustomer());
                    file.append("\n");
                }
                file.close();

                // Save Lines Data
                saveLines();


                JOptionPane.showMessageDialog(null,
                        "File is Saved!",
                        "Sales Invoice Generator",
                        JOptionPane.INFORMATION_MESSAGE);

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveLines(){
        JOptionPane.showMessageDialog(null, "Select Lines' File Location",
                "Sales Invoice Generator", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser myFileChooser = new JFileChooser();
        myFileChooser.setSelectedFile(new File("InvoiceLine"));
        int result = myFileChooser.showSaveDialog(null);
        myFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        String linesPath = myFileChooser.getCurrentDirectory()+"\\"+"InvoiceLine"+".csv";
        myFileChooser.setDialogTitle("Please select the folder");
        myFileChooser.setAcceptAllFileFilterUsed(false);
        if (result == 0){
            FileWriter file = null;
            try {
                file = new FileWriter(linesPath);
                for (invoice invoicesHeader : headerArray) {
                    for (line line : invoicesHeader.getLinesArray()){
                        file.append(String.valueOf(line.getInvoiceNo()));
                        file.append(",");
                        file.append(line.getItem());
                        file.append(",");
                        file.append(String.valueOf(line.getPrice()));
                        file.append(",");
                        file.append(String.valueOf(line.getCount()));
                        file.append("\n");
                    }
                }
                file.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        e.getMessage(),
                        "Sales Invoice Generator",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public String formatDate(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }
}

