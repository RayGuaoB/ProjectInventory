/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryitemsproject;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ray_g
 */
public class TableFunctionalities extends AbstractTableModel {

    List<Item> item;
    String[] columnNames = {"Item name", "Price", "Lot"}; // Table column names

    // Constructor that takes a list of products as a parameter
    public TableFunctionalities(List<Item> item) {
        this.item = item;
    }

    // Method to add a item to the list and update the table
    public void addItem(Item item) {
        this.item.add(item);
        this.fireTableDataChanged();
    }

    // Method to remove the last item from the list and update the table
    public void removeItem(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < item.size()) {
            item.remove(rowIndex);
            fireTableRowsDeleted(rowIndex, rowIndex);
        } else {
            System.err.println("Error: Invalid row index");
        }
    }

    // Return the number of rows in the table
    @Override
    public int getRowCount() {
        return this.item.size(); 
    }

    // Return the number of columns in the table
    @Override
    public int getColumnCount() {
        return this.columnNames.length; 
    }

    // Indicate if a cell is editable in the table (in this case, they are not)
    @Override
    public boolean isCellEditable(int row, int column
    ) {
        return false;
    }

    // Return the name of a specific column
    @Override
    public String getColumnName(int column
    ) {
        return this.columnNames[column]; 
    }

    // Return the value of a specific cell
    @Override
    public Object getValueAt(int rowIndex, int columnIndex
    ) {
        var product = this.item.get(rowIndex); 
        return switch (columnIndex) {
            case 0 ->
                product.getName(); 
            case 1 ->
                product.getPrice(); 
            case 2 ->
                product.getLot();
            default ->
                product; 
            };
    }
}

