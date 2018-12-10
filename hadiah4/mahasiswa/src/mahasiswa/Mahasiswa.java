/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;
import java.util.Scanner;
class siswa{
     String nim,nama,jurusan;
     void setnama(String namamhs){
         nama = namamhs;
     }
     void setjurusan(String jurusanmhs){
        jurusan = jurusanmhs;
    }
    void setnim(String nimmhs){
        nim = nimmhs;
    }
    void cetak(){
        System.out.println(" Nama Saya Adalah " +nama+" jurusan " +jurusan+"dan Nim saya adalah " +nim);
        
    }
}
/**
 *
 * @author xasdqwex
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    siswa ku = new siswa();
    Scanner input = new Scanner(System.in);
    
    System.out.print("nama : ");
    String nama = input.next();
    System.out.print("jurusan : ");
    String jurusan = input.next();
    System.out.print("nim : ");
    String nim = input.next();
    System.out.println("");
    
    System.out.println("nama : "+nama);
    System.out.println("Jurusan :"+jurusan);
    System.out.println("Nim : "+nim);
    }
    
}
