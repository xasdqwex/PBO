/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesawattiket;

/**
 *
 * @author autodone
 */
import java.util.Scanner;
public class Pesawattiket {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bayar,harga = 0,kembalian;
        String nama,alamat;
        char tipe;
    Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        nama = masukan.nextLine();
        System.out.print("Masukkan alamat anda : ");
        alamat = masukan.nextLine();
        System.out.print("Masukkan tipe pesawat : ");
        tipe = masukan.next().charAt(0);
        switch (tipe) {
            case 'a':
                harga = 5000000;
                break;
            case 'b':
                harga = 2000000;
                break;
            case 'c':
                harga = 1000000;
                break;
            default:
                System.out.print("Pilihan tidak ditemukan!");
                break;
                      }
    System.out.println("Tipe pesawat yang dipilih  "+tipe+",dengan harga Rp."+harga);
        System.out.print("Bayar : ");
        bayar = masukan.nextInt();
        
        kembalian=bayar-harga;
        System.out.println("");
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Total kembalian : "+kembalian);
        
    }
    
}
