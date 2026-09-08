/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minpro1;

/**
 *
 * @author attar_n98y094
 */
public class AlatMusik {
    
    String idAlat;
    String namaAlat;
    String jenisAlat;
    double hargaSewa;
    String status;
    


public AlatMusik(String idAlat, String namaAlat, String jenisAlat, double hargaSewa, String status) {
    
    this.idAlat = idAlat;
    this.namaAlat = namaAlat;
    this.jenisAlat = jenisAlat;
    this.hargaSewa = hargaSewa;
    this.status = status;
}

public void tampilkanData(){
        System.out.println("ID Alat       : " + idAlat);
        System.out.println("Nama Alat     : " + namaAlat);
        System.out.println("Jenis Alat    : " + jenisAlat);
        System.out.println("Harga Sewa    : Rp" + hargaSewa);
        System.out.println("Status        : " + status);
        System.out.println("-----------------------------");
    }

}
