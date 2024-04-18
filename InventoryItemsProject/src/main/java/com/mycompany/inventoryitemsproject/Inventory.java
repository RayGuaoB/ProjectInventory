/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryitemsproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ray_g
 */
public class Inventory {
    //Create a list that will store the products
    private List<Item> item;

    //Create the constructor of this class
    public Inventory() {
        item = new ArrayList<>();
    }

    //Method to add a item to the list
    public void addItem(Item item) {
        this.item.add(item);
    }

    //Method to update the price and lot of a item
    public void updateInfo(String name, double price, int lot) {
        for (Item item : item) {
            if (item.getName().equals(name)) {
                item.setPrice(price);
                item.setLot(lot);
                return;
            }
        }
    }

    //Method to remove a item from the list
    public void deleteItem(String name) {
        //Browse the list of items
        for (Item item : item) { 
            if (item.getName().equals(name)) {
                this.item.remove(item);
                return;
            }
        }
    }

    //Method to search for a item by name
    public Item searchItem(String name) {
        for (Item item : item) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // Method to get all items in the list
    public List<Item> getInventory() {
        return item;
    }
}
