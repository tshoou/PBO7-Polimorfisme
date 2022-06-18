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
public class Praktikum7Polimorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PegawaiTetap Octavia = new PegawaiTetap("Oktavia Blake","12345678910", 2000000);
        PegawaiTetap Bellamy = new PegawaiTetap("Bellamy Blake","12345678911", 25000000);
        PegawaiTetap Finn = new PegawaiTetap("Finn Collins","12345678912", 10000000);
        
        System.out.println("======== Pegawai Tetap =========");
        System.out.println(Octavia);
        System.out.println(Bellamy);
        System.out.println(Finn);
        System.out.println("================================");

        PegawaiHarian Clarke = new PegawaiHarian("Clarke Griffin","12345678930", 8500, 40);
        PegawaiHarian Raven = new PegawaiHarian("Raven Reyes","12345678931", 12000, 34);
        PegawaiHarian Jasper = new PegawaiHarian("Jasper Jordan","12345678932", 11000, 33);
        System.out.println("======== Pegawai Harian =========");
        
        System.out.println(Clarke);
        System.out.println(Raven);
        System.out.println(Jasper);
        System.out.println("================================");
        
        Sales Roan = new Sales("Roan", "12345678920", 10, 50000);
        Sales John = new Sales("John Murphy", "12345678921", 50, 50000);
        Sales Madi = new Sales("Madi Griffin", "12345678922", 4, 40000);
        
        System.out.println("============ Sales =============");
        System.out.println(Roan);
        System.out.println(John);
        System.out.println(Madi);
        System.out.println("================================");
    }
    
}
