/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.TablesActions;
import controller.inputAndOutputActions;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;

/**
 *
 * @author omars
 */
public class mainFrame extends javax.swing.JFrame {
    inputAndOutputActions actions = new inputAndOutputActions();
    TablesActions tablesActions = new TablesActions();
    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftSidePanel = new javax.swing.JPanel();
        invoicesTableLbl = new javax.swing.JLabel();
        leftSideScrollPane = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        deleteHeaderButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        rightSidePanel = new javax.swing.JPanel();
        invoiceNumberLabel = new javax.swing.JLabel();
        invoiceNumberText = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invoiceDateLabel = new javax.swing.JLabel();
        invoiceTotalText = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        customerNameText = new javax.swing.JTextField();
        invoiceDateText = new javax.swing.JTextField();
        LineTablePanel = new javax.swing.JPanel();
        rightSideScrollPanel = new javax.swing.JScrollPane();
        rightSideTable2 = new javax.swing.JTable();
        deleteLineButton = new javax.swing.JButton();
        addNewItemButton = new javax.swing.JButton();
        sigMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadtem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTableLbl.setText("Invoices Table");

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invoiceTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        invoiceTable.setShowGrid(true);
        invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceTableMouseClicked(evt);
            }
        });
        leftSideScrollPane.setViewportView(invoiceTable);

        deleteHeaderButton.setText("Delete Invoice");
        deleteHeaderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteHeaderButtonMouseClicked(evt);
            }
        });

        createButton.setText("Create New Invoice");
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftSidePanelLayout = new javax.swing.GroupLayout(leftSidePanel);
        leftSidePanel.setLayout(leftSidePanelLayout);
        leftSidePanelLayout.setHorizontalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteHeaderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSidePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(invoicesTableLbl))
                    .addGroup(leftSidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(leftSideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftSidePanelLayout.setVerticalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoicesTableLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftSideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteHeaderButton)
                    .addComponent(createButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invoiceNumberLabel.setText("Invoice Number");

        customerNameLabel.setText("Customer Name");

        invoiceDateLabel.setText("Invoice Date");

        invoiceTotalText.setText("0.0");

        invoiceTotalLabel.setText("Invoice Total");

        customerNameText.setEditable(false);

        invoiceDateText.setEditable(false);

        LineTablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Items"));

        rightSideTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "Count", "Item Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rightSideTable2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rightSideTable2PropertyChange(evt);
            }
        });
        rightSideScrollPanel.setViewportView(rightSideTable2);

        javax.swing.GroupLayout LineTablePanelLayout = new javax.swing.GroupLayout(LineTablePanel);
        LineTablePanel.setLayout(LineTablePanelLayout);
        LineTablePanelLayout.setHorizontalGroup(
            LineTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(LineTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LineTablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rightSideScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        LineTablePanelLayout.setVerticalGroup(
            LineTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
            .addGroup(LineTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LineTablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(rightSideScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        deleteLineButton.setText("Delete");
        deleteLineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLineButtonMouseClicked(evt);
            }
        });
        deleteLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLineButtonActionPerformed(evt);
            }
        });

        addNewItemButton.setText("Add New Item");
        addNewItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewItemButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rightSidePanelLayout = new javax.swing.GroupLayout(rightSidePanel);
        rightSidePanel.setLayout(rightSidePanelLayout);
        rightSidePanelLayout.setHorizontalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSidePanelLayout.createSequentialGroup()
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightSidePanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(rightSidePanelLayout.createSequentialGroup()
                                    .addComponent(invoiceNumberLabel)
                                    .addGap(89, 89, 89))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightSidePanelLayout.createSequentialGroup()
                                    .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)))
                            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(invoiceDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(rightSidePanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(invoiceNumberText)
                            .addComponent(invoiceTotalText)
                            .addComponent(invoiceDateText, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(customerNameText)
                            .addGroup(rightSidePanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(addNewItemButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteLineButton)))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rightSidePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LineTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        rightSidePanelLayout.setVerticalGroup(
            rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceNumberText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceTotalText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteLineButton)
                    .addComponent(addNewItemButton))
                .addGap(43, 43, 43))
            .addGroup(rightSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightSidePanelLayout.createSequentialGroup()
                    .addContainerGap(189, Short.MAX_VALUE)
                    .addComponent(LineTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        fileMenu.setText("File");

        loadtem.setText("Load File ");
        loadtem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadtemActionPerformed(evt);
            }
        });
        fileMenu.add(loadtem);

        saveItem.setText("Save File");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveItem);

        sigMenuBar.add(fileMenu);

        setJMenuBar(sigMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(rightSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadtemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadtemActionPerformed
        try {
            actions.openFile(invoiceTable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//GEN-LAST:event_loadtemActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
          actions.saveFile();
    }//GEN-LAST:event_saveItemActionPerformed

    private void invoiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceTableMouseClicked
        tablesActions.showInvoiceData(invoiceTable,invoiceNumberText,invoiceDateText,customerNameText,invoiceTotalText,rightSideTable2);
    }//GEN-LAST:event_invoiceTableMouseClicked

    private void deleteHeaderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteHeaderButtonMouseClicked
        actions.deleteInvoiceHeader(invoiceTable,invoiceNumberText);
        customerNameText.setText("");
        invoiceDateText.setText("");
        invoiceNumberText.setText("");
        invoiceTotalText.setText("");
        DefaultTableModel model = (DefaultTableModel) rightSideTable2.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_deleteHeaderButtonMouseClicked

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
        actions.addNewInvoice();
    }//GEN-LAST:event_createButtonMouseClicked

    private void rightSideTable2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rightSideTable2PropertyChange

    }//GEN-LAST:event_rightSideTable2PropertyChange

    private void deleteLineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLineButtonMouseClicked

    }//GEN-LAST:event_deleteLineButtonMouseClicked

    private void deleteLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLineButtonActionPerformed
        actions.deleteInvoiceLine(rightSideTable2,invoiceTotalText,invoiceNumberText);
    }//GEN-LAST:event_deleteLineButtonActionPerformed

    private void addNewItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewItemButtonMouseClicked
          actions.addItem();
    }//GEN-LAST:event_addNewItemButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LineTablePanel;
    private javax.swing.JButton addNewItemButton;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextField customerNameText;
    private javax.swing.JButton deleteHeaderButton;
    private javax.swing.JButton deleteLineButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel invoiceDateLabel;
    private javax.swing.JTextField invoiceDateText;
    private javax.swing.JLabel invoiceNumberLabel;
    private static javax.swing.JLabel invoiceNumberText;
    private static javax.swing.JTable invoiceTable;
    private javax.swing.JLabel invoiceTotalLabel;
    private static javax.swing.JLabel invoiceTotalText;
    private javax.swing.JLabel invoicesTableLbl;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JScrollPane leftSideScrollPane;
    private javax.swing.JMenuItem loadtem;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JScrollPane rightSideScrollPanel;
    private static javax.swing.JTable rightSideTable2;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JMenuBar sigMenuBar;
    // End of variables declaration//GEN-END:variables


    public static JLabel getInvoiceNumberText() {
        return invoiceNumberText;
    }

    public static JLabel getInvoiceTotalText() {
        return invoiceTotalText;
    }

    public static JTable getRightSideTable2() {
        return rightSideTable2;
    }

    public static JTable getInvoiceTable() {
        return invoiceTable;
    }
}
