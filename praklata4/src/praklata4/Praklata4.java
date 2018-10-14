/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praklata4;

/**
 *
 * @author autodone
 */
import java.util.Scanner;
public class Praklata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int a,b,c,d,e,max,min;
    System.out.println("Masukkan Nilai A = ");
    a = input.nextInt();
     System.out.println("Masukkan Nilai B = ");
    b = input.nextInt();
     System.out.println("Masukkan Nilai C = ");
    c = input.nextInt();
     System.out.println("Masukkan Nilai D = ");
    d = input.nextInt();
     System.out.println("Masukkan Nilai E = ");
    e = input.nextInt();
    
    min = a;
    max = a;
    if (b > max)
        max = b ;
    else if (b < min)
        min = b ;
        if (c > max)
        max = c ;
    else if (c < min)
        min = c ;
        if (d > max)
        max = d ;
    else if (d < min)
        min = d ;
         if (e > max)
        max = e ;
    else if (e < min)
        min = e ;
         
      System.out.println("nilai max adalah = " + max +"\nNilai Min adalah = "+ min);
    }
    
}
