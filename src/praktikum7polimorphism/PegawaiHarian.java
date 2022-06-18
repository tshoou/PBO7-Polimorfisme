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
public class PegawaiHarian extends Pegawai{
    private double upahPerJam ;
    private int totalJam ;

    PegawaiHarian(String nama, String noktp, double upahPerJam, int totalJam){
        super(nama, noktp);
        this.upahPerJam = upahPerJam ;
        this.totalJam = totalJam ;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        double tGaji;
        if(getTotalJam() <= 40){
            tGaji = super.gaji() + getUpahPerJam() * getTotalJam() ;
            return tGaji;
        }
        else{
            tGaji = super.gaji() + getUpahPerJam() * getTotalJam() + (getTotalJam() - 40) * getUpahPerJam() * 1.5 ;
            return tGaji;
        }

    }

    @Override
    public String toString() {
        return  "Pengawai Harian" + super.toString() + "\n" +
                "Upah/jam       : " + getUpahPerJam() + "\n" +
                "Total jam kerja: " + getTotalJam() + ".0"+ "\n" +
                "Pendapatan     : " + "Rp " + (int)gaji() + "\n";
    }
}
