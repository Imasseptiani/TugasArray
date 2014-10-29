/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author User
 */
public class Prj_Aray_1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array,x;
        //inputan panjang array
        System.out.print("Masukkan Panjang Array :");
        array=new Scanner(System.in).nextInt();
        
        String nama[]=new String[array];
        int nilai[]=new int[array];
        
        //inputan untuk nama dan nilai
        for(x=0;x<array;x++)
        {
            System.out.print("Masukkan Nama Ke-"+(x+1)+" =");
            nama[x]=new Scanner(System.in).nextLine();
            System.out.print("Masukkan Nilai Ke-"+(x+1)+" =");
            nilai[x]=new Scanner(System.in).nextInt();
        }   
            //Output
        System.out.println("");
         for(x=0;x<array;x++)
        {
            System.out.println("Nama Ke"+(x+1)+" :"+nama[x]+" Dengan Nilai "+nilai[x]);
                      
        }   
            
        
        
}
}