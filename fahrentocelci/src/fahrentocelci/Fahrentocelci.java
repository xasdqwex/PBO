/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrentocelci;
import java.util.*;
/**
 *
 * @author xasdqwex
 */
public class Fahrentocelci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float tempe;
Scanner masuk = new Scanner (System.in);

System.out.print ("Masukan Temparature kedalam Fahrenheit : ");
tempe = masuk.nextInt();

tempe = ((tempe - 32)*5)/9;

System.out.println ("Temparature ke Celcius Adalah :  "+tempe); 
        
        // TODO code application logic here
    }
    
}
