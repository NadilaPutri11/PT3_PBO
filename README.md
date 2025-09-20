# PT3_PBO
Nadila Putri 

2409116052 

Tema Manajemen Resep Masakan

## Deskripsi Singkat

Program ini merupakan aplikasi sederhana berbasis console untuk manajemen resep masakan. Fitur yang tersedia antara lain:
- Menambahkan resep baru
- Melihat semua resep
- Mengubah resep
- Menghapus resep

Program ini dimodifikasi dari tugas Post Test 2 untuk memenuhi Post Test 3 PBO dengan menerapkan konsep Object Oriented Programming (OOP) seperti:
  - Inheritance (pewarisan class)
  - Encapsulation (atribut private + getter & setter)
  - Overriding (method diturunkan dan dimodifikasi)

## Struktur Packages
<img width="864" height="574" alt="image" src="https://github.com/user-attachments/assets/d66637ee-8760-44e2-9f23-3107e3ec8d6d" />

## Dokumentasi Program
- Program ini menggunakan pewarisan dengan memodifikasi class resep menjadi superclass resep yang menyimpan atribut umum sebuah resep (misalnya nama resep, bahan, cara memasak, kategori). Kemudian dibuat subclass ResepMasakan dan ResepMinuman yang mewarisi sifat dari resep. Dengan pewarisan ini, kode menjadi lebih terstruktur karena atribut dan method umum diletakkan di Resep, sedangkan hal-hal khusus bisa ditambahkan di subclass.
  <img width="1440" height="545" alt="image" src="https://github.com/user-attachments/assets/56d0d088-eb4d-46e7-bd6e-13dba03f51c0" />
  <img width="1426" height="551" alt="image" src="https://github.com/user-attachments/assets/fe985c51-5429-43f8-9196-d1cbb20529f9" />
- Atribut di dalam resep diset sebagai private agar tidak bisa diakses langsung. Akses ke atribut dilakukan dengan getter dan setter.
  <img width="1615" height="1445" alt="image" src="https://github.com/user-attachments/assets/641df69f-3c4f-453c-87a4-47213afb1c80" />
- Subclass dapat menimpa (override) method dari superclass. Contoh: method tampilkanResep() di Resep ditimpa pada ResepMasakan atau ResepMinuman agar menampilkan detail sesuai jenis resep.
  <img width="1201" height="507" alt="image" src="https://github.com/user-attachments/assets/35b959fd-730d-49ea-bbca-445bf321eba9" />
  <img width="1186" height="415" alt="image" src="https://github.com/user-attachments/assets/5667d9e1-6195-44fe-bb85-b86887c9a1c3" />
  <img width="1171" height="392" alt="image" src="https://github.com/user-attachments/assets/803fe0e0-cf64-422b-9384-866a352294e6" />
- Awalnya, program hanya bisa menambahkan resep secara umum dengan menggunakan class resep. Kemudian, kode dimodifikasi agar pengguna bisa memilih jenis resep (makanan atau minuman) saat menambah atau mengubah data.
  <img width="1459" height="861" alt="image" src="https://github.com/user-attachments/assets/5e6af5ef-4e19-40e4-88f4-c3e36caec11b" />
  <img width="1647" height="1087" alt="image" src="https://github.com/user-attachments/assets/c53f6649-9ede-4a35-bbdc-2cd397f9aa9e" />
- Output:
  <img width="1588" height="664" alt="image" src="https://github.com/user-attachments/assets/225cadad-fab7-426f-a300-44267f52ba71" />
  <img width="1586" height="778" alt="image" src="https://github.com/user-attachments/assets/48682557-36b8-4eb8-ba7c-0877491149ed" />
  <img width="1620" height="901" alt="image" src="https://github.com/user-attachments/assets/f4e66653-9175-4cb4-b736-01cd6938c941" />

<img width="1924" height="343" alt="image" src="https://github.com/user-attachments/assets/3cf4327a-c59e-4818-98b7-388aea8ac6b8" />







