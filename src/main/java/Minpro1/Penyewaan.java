package Minpro1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author attar_n98y094
 */
public class Penyewaan {
    
    String idPenyewaan;
    String idPelanggan;
    String idAlat;
    int lamaSewa;
    double totalHarga;
    
    public Penyewaan(String idPenyewaan, String idPelanggan, String idAlat, int lamaSewa, double totalHarga) {
        this.idPenyewaan = idPenyewaan;
        this.idPelanggan = idPelanggan;
        this.idAlat = idAlat;
        this.lamaSewa = lamaSewa;
        this.totalHarga = totalHarga;
    }
    
     public void tampilkanData() {
        System.out.println("ID Penyewaan : " + idPenyewaan);
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("ID Alat      : " + idAlat);
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Harga  : Rp" + totalHarga);
        System.out.println("-----------------------------");
    }
}
