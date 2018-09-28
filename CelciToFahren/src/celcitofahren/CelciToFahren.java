/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celcitofahren;
import java.util.Scanner;
/**
 *
 * @author xasdqwex
 */
public class CelciToFahren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
double celci, fahren;

Scanner masukan = new Scanner(System.in);
System.out.print ("Masukan Suhu Dalam Celcius : ");
celci = masukan.nextInt();

fahren = celci *9/5 + 32;

System.out.println("Hasil Konversi Adalah : "+ fahren);
        
// TODO code application logic here
    }
    
}
