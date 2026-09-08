/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minpro1;

/**
 *
 * @author attar_n98y094
 */
public class Pelanggan {
    String idPelanggan;
    String namaPelanggan;
    String noTelepon;
    String alamat;
    
    public Pelanggan(String idPelanggan, String namaPelanggan, String noTelpon, String alamat) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.noTelepon = noTelpon;
        this.alamat = alamat;
    }
    public void tampilkanData() {
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + namaPelanggan);
        System.out.println("No. Telepon  : " + noTelepon);
        System.out.println("Alamat       : " + alamat);
        System.out.println("-----------------------------");
    }
}
