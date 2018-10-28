/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprak5;

/**
 *
 * @author xasdqwex
 */
public class databayar extends Hargaa {
    protected String nama, almt;
    protected long byr,kmbalian,Hargaa;
    
public databayar(String nama,String almt,String tipe, char blok){
    this.nama=nama;
    this.almt=almt;
    this.Hargaa=GetHarga (tipe,blok);}


public void cetakKembalian(long byr){
    kmbalian =byr-harga;
    System.out.println("Kembalian = "+ kmbalian);
    
}
public void bayarRumah(long byr){
    if(byr<harga){
        System.out.println("Pembayaran anda kurang !!");
        System.exit(0);
    }
    else {
        cetakKembalian(byr);
    }
}

}
