# Tugas MK PBO

# Inventory System (Java OOP – Encapsulation)
## Deskripsi Project
Project ini merupakan mini sistem **Inventory Management** menggunakan bahasa pemrograman **Java** dengan konsep **Object Oriented Programming (OOP)**, khususnya **Encapsulation**.
Sistem ini memungkinkan pengguna untuk mengelola produk dalam inventory seperti:
- menambahkan produk
- melihat daftar produk
- menambah stok
- mengurangi stok
Encapsulation diterapkan dengan cara membuat atribut class menjadi **private** sehingga tidak dapat diakses langsung dari luar class.

---

# Fitur Sistem
Fitur utama dari sistem ini:
- Tambah produk
- Lihat daftar produk
- Tambah stok
- Kurangi stok
- Validasi data produk

---

# Struktur Class
Program ini terdiri dari 3 class utama.

## Product
Class ini menyimpan informasi produk.

Atribut:
- id
- name
- price
- stock

Method:
- getId()
- getName()
- getPrice()
- getStock()
- setPrice()
- setStock()
- addStock()
- reduceStock()

---

## Inventory
Class ini menyimpan dan mengelola kumpulan produk.
Atribut:
- productList

Method:
- addProduct()
- showProducts()
- findProduct()

---

## Main
Class utama untuk menjalankan program dan menerima input user.

---

# Implementasi Encapsulation
Encapsulation diterapkan dengan:
1. Menggunakan atribut **private**
2. Menggunakan **getter dan setter**
3. Menambahkan **validasi data**

Contoh:
```java
private double price;
public void setPrice(double price) {
    if(price > 0){
        this.price = price;
    } else {
        System.out.println("Harga tidak boleh negatif");
    }
}
```

---

# Validation Logic
Beberapa validasi pada sistem:
1. Harga tidak boleh negatif
2. Stok tidak boleh negatif
3. Stok tidak boleh dikurangi melebihi stok yang tersedia

---

# Contoh Output Program
```
=== INVENTORY SYSTEM ===
1. Tambah Produk
2. Lihat Produk
3. Tambah Stok
4. Kurangi Stok
5. Keluar
Pilih Menu: 
```

---

# UML Diagram
<img width="631" height="402" alt="uml-hasna-Page-2 drawio" src="https://github.com/user-attachments/assets/5f64f936-59a1-427e-a44e-629546120e01" />

---

# Author
Nama: Raniah Hasna Fadiyah  
NIM: 103012430009
Mata Kuliah: Pemrograman Berorientasi Objek
