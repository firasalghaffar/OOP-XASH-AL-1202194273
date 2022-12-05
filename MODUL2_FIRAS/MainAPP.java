/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPMODUL2_firas;

/**
 *
 * @author ASUS
 */
public class MainApp {
    public static void main(String[] args) {
       TransportasiAir tAir = new TransportasiAir(4,20000);
       tAir.informasi();
       tAir.berlayar();
       tAir.berlabuh();
       System.out.println("");
       Kapal kapal1 = new Kapal(20,100000,"diesel");
       Sampan sampan1 = new Sampan(20,50000,2);
       sampan1.informasi();
       sampan1.berlayar();
       sampan1.berlabuh();
       sampan1.berlabuh(2);
       System.out.println("");
       kapal1.informasi();
       kapal1.berlayar();
       kapal1.berlayar(20);
       kapal1.berlabuh();
       
    }
}