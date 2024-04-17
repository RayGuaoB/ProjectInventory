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
        item = new ArrayList<>();
    }
    
    // Método para agregar un producto a la lista
    public void addItem(Item item) {
        this.item.add(item); 
    }
    
     // Método para actualizar el precio y lot de un producto
    public void updateInfo(String name, double price, int lot) {
        for (Item item : item) { 
            if (item.getName().equals(name)) {
                item.setPrice(price); 
                item.setLot(lot); 
                return; 
            }
        }
    }

    // Método para eliminar un producto de la lista
    public void deleteItem(String name) {
        for (Item item : item) { // Recorre la lista de productos
            if (item.getName().equals(name)) {
                this.item.remove(item); 
                return; 
            }
        }
    }

    // Método para buscar un producto por su nombre
    public Item searchItem(String name) {
        for (Item item : item) { 
            if (item.getName().equals(name)) {
                return item; 
            }
        }
        return null;
    }

    // Método para obtener todos los productos en la lista
    public List<Item> getInventory() {
        return item; 
    }
}
