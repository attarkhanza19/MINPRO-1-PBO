# MINI PROJECT 1 PBO MUHAMMAD ATTAR KHANZA HABIBILLAH (2509116006)
## Sistem Manajemen Penyewaan Alat Musik
### Deskripsi singkat program
Sistem Manajemen Produksi Roti dan Kue merupakan program berbasis bahasa pemrograman Java yang digunakan untuk mengelola data produksi roti dan kue secara sederhana. Program ini memungkinkan pengguna untuk menambahkan, menampilkan, mengubah, dan menghapus data produksi. Data yang dikelola meliputi ID produksi, ID produk, nama produk, jenis produk, harga produk, jumlah produksi, tanggal produksi, dan status produksi. Program menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO), seperti class, object, constructor, encapsulation, getter dan setter, ArrayList, percabangan, perulangan, serta input menggunakan Scanner.
### Class apa aja yang ada di dalam program?
Didalam program **Sistem Manajemen Penyewaan Alat Musik**, ada 4 class:
1. Minpro1penyewaanalatmusik (main) adalah class entry point menjalankan program, menampilkan menu, menerima input, dan menjalankan proses CRUD.
2. AlatMusik sebagai penyimpan data alat musik yang disewakan, seperti ID, nama, jenis, harga sewa, dan status.
3. Pelanggan sebagai penyimpan data pelanggan yang melakukan penyewaan.
4. Penyewaan sebagai penyimpan data transaksi penyewaan, seperti ID penyewaan, pelanggan, alat, lama sewa, dan total harga.
### Alur Perencanaan Program
Alur program dimulai ketika program dijalankan melalui class Main/Minpro1penyewaanalatmusik.java. Program akan menampilkan menu utama yang berisi beberapa pilihan, yaitu Kelola Data Alat Musik, Kelola Data Pelanggan, Kelola Data Penyewaan, dan Keluar.

Pengguna memilih menu dengan memasukkan angka sesuai pililhan Program kemudian menggunakan percabangan **switch** untuk menentukan proses yang akan dijalankan berdasarkan pilihan pengguna.

Alur setiap menu:

1. Kelola Data Alat Musik

    Pengguna dapat memilih untuk menambah, menampilkan, mengubah, atau menghapus data alat musik. Pada saat menambah data, pengguna memasukkan ID alat, nama alat, jenis alat, harga sewa, dan status. Data tersebut digunakan untuk membuat object AlatMusik menggunakan constructor, kemudian object dimasukkan ke dalam ArrayList daftarAlat menggunakan add().

2. Kelola Data Pelanggan

   Pengguna memasukkan data pelanggan seperti ID pelanggan, nama, nomor telepon, dan alamat. Data tersebut digunakan untuk membuat object Pelanggan, kemudian dimasukkan ke dalam ArrayList daftarPelanggan. Data pelanggan juga dapat ditampilkan, diubah, dan dihapus berdasarkan ID pelanggan.

3. Kelola Data Penyewaan

   Pengguna memasukkan data penyewaan seperti ID penyewaan, ID pelanggan, ID alat, dan lama sewa. Program mencari harga alat berdasarkan ID alat, kemudian menghitung total harga berdasarkan harga sewa dan lama sewa. Data tersebut digunakan untuk membuat object Penyewaan dan dimasukkan ke dalam ArrayList daftarPenyewaan.
```

```

