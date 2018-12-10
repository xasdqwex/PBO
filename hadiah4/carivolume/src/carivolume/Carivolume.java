/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carivolume;
import java.util.Scanner;
class v{
    int sisi;
    
}
/**
 *
 * @author xasdqwex
 */
public class Carivolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int volume;
        v a;
        a = new v();
        Scanner input = new Scanner(System.in);
    System.out.print("Masukan sisi kubus : ");
        int sisi = input.nextInt();
        
        volume = (sisi*sisi*sisi);
    System.out.print("Hasil : "+volume);
    }
    
}
