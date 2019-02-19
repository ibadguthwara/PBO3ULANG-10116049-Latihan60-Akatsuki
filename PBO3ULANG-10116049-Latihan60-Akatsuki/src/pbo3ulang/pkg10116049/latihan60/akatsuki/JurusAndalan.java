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
public class JurusAndalan extends Anggota{
     protected String Jurus;

    public String getJurus() {
        return Jurus;
    }

    public void setJurus(String Jurus) {
        this.Jurus = Jurus;
    }
    @Override
    public void tampilAkatsuki(){
        System.out.println("Jurus : "+getJurus());
    }    
    
}
