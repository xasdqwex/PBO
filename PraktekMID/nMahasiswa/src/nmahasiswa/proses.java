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
public class proses extends dataku {
    String nim,nama;
    float nilaihadir,nilaiakhir,nilaiquiz,nilaimid,nilaifinal;
    char nilaihuruf;
    int jmlhadir;
    

float hnilaimhs(){
  nilaihadir = jmlhadir/16*10;
  nilaiakhir = nilaihadir + (nilaiquiz*10/100) + (nilaimid * 40/100) + (nilaifinal * 40/100);
  
    if (nilaiakhir>=80 && nilaiakhir<=100)
        nilaihuruf='A';
    else if (nilaiakhir>=70 && nilaiakhir<=79)
        nilaihuruf='B';
        else if (nilaiakhir>=60 && nilaiakhir<=69)
        nilaihuruf='C';
        else if (nilaiakhir>=50 && nilaiakhir<=59)
        nilaihuruf='D';
        else if (nilaiakhir<=50)
            nilaihuruf='E';
    
    System.out.println("Nilai Akhir = " +nilaiakhir);
    System.out.println("Nilai Huruf = " +nilaihuruf);
    return nilaiakhir;
    

}

void dataMahasiswa(){
    System.out.println("Nama Mahasiswa "+nama);
    System.out.println("NIM : "+nim);
}    
}
