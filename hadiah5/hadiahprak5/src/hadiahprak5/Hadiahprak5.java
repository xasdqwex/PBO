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
import java.util.Scanner;
public class Hadiahprak5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        Hargaa abc = new Hargaa();
        String TipeHome,nama,alamat;
        char blokrumah;
        long byr;
        System.out.println("Masukkan nama Anda = ");
        nama = inp.next();
        System.out.println("Masukkan Alamat Anda = ");
        alamat = inp.next();
        System.out.println("Masukkan Tipe Rumah Yang Akan di beli = ");
        TipeHome = inp.next();
        System.out.println("Masukkan Blok yang akan Dibeli = ");
        blokrumah = Character.toUpperCase(inp.next().charAt(0));
        System.out.println("Harga Rumah = " +abc.GetHarga(TipeHome, blokrumah));
        System.out.print("Bayar = ");
        
        byr = inp.nextLong();
        databayar pelanggan = new databayar(nama,alamat,TipeHome,blokrumah);
        abc.GetHarga(TipeHome,blokrumah);
        pelanggan.bayarRumah(byr);
    }
    
}
