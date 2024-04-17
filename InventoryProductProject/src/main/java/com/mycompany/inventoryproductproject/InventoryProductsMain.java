/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventoryproductproject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ray_g
 */
public class InventoryProductsMain extends javax.swing.JFrame {
    
     List<Products> product = new ArrayList<>();
    TableRowSorter<TableFunctionalities> tableRowSorter = new TableRowSorter<>(); 

    /**
     * Creates new form InventoryProductsMain
     */
    public InventoryProductsMain() {
        initComponents();
        readFile();
        initObjects();
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
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnButton.setForeground(new java.awt.Color(0, 0, 0));
        btnButton.setText("Remove");
        btnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnButtonActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(0, 0, 0));
        lblSearch.setText("Search");

        btnSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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
                                .addGroup(panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelaLayout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(btnAdd)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(fldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearch))))
                            .addGroup(panelaLayout.createSequentialGroup()
                                .addComponent(fldProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                    .addGroup(panelaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(lblStock)
                        .addGap(84, 84, 84)))
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Products pr = new Products();  // Crear una nueva instancia de Product
        TableFunctionalities productModel = (TableFunctionalities) this.tblProduct.getModel(); // Obtener el modelo de la tabla
        pr.setName(fldProduct.getText());  // Establecer el nombre del producto con el texto del campo txtProduct

        try {
            pr.setPrice(Double.parseDouble(fldPrice.getText()));      // Establecer el precio del producto, convirtiendo el texto a double
            pr.setStock(Integer.parseInt(fldStock.getText()));       // Establecer el stock del producto, convirtiendo el texto a entero
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid Price or Stock format");  // Manejar cualquier error de formato al convertir el precio o el stock
            return;  // Salir del método si hay un error
        }

        try {
            double price = Double.parseDouble(fldPrice.getText());  // Convertir el texto del campo txtPrice a double
            int stock = Integer.parseInt(fldStock.getText());   // Convertir el texto del campo txtStock a entero
            if (price <= 0 || stock <= 0) {  // Verificar si el precio o el stock son valores no positivos
                throw new IllegalArgumentException("Error: Price or Stock must be a positive value."); // Lanzar una excepción si el precio o el stock no son valores positivos
            }
            pr.setPrice(price);   // Establecer el precio del producto
            pr.setStock(stock);   // Establecer el stock del producto
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Capturar y mostrar un mensaje de error si se lanza una excepción
            return;  // Salir del método si hay un error
        }

        productModel.appendProduct(pr);  // Agregar el producto al modelo de la tabla
        clearFields();  // Limpiar los campos del formulario

        saveProductsInv();  // Llamar a un método para guardar los productos en el inventario
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        RowFilter<TableFunctionalities, Integer> rowFilter = RowFilter.regexFilter(fldSearch.getText(), 0);  // Crear un filtro basado en el texto ingresado en txtSearch para la columna 0
        tableRowSorter.setRowFilter(rowFilter);  // Aplicar el filtro a la clasificación de filas de la tabla

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnButtonActionPerformed
        // TODO add your handling code here:
        TableFunctionalities productInvTable = (TableFunctionalities) this.tblProduct.getModel(); // Obtener el modelo de la tabla de productos
        productInvTable.removeInvProduct(); // Llamar al método removeInvProduct en el modelo para eliminar el último producto de la lista
    }//GEN-LAST:event_btnButtonActionPerformed

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
    
    // Método para limpiar los campos del formulario
    private void clearFields() {
        fldProduct.setText("");  // Limpiar el campo de texto para el nombre del producto
        fldPrice.setText("");    // Limpiar el campo de texto para el precio del producto
        fldStock.setText("");    // Limpiar el campo de texto para el stock del producto
    }

// Método para inicializar los objetos relacionados con la tabla
    private void initObjects() {
        TableFunctionalities model = new TableFunctionalities(this.product);  // Crear un nuevo modelo de tabla con la lista de productos
        tableRowSorter = new TableRowSorter<>(model);  // Crear un clasificador de filas a partir del modelo
        tblProduct.setRowSorter(tableRowSorter);  // Establecer el clasificador de filas en la tabla
        tblProduct.setModel(model);  // Establecer el modelo de la tabla
    }

// Método para guardar la lista de productos en un archivo JSON
    private void saveProductsInv() {
        Gson gson = new GsonBuilder().create();  // Crear un objeto Gson para convertir la lista de productos a JSON
        String json = gson.toJson(this.product);  // Convertir la lista de productos a JSON

        try (FileWriter fileWriter = new FileWriter("ProductsInventory.json")) {  // Usar FileWriter para escribir en el archivo "ProductsInventory.json"
            fileWriter.write(json);  // Escribir el JSON en el archivo
            fileWriter.close();  // Cerrar el FileWriter
            System.out.println("Successfully saved: Product list");  // Mostrar un mensaje de éxito
        } catch (IOException e) {  // Manejar cualquier error de escritura
            System.err.println("Error saving product list to JSON: " + e.getMessage());  // Mostrar un mensaje de error
        }
    }

// Método para leer la lista de productos desde un archivo JSON
    private void readFile() {
        try {
            Gson gson = new GsonBuilder().create();  // Crear un objeto Gson para convertir el JSON a la lista de productos
            FileReader fileReader = new FileReader("ProductsInventory.json");  // Usar FileReader para leer el archivo "ProductsInventory.json"

            java.lang.reflect.Type typeListProducts = new TypeToken<List<Products>>() {
            }.getType();  // Definir el tipo de datos para la lista de productos

            this.product = gson.fromJson(fileReader, typeListProducts);  // Convertir el JSON a la lista de productos
        } catch (IOException e) {  // Manejar cualquier error de lectura
            System.err.println("Error reading JSON file: " + e.getMessage());  // Mostrar un mensaje de error
        }
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
