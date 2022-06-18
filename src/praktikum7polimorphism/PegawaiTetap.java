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
public class PegawaiTetap extends Pegawai{
    private double upah ;

    PegawaiTetap(String nama, String noktp, double upah){
        super(nama, noktp);
        this.upah = upah ;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah ;
    }

    @Override
    public double gaji() {
        return super.gaji() + getUpah();
    }

    @Override
    public String toString() {
        return  "Pengawai Tetap " + super.toString() + "\n" +
                "Upah           : " + (long)getUpah() + ".0"+ "\n" +
                "Pendapatan     : " + "Rp " + (int)gaji() + "\n";
    }
}
