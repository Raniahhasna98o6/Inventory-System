/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory_system;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Inventory {
    private ArrayList<Product> productList;
    
    public Inventory() {
        productList = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void showProducts() {
        if (productList.isEmpty()) {
            System.out.println("Inventory kosong!");
            return;
        }
        System.out.println("\n=== INVENTORY ===");        
        for (Product p : productList) {
            System.out.print("ID: "+p.getId());
            System.out.print(" | Name: "+p.getName());
            System.out.print(" | Price: "+p.getPrice());
            System.out.println(" | Stock: "+p.getStock());
        }
    }
    public Product findProduct(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
