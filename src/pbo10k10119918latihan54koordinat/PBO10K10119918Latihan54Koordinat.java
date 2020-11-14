/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan54koordinat;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan koordinat dan 
 * warna dengan sistem override constructor
 * 
 */

public class PBO10K10119918Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat.getX() 
                + ", y : " + warnaKoordinat.getY());
    }
    
}
