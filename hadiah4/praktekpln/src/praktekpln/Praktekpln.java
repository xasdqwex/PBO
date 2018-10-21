/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktekpln;
import java.util.Scanner;
class pembayaran{
    int kembalian = 0;
    int harga=0;
    int bayar;
    String nama,block,alamat,tipe;
    
}

/**
 * 
 *
 * @author xasdqwex
 */
public class Praktekpln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kembalian=0;
        pembayaran b= new pembayaran();
        Scanner input = new Scanner(System.in);
        
             System.out.print("nama : ");
        String nama = input.next();
             System.out.print("alamat : ");
        String alamat = input.next();
             System.out.print("tipe :   ");
        String tipe = input.next();
             System.out.print("blok : ");
        String blok = input.next();
             System.out.print("bayar : ");
        int bayar = input.nextInt();

            if ( "36".equals(tipe)&&"a".equals(blok)){
                b.harga = 500000;
                }else if("36".equals(tipe)||"b".equals(blok)){
                 b.harga = 300000;
                 }else if("37".equals(tipe)||"a".equals(blok)){
                 b.harga = 800000;
                 }else if("37".equals(tipe)||"b".equals(blok)){
                 b.harga = 600000;
}else {
                     System.out.print("Tidak ada pilihan ");
                 }
            kembalian = ( bayar-b.harga );
            
     System.out.println("");
     System.out.println("nama : "+nama);
     System.out.println("Alamat : "+alamat);
     System.out.println("harga : "+b.harga);
     System.out.println("bayar : "+bayar);
     
     System.out.println("");
     System.out.println("sisa kembalian : "+kembalian);
     
     
     
            }
    }
    

