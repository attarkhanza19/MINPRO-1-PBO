/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Minpro1;

import java.util.ArrayList;
import java.util.Scanner;
import Minpro1.AlatMusik;
import Minpro1.Pelanggan;
import Minpro1.Penyewaan;

public class Minpro1penyewaanalatmusik {

    static Scanner input = new Scanner(System.in);

    static ArrayList<AlatMusik> daftarAlat = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println(" SISTEM PENYEWAAN ALAT MUSIK");
            System.out.println("=================================");
            System.out.println("1. Kelola Data Alat Musik");
            System.out.println("2. Kelola Data Pelanggan");
            System.out.println("3. Kelola Data Penyewaan");
            System.out.println("4. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    menuAlat();
                    break;

                case 2:
                    menuPelanggan();
                    break;

                case 3:
                    menuPenyewaan();
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 4);
    }



    public static void menuAlat() {

        int pilihan;

        do {
            System.out.println("\n===== DATA ALAT MUSIK =====");
            System.out.println("1. Tambah Alat");
            System.out.println("2. Lihat Alat");
            System.out.println("3. Ubah Alat");
            System.out.println("4. Hapus Alat");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahAlat();
                    break;

                case 2:
                    lihatAlat();
                    break;

                case 3:
                    ubahAlat();
                    break;

                case 4:
                    hapusAlat();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }

    public static void tambahAlat() {

        System.out.println("\n===== TAMBAH ALAT MUSIK =====");

        System.out.print("ID Alat: ");
        String id = input.nextLine();

        System.out.print("Nama Alat: ");
        String nama = input.nextLine();

        System.out.print("Jenis Alat: ");
        String jenis = input.nextLine();

        System.out.print("Harga Sewa per Hari: ");
        double harga = input.nextDouble();
        input.nextLine();

        System.out.print("Status: ");
        String status = input.nextLine();

        AlatMusik alat = new AlatMusik(
                id,
                nama,
                jenis,
                harga,
                status
        );

        daftarAlat.add(alat);

        System.out.println("Data alat berhasil ditambahkan.");
    }


    public static void lihatAlat() {

        System.out.println("\n===== DAFTAR ALAT MUSIK =====");

        if (daftarAlat.size() == 0) {

            System.out.println("Belum ada data alat.");

        } else {

            for (int i = 0; i < daftarAlat.size(); i++) {

                System.out.println("Data ke-" + (i + 1));

                daftarAlat.get(i).tampilkanData();
            }
        }
    }



    public static void ubahAlat() {

        System.out.print("\nMasukkan ID alat yang ingin diubah: ");
        String id = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftarAlat.size(); i++) {

            if (daftarAlat.get(i).idAlat.equals(id)) {

                System.out.print("Nama Alat baru: ");
                daftarAlat.get(i).namaAlat = input.nextLine();

                System.out.print("Jenis Alat baru: ");
                daftarAlat.get(i).jenisAlat = input.nextLine();

                System.out.print("Harga Sewa baru: ");
                daftarAlat.get(i).hargaSewa = input.nextDouble();
                input.nextLine();

                System.out.print("Status baru: ");
                daftarAlat.get(i).status = input.nextLine();

                System.out.println("Data berhasil diubah.");

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("ID alat tidak ditemukan.");
        }
    }


    public static void hapusAlat() {

        System.out.print("\nMasukkan ID alat yang ingin dihapus: ");
        String id = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftarAlat.size(); i++) {

            if (daftarAlat.get(i).idAlat.equals(id)) {

                daftarAlat.remove(i);

                System.out.println("Data berhasil dihapus.");

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("ID alat tidak ditemukan.");
        }
    }

    public static void menuPelanggan() {

        int pilihan;

        do {

            System.out.println("\n===== DATA PELANGGAN =====");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Ubah Pelanggan");
            System.out.println("4. Hapus Pelanggan");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPelanggan();
                    break;

                case 2:
                    lihatPelanggan();
                    break;

                case 3:
                    ubahPelanggan();
                    break;

                case 4:
                    hapusPelanggan();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }


    public static void tambahPelanggan() {

        System.out.println("\n===== TAMBAH PELANGGAN =====");

        System.out.print("ID Pelanggan: ");
        String id = input.nextLine();

        System.out.print("Nama Pelanggan: ");
        String nama = input.nextLine();

        System.out.print("No. Telepon: ");
        String telepon = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(
                id,
                nama,
                telepon,
                alamat
        );

        daftarPelanggan.add(pelanggan);

        System.out.println("Data pelanggan berhasil ditambahkan.");
    }



    public static void lihatPelanggan() {

        System.out.println("\n===== DAFTAR PELANGGAN =====");

        if (daftarPelanggan.size() == 0) {

            System.out.println("Belum ada data pelanggan.");

        } else {

            for (int i = 0; i < daftarPelanggan.size(); i++) {

                System.out.println("Data ke-" + (i + 1));

                daftarPelanggan.get(i).tampilkanData();
            }
        }
    }



    public static void ubahPelanggan() {

        System.out.print("\nMasukkan ID pelanggan yang ingin diubah: ");
        String id = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftarPelanggan.size(); i++) {

            if (daftarPelanggan.get(i).idPelanggan.equals(id)) {

                System.out.print("Nama baru: ");
                daftarPelanggan.get(i).namaPelanggan = input.nextLine();

                System.out.print("No. Telepon baru: ");
                daftarPelanggan.get(i).noTelepon = input.nextLine();

                System.out.print("Alamat baru: ");
                daftarPelanggan.get(i).alamat = input.nextLine();

                System.out.println("Data berhasil diubah.");

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("ID pelanggan tidak ditemukan.");
        }
    }


    public static void hapusPelanggan() {

        System.out.print("\nMasukkan ID pelanggan yang ingin dihapus: ");
        String id = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftarPelanggan.size(); i++) {

            if (daftarPelanggan.get(i).idPelanggan.equals(id)) {

                daftarPelanggan.remove(i);

                System.out.println("Data berhasil dihapus.");

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("ID pelanggan tidak ditemukan.");
        }
    }



    public static void menuPenyewaan() {

        int pilihan;

        do {

            System.out.println("\n===== DATA PENYEWAAN =====");
            System.out.println("1. Tambah Penyewaan");
            System.out.println("2. Lihat Penyewaan");
            System.out.println("3. Ubah Penyewaan");
            System.out.println("4. Hapus Penyewaan");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahPenyewaan();
                    break;

                case 2:
                    lihatPenyewaan();
                    break;

                case 3:
                    ubahPenyewaan();
                    break;

                case 4:
                    hapusPenyewaan();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);
    }


    public static void tambahPenyewaan() {

        System.out.println("\n===== TAMBAH PENYEWAAN =====");

        System.out.print("ID Penyewaan: ");
        String idPenyewaan = input.nextLine();

        System.out.print("ID Pelanggan: ");
        String idPelanggan = input.nextLine();

        System.out.print("ID Alat: ");
        String idAlat = input.nextLine();

        System.out.print("Lama Sewa (hari): ");
        int lamaSewa = input.nextInt();

        double hargaAlat = 0;

        for (int i = 0; i < daftarAlat.size(); i++) {

            if (daftarAlat.get(i).idAlat.equals(idAlat)) {

                hargaAlat = daftarAlat.get(i).hargaSewa;

                daftarAlat.get(i).status = "Disewa";

                break;
            }
        }

        double totalHarga = hargaAlat * lamaSewa;

        Penyewaan penyewaan = new Penyewaan(
                idPenyewaan,
                idPelanggan,
                idAlat,
                lamaSewa,
                totalHarga
        );

        daftarPenyewaan.add(penyewaan);

        input.nextLine();

        System.out.println("Penyewaan berhasil ditambahkan.");
        System.out.println("Total Harga: Rp" + totalHarga);
    }


    public static void lihatPenyewaan() {

        System.out.println("\n===== DAFTAR PENYEWAAN =====");

        if (daftarPenyewaan.size() == 0) {

            System.out.println("Belum ada data penyewaan.");

        } else {

            for (int i = 0; i < daftarPenyewaan.size(); i++) {

                System.out.println("Data ke-" + (i + 1));

                daftarPenyewaan.get(i).tampilkanData();
            }
        }
    }




    public static void ubahPenyewaan() {

        System.out.print("\nMasukkan ID penyewaan yang ingin diubah: ");
        String id = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftarPenyewaan.size(); i++) {

            if (daftarPenyewaan.get(i).idPenyewaan.equals(id)) {

                System.out.print("ID Pelanggan baru: ");
                daftarPenyewaan.get(i).idPelanggan = input.nextLine();

                System.out.print("ID Alat baru: ");
                daftarPenyewaan.get(i).idAlat = input.nextLine();

                System.out.print("Lama Sewa baru: ");
                daftarPenyewaan.get(i).lamaSewa = input.nextInt();

                System.out.print("Total Harga baru: ");
                daftarPenyewaan.get(i).totalHarga = input.nextDouble();

                input.nextLine();

                System.out.println("Data berhasil diubah.");

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("ID penyewaan tidak ditemukan.");
        }
    }


    public static void hapusPenyewaan() {

        System.out.print("\nMasukkan ID penyewaan yang ingin dihapus: ");
        String id = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < daftarPenyewaan.size(); i++) {

            if (daftarPenyewaan.get(i).idPenyewaan.equals(id)) {

                daftarPenyewaan.remove(i);

                System.out.println("Data berhasil dihapus.");

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("ID penyewaan tidak ditemukan.");
        }
    }
}
