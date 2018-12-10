/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak5tugas1;
import java.io.*;


/**
 *
 * @author autodone
 */
public class Prak5tugas1 {
    private double radius;
    public Prak5tugas1 (double radius){
        this.radius=radius;
    }
public void Luas(){
    double luas= 3.13*radius*radius;
    System.out.println("Luas lingkaran : "+luas);
}
public void Keliling(){
    double keliling = 2.0*3.14*radius;
    System.out.println("Keliling Lingkaran : "+keliling);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
    DataInputStream dis = new DataInputStream(System.in);
    System.out.print("Input Radius : ");
    String input = dis.readLine();
    double i = Double.parseDouble(input);
    Prak5tugas1 A = new Prak5tugas1 (i);
    A.Luas();
    A.Keliling();
    
    }
    
    
}
