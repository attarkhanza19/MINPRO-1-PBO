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

4. Tampilkan Data

   Program memeriksa apakah ArrayList memiliki data. Jika belum ada data, program menampilkan pesan bahwa data belum tersedia. Jika terdapat data, program menggunakan perulangan for untuk mengambil setiap data menggunakan get(i), kemudian menampilkannya.

5. Update Data

   Pengguna memasukkan ID data yang ingin diubah. Program melakukan pencarian menggunakan perulangan. Jika ID ditemukan, pengguna dapat memasukkan data baru dan data tersebut akan diperbarui.

6. Hapus Data

   Pengguna memasukkan ID data yang ingin dihapus. Program mencari ID tersebut di dalam ArrayList. Jika ditemukan, data dihapus menggunakan remove(i). Jika tidak ditemukan, program menampilkan pesan bahwa data tidak ditemukan.

7. Keluar

   Jika pengguna memilih menu keluar, kondisi pada perulangan utama terpenuhi sehingga perulangan berhenti dan program selesai.

### Dokumentasi Alur Program
1. Tampilan Menu Utama
```
=================================
 SISTEM PENYEWAAN ALAT MUSIK
=================================
1. Kelola Data Alat Musik
2. Kelola Data Pelanggan
3. Kelola Data Penyewaan
4. Keluar
=================================
Pilih menu:


```
Menu utama berfungsi sebagai halaman awal untuk mengakses fitur-fitur dalam sistem penyewaan alat musik. Kelola Data Alat Musik digunakan untuk menambah, melihat, mengubah, dan menghapus data alat musik yang tersedia untuk disewa. Kelola Data Pelanggan digunakan untuk mengelola data pelanggan yang melakukan penyewaan, seperti ID, nama, nomor telepon, dan alamat. Kelola Data Penyewaan digunakan untuk mencatat dan mengelola transaksi penyewaan dengan memasukkan data pelanggan, alat musik, serta lama penyewaan dan menghitung total harga. Sedangkan Keluar digunakan untuk mengakhiri program setelah pengguna selesai menggunakan sistem.

2. Kelola Data Alat Musik
```
===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu:
```
Pada bagian Data Alat Musik, submenu ini berfungsi untuk mengelola seluruh data alat musik yang terdapat dalam sistem. Tambah Alat digunakan untuk memasukkan data alat musik baru, Lihat Alat digunakan untuk menampilkan seluruh data alat musik yang tersimpan, Ubah Alat digunakan untuk memperbarui informasi alat musik yang sudah ada, sedangkan Hapus Alat digunakan untuk menghapus data alat musik berdasarkan ID alat. Pilihan Kembali digunakan untuk kembali ke menu utama setelah selesai mengelola data alat musik.
