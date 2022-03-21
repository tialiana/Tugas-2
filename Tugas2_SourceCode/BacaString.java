/* NIM          : 13020200176
*  Nama         : Tia Liana
*  Hari/Tanggal : Rabu/9-Maret-2022
*  Waktu        : 09.40
*/
package tugas2_sourcecode;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class BacaString {
    public static void main(String[] args) throws IOException{
     String str; 
    BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
    /* Program */
    System.out.print ("\nBaca string dan Integer: \n"); 
    System.out.print("masukkan sebuah string: "); 
    str= datAIn.readLine();
    System.out.print ("String yang dibaca : "+ str);
}
}
