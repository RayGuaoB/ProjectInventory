/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryproductproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ray_g
 */
public class Inventory {
    //Creamos una lista que almacenara los productos
    private List<Item> item;
    
    //Creamos el constructor de esta clase
    public Inventory() {
        //Inicializamos la lista de productos como un arraylist
        item = new ArrayList<>();
    }
    
    // Método para agregar un producto a la lista
    public void addItem(Item product) {
        this.item.add(product); // Agrega el producto a la lista
    }
    
     // Método para actualizar el precio y stock de un producto
    public void updateInfo(String name, double price, int lot) {
        for (Item item : item) { // Recorre la lista de productos
            if (item.getName().equals(name)) {
                item.setPrice(price); // Actualiza el precio del producto
                item.setLot(lot); // Actualiza el stock del producto
                return; // Sale del método después de actualizar el producto
            }
        }
    }

    // Método para eliminar un producto de la lista
    public void deleteItem(String name) {
        for (Item item : item) { // Recorre la lista de productos
            if (item.getName().equals(name)) {
                this.item.remove(item); // Elimina el producto de la lista
                return; // Sale del método después de eliminar el producto
            }
        }
    }

    // Método para buscar un producto por su nombre
    public Item searchItem(String name) {
        for (Item item : item) { // Recorre la lista de productos
            if (item.getName().equals(name)) {
                return item; // Devuelve el producto si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    // Método para obtener todos los productos en la lista
    public List<Item> getInventory() {
        return item; // Devuelve la lista completa de productos
    }
}
