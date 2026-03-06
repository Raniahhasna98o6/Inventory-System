/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventory_system;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Inventory_system {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Inventory inventory = new Inventory();
        
        int pilihan;
        
        do {
            System.out.println("\n=== INVENTORY SYSTEM ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Tambah Stok Produk");
            System.out.println("4. Kurangi Stok Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Produk: ");
                    int id = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Masukkan nama produk: ");
                    String name = input.nextLine();
                    
                    System.out.print("Masukkan harga: Rp");
                    double price = input.nextDouble();
                    
                    System.out.print("Masukkan stok: ");
                    int stock = input.nextInt();
                    
                    Product product = new Product(id, name, price, stock);
                    inventory.addProduct(product);
                    
                    System.out.println("Produk berhasil ditambahkan!");
                    break;
                    
                case 2:
                    inventory.showProducts();
                    break;
                    
                case 3:
                    System.out.print("Masukkan ID Produk: ");
                    int idTambah = input.nextInt();
                    
                    Product pTambah = inventory.findProduct(idTambah);
                    
                    if (pTambah != null) {
                        System.out.print("Jumlah stok yang ditambah: ");
                        int amount = input.nextInt();
                        pTambah.addStock(amount);
                    } else {
                        System.out.println("Produk tidak ditemukan!");
                    }
                    break;
                    
                case 4:
                    System.out.print("Masukkan ID Produk: ");
                    int idKurang = input.nextInt();
                    
                    Product pKurang = inventory.findProduct(idKurang);
                    
                    if (pKurang != null) {
                        System.out.print("Jumlah stok yang dikurangi: ");
                        int amount = input.nextInt();
                        pKurang.reduceStock(amount);
                    } else {
                        System.out.println("Produk tidak ditemukan!");
                    }
                    break;
                    
                case 5:
                    System.out.println("SELESAIIII~~!!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
        input.close();
    }
}
