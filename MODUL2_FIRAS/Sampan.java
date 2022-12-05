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
public class Sampan extends TransportasiAir{
    protected int layar;
    
    public Sampan(int jumlahKursi, int biaya, int layar){
       super(jumlahKursi,biaya);
       this.layar = layar;
    }
    @Override
     public void informasi(){
       System.out.println("Transportasi air jenis sampan dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
     public void berlayar(){
        System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan "+ layar + " layar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi air jenis sampan berlabuh di pantai menggunakan "+jangkar +" jangkar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis sampan berlabuh di pantai tanpa jangkar");
    }
}