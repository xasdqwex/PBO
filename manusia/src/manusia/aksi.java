/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusia;
import java.util.Scanner;
/**
 *
 * @author autodone
 */
public class aksi {
  public static void main(String args[]){
      String NIK,nama,JenisKelamin;
      int Umur;
      String NIM,Fakultas = null,Jurusan;
      double Tugas1,Tugas2,Tugas3;
      double UTS, UAS;
      double hasil;
      
      mahasiswa MHS = new mahasiswa();
      Scanner SC = new Scanner(System.in);
      
      System.out.println("Masukkan NIK : ");
      NIK = SC.nextLine();
      System.out.println("Masukan Nama Anda : ");
      nama = SC.nextLine();
      System.out.println("Masukkan Jenis Kelamin : ");
      JenisKelamin = SC.nextLine();
      System.out.println("Masukkan Umur : ");
      Umur = SC.nextInt();
      SC.nextLine();
      System.out.println("Masukkan NIM : ");
      NIM = SC.nextLine();
      System.out.println("Masukkan Fakultas : ");
      Jurusan = SC.nextLine();
      
      System.out.println("Masukkan TGS1");
      Tugas1 = SC.nextDouble();
      System.out.println("Masukkan TGS2");
      Tugas2 = SC.nextDouble();
      System.out.println("Masukkan TGS3");
      Tugas3 = SC.nextDouble();
      System.out.println("Masukkan UTS : ");
      UTS = SC.nextDouble();
      System.out.println("Masukkan UAS : ");
      UAS = SC.nextDouble();
    
      
      MHS.identitas(NIK, nama, JenisKelamin, Umur);
      MHS.DataMahasiswa(NIM, Fakultas, Jurusan);
      MHS.nilaiMahasiswa(Tugas1, Tugas2, Tugas3, UTS, UAS);
      
      
  }  
}
