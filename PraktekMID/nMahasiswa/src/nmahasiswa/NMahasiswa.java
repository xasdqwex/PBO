/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nmahasiswa;

/**
 *
 * @author autodone
 */
import java.util.Scanner;
public class NMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      proses mhs = new proses();
      System.out.print("Masukkan Nama : ");
      mhs.nama =input.next();
      System.out.print("Masukkan NIM : ");
      mhs.nim =input.next();
      mhs.nilai();
      System.out.print("Jumlah Kehadiran : ");
      mhs.jmlhadir = input.nextInt();
      System.out.print("Nilai Quiz : ");
      mhs.nilaiquiz =input.nextFloat();
      System.out.print("Nilai MID : ");
      mhs.nilaimid =input.nextFloat();
      System.out.print("Nilai Final : ");
      mhs.nilaifinal =input.nextFloat();
      mhs.dataMahasiswa();
      mhs.hnilaimhs();
      
      
     
        
    }
    
}
