/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan60.akatsuki;

/**
 *
 * @author ibadguthwara
 */
public class Anggota {
     protected String anggota;

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }

    public void tampilAkatsuki(){
        System.out.println("Nama Anggota : "+getAnggota());
    }
    
}
