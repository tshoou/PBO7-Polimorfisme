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
public class Sales extends Pegawai{
    private int penjualan ;
    private double komisi ;

    Sales(String nama, String noktp, int penjualan, double komisi){
        super(nama, noktp);
        this.penjualan = penjualan ;
        this.komisi = komisi ;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public double gaji() {
        return super.gaji() + getPenjualan() * getKomisi();
    }

    @Override
    public String toString() {
        return  "Sales         " + super.toString() + "\n" +
                "Total penjualan: " + getPenjualan() + ".0"+"\n" +
                "Besaran komisi : " + getKomisi() + "\n" +
                "Pendapatan     : " + "Rp " + (int)gaji() + "\n";
    }
}
