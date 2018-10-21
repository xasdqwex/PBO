/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carilingkaran;
import java.util.Scanner;
class bundaran{
        int jari;
        
}
/**
 *
 * @author xasdqwex
 */
public class Carilingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int luas;
    bundaran b = new bundaran();
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jari-jari lingkaran : ");
    int jari = input.nextInt();
    
    luas = (int)(3.14*(jari*jari));
    System.out.println("Luas Lingkaran : "+luas);
    
    }
    
    
}
