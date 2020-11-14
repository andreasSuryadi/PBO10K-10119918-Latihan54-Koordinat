/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan54koordinat;

/**
 *
 * @author andreas
 */
public class WarnaKoordinat extends Koordinat {
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.setNamaWarna(namaWarna);
    }
    
    public String getNamaWarna() {
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}
