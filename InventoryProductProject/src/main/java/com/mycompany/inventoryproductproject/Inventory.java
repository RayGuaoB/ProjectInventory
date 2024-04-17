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
    private List<Products> product;
    
    //Creamos el constructor de esta clase
    public Inventory() {
        //Inicializamos la lista de productos como un arraylist
        product = new ArrayList<>();
    }
    
    // Método para agregar un producto a la lista
    public void appendProduct(Products product) {
        this.product.add(product); // Agrega el producto a la lista
    }
    
     // Método para actualizar el precio y stock de un producto
    public void updateInfo(String name, double price, int stock) {
        for (Products product : product) { // Recorre la lista de productos
            if (product.getName().equals(name)) {
                product.setPrice(price); // Actualiza el precio del producto
                product.setStock(stock); // Actualiza el stock del producto
                return; // Sale del método después de actualizar el producto
            }
        }
    }

    // Método para eliminar un producto de la lista
    public void deleteProduct(String name) {
        for (Products product : product) { // Recorre la lista de productos
            if (product.getName().equals(name)) {
                this.product.remove(product); // Elimina el producto de la lista
                return; // Sale del método después de eliminar el producto
            }
        }
    }

    // Método para buscar un producto por su nombre
    public Products searchProduct(String name) {
        for (Products product : product) { // Recorre la lista de productos
            if (product.getName().equals(name)) {
                return product; // Devuelve el producto si se encuentra
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    // Método para obtener todos los productos en la lista
    public List<Products> getInventory() {
        return product; // Devuelve la lista completa de productos
    }
}
