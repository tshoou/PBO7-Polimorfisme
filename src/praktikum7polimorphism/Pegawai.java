/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7polimorphism;

/**
 *
 * @author tuffa
 */
public class Pegawai {
    private String nama;
    private String noktp;
    
    Pegawai(String nama, String noktp){
        this.nama = nama ;
        this.noktp = noktp ;
    }
    public String getNama() {
        return nama;
    }

    public String getNoktp() {
        return noktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoktp(String noktp) {
        this.noktp = noktp;
    }
    public double gaji(){
        return 0 ;
    }
    public String toString(){
        return  " : " + getNama() + "\n" +
                "No.KTP         : " + getNoktp() ;
    }
}
