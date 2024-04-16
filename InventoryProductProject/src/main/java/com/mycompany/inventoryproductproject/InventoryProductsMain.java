/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventoryproductproject;

/**
 *
 * @author ray_g
 */
public class InventoryProductsMain extends javax.swing.JFrame {

    /**
     * Creates new form InventoryProductsMain
     */
    public InventoryProductsMain() {
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

        panela = new javax.swing.JPanel();
        lblProduct = new javax.swing.JLabel();
        fldProduct = new javax.swing.JTextField();
        fldPrice = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        fldStock = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnButton = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        fldSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        scpProduct = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        panela.setBackground(new java.awt.Color(230, 235, 224));
        panela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panela.setForeground(new java.awt.Color(51, 255, 102));

        lblProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblProduct.setForeground(new java.awt.Color(0, 0, 0));
        lblProduct.setText("Product Name");

        lblPrice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("Price");

        fldStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldStockActionPerformed(evt);
            }
        });

        lblStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 0, 0));
        lblStock.setText("Stock");

        btnAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add");

        btnButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnButton.setForeground(new java.awt.Color(0, 0, 0));
        btnButton.setText("Remove");

        lblSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(0, 0, 0));
        lblSearch.setText("Search");

        btnSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scpProduct.setViewportView(tblProduct);

        javax.swing.GroupLayout panelaLayout = new javax.swing.GroupLayout(panela);
        panela.setLayout(panelaLayout);
        panelaLayout.setHorizontalGroup(
            panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelaLayout.createSequentialGroup()
                        .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelaLayout.createSequentialGroup()
                                .addComponent(lblSearch)
                                .addGap(18, 18, 18)
                                .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelaLayout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelaLayout.createSequentialGroup()
                                        .addComponent(fldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearch))))
                            .addGroup(panelaLayout.createSequentialGroup()
                                .addComponent(fldProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(fldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(panelaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(lblStock)
                        .addGap(81, 81, 81)))
                .addComponent(scpProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        panelaLayout.setVerticalGroup(
            panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelaLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(scpProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduct)
                    .addComponent(lblPrice)
                    .addComponent(lblStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(fldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldStockActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryProductsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryProductsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryProductsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryProductsMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryProductsMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnButton;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField fldPrice;
    private javax.swing.JTextField fldProduct;
    private javax.swing.JTextField fldSearch;
    private javax.swing.JTextField fldStock;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel panela;
    private javax.swing.JScrollPane scpProduct;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables
}