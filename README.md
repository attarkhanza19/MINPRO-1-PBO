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
=================================
 SISTEM PENYEWAAN ALAT MUSIK
=================================
1. Kelola Data Alat Musik
2. Kelola Data Pelanggan
3. Kelola Data Penyewaan
4. Keluar
=================================
Pilih menu: 1

===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 1

===== TAMBAH ALAT MUSIK =====
ID Alat: GTR-SPNYL-01
Nama Alat: Gitar Spanyol
Jenis Alat: Gitar
Harga Sewa per Hari: 100000
Status: Ready
Data alat berhasil ditambahkan.

===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 2

===== DAFTAR ALAT MUSIK =====
Data ke-1
ID Alat       : GTR-SPNYL-01
Nama Alat     : Gitar Spanyol
Jenis Alat    : Gitar
Harga Sewa    : Rp100000.0
Status        : Ready
-----------------------------

===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 3

Masukkan ID alat yang ingin diubah: GTR-SPNYL-01
Nama Alat baru: Gitar Spanyol Rata Kanan
Jenis Alat baru: Gitar
Harga Sewa baru: 120000
Status baru: Ready
Data berhasil diubah.

===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 2

===== DAFTAR ALAT MUSIK =====
Data ke-1
ID Alat       : GTR-SPNYL-01
Nama Alat     : Gitar Spanyol Rata Kanan
Jenis Alat    : Gitar
Harga Sewa    : Rp120000.0
Status        : Ready
-----------------------------

===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 
```
Pada bagian Kelola Data Alat Musik, pengguna dapat melakukan beberapa proses pengelolaan data, yaitu menambah, melihat, mengubah, dan menghapus data alat musik. Pada output tersebut, pengguna memilih menu Tambah Alat dan memasukkan data berupa ID alat, nama alat, jenis alat, harga sewa per hari, serta status alat. Setelah data dimasukkan, sistem menampilkan pesan “Data alat berhasil ditambahkan”.

Selanjutnya, pengguna memilih menu Lihat Alat untuk menampilkan data yang telah tersimpan. Sistem menampilkan seluruh informasi alat musik, yaitu GTR-SPNYL-01, Gitar Spanyol, Gitar, harga sewa Rp100.000 per hari, dan status Ready.

Kemudian, pengguna memilih menu Ubah Alat dengan memasukkan ID alat yang ingin diubah. Data nama alat diubah menjadi “Gitar Spanyol Rata Kanan” dan harga sewanya menjadi Rp120.000, sementara jenis dan status tetap sama. Setelah proses berhasil, sistem menampilkan pesan “Data berhasil diubah”. Ketika data dilihat kembali, perubahan tersebut sudah tersimpan dan ditampilkan oleh sistem.

Untuk menu Hapus Alat, fitur ini digunakan untuk menghapus data alat musik berdasarkan ID alat. Pada pengujian ini, proses hapus tidak dilakukan karena data alat yang telah ditambahkan dan diubah tetap digunakan dalam sistem.

3. Kelola Data Pelanggan
```
=================================
 SISTEM PENYEWAAN ALAT MUSIK
=================================
1. Kelola Data Alat Musik
2. Kelola Data Pelanggan
3. Kelola Data Penyewaan
4. Keluar
=================================
Pilih menu: 2

===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 1

===== TAMBAH PELANGGAN =====
ID Pelanggan: PLN-01
Nama Pelanggan: Dilan
No. Telepon: 19900001
Alamat: Perjuangan 111
Data pelanggan berhasil ditambahkan.

===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 2

===== DAFTAR PELANGGAN =====
Data ke-1
ID Pelanggan : PLN-01
Nama         : Dilan
No. Telepon  : 19900001
Alamat       : Perjuangan 111
-----------------------------

===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 3

Masukkan ID pelanggan yang ingin diubah: PLN-01
Nama baru: Rehan
No. Telepon baru: 19900001
Alamat baru: Perjuangan 111
Data berhasil diubah.

===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 
```
Pada bagian Kelola Data Pelanggan, pengguna dapat mengelola data pelanggan melalui fitur tambah, lihat, ubah, dan hapus. Pada output tersebut, pengguna memilih Tambah Pelanggan dan memasukkan data pelanggan dengan ID PLN-01, nama Dilan, nomor telepon 19900001, dan alamat Perjuangan 111. Setelah data berhasil disimpan, sistem menampilkan pesan “Data pelanggan berhasil ditambahkan”.

Selanjutnya, pengguna memilih Lihat Pelanggan untuk menampilkan data yang telah tersimpan. Sistem menampilkan seluruh informasi pelanggan sesuai data yang sebelumnya dimasukkan.

Kemudian, pengguna memilih Ubah Pelanggan dan memasukkan ID PLN-01. Nama pelanggan diubah dari Dilan menjadi Rehan, sedangkan nomor telepon dan alamat tetap sama. Sistem kemudian menampilkan pesan “Data berhasil diubah”, yang menunjukkan bahwa perubahan data berhasil dilakukan.

Untuk menu Hapus Pelanggan, fitur ini digunakan untuk menghapus data pelanggan berdasarkan ID pelanggan. Pada pengujian ini, proses penghapusan tidak dilakukan.

4. Kelola Data Penyewaan
```
=================================
 SISTEM PENYEWAAN ALAT MUSIK
=================================
1. Kelola Data Alat Musik
2. Kelola Data Pelanggan
3. Kelola Data Penyewaan
4. Keluar
=================================
Pilih menu: 3

===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 1

===== TAMBAH PENYEWAAN =====
ID Penyewaan: SW-01
ID Pelanggan: PLN-01
ID Alat: GTR-SPNYL-01
Lama Sewa (hari): 2
Penyewaan berhasil ditambahkan.
Total Harga: Rp240000.0

===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 2

===== DAFTAR PENYEWAAN =====
Data ke-1
ID Penyewaan : SW-01
ID Pelanggan : PLN-01
ID Alat      : GTR-SPNYL-01
Lama Sewa    : 2 hari
Total Harga  : Rp240000.0
-----------------------------

===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 3

Masukkan ID penyewaan yang ingin diubah: SW-01
ID Pelanggan baru: PLN-01
ID Alat baru: GTR-SPNYL-01
Lama Sewa baru: 3
Total Harga baru: 360000
Data berhasil diubah.

===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 
```
Pada bagian Kelola Data Penyewaan, pengguna dapat mengelola data transaksi penyewaan melalui fitur tambah, lihat, ubah, dan hapus. Pada output tersebut, pengguna memilih Tambah Penyewaan dan memasukkan ID penyewaan SW-01, ID pelanggan PLN-01, ID alat GTR-SPNYL-01, serta lama sewa selama 2 hari. Sistem kemudian menghitung total harga berdasarkan harga sewa alat sebesar Rp120.000 per hari, sehingga total biaya penyewaan menjadi Rp240.000.

Selanjutnya, pengguna memilih Lihat Penyewaan untuk menampilkan transaksi yang telah tersimpan. Data yang ditampilkan menunjukkan bahwa pelanggan PLN-01 menyewa alat GTR-SPNYL-01 selama 2 hari dengan total harga Rp240.000.

Kemudian, pengguna memilih Ubah Penyewaan dan memasukkan ID SW-01. Lama sewa diubah dari 2 hari menjadi 3 hari, sehingga total harga diperbarui menjadi Rp360.000. Sistem menampilkan pesan “Data berhasil diubah”, yang menunjukkan bahwa perubahan transaksi berhasil dilakukan.

Untuk menu Hapus Penyewaan, fitur ini digunakan untuk menghapus data transaksi berdasarkan ID penyewaan. Pada pengujian ini, proses penghapusan tidak dilakukan.
