/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryproductproject;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ray_g
 */
public class TableFunctionalities extends AbstractTableModel {
    List<Item> item; // Lista que almacena los productos
    String[] columnNames = { "Item name", "Price", "Lot" }; // Nombres de las columnas de la tabla

    // Constructor que toma una lista de productos como parámetro
    public TableFunctionalities(List<Item> item) {
        this.item = item; // Inicializa la lista de productos
    }

    // Método para agregar un producto a la lista y actualizar la tabla
    public void addItem(Item item) {
        this.item.add(item); // Agrega el producto a la lista
        this.fireTableDataChanged(); // Notifica a la tabla que los datos han cambiado
    }

    // Método para eliminar el último producto de la lista y actualizar la tabla
    public void removeItem() {
        this.item.remove(this.item.size() - 1); // Elimina el último producto de la lista
        this.fireTableDataChanged(); // Notifica a la tabla que los datos han cambiado
    }

    // Devolver el número de filas en la tabla
    @Override
    public int getRowCount() {
        return this.item.size(); // Devuelve el tamaño de la lista de productos
    }

    // Devolver el número de columnas en la tabla
    @Override
    public int getColumnCount() {
        return this.columnNames.length; // Devuelve el número de columnas definido en columnNames
    }

    // Indicar si una celda es editable en la tabla (en este caso, no lo son)
    @Override
    public boolean isCellEditable(int row, int column) {
        return false; // Devuelve false, indicando que las celdas no son editables
    }

    // Devolver el nombre de una columna específica
    @Override
    public String getColumnName(int column) {
        return this.columnNames[column]; // Devuelve el nombre de la columna en la posición especificada
    }

    // Devolver el valor de una celda específica
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var product = this.item.get(rowIndex); // Obtiene el producto en la posición rowIndex
        return switch (columnIndex) {
            case 0 -> product.getName(); // Devuelve el nombre del producto para la primera columna
            case 1 -> product.getPrice(); // Devuelve el precio del producto para la segunda columna
            case 2 -> product.getLot(); // Devuelve el stock del producto para la tercera columna
            default -> product; // Devuelve el producto en caso de un índice de columna inválido
        };
    }
}
