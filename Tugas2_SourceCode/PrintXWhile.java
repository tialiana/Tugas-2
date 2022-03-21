/* NIM          : 13020200176
*  Nama         : Tia Liana
*  Hari/Tanggal : Rabu/9-Maret-2022
*  Waktu        : 09.40
*/
package tugas2_sourcecode;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class PrintXWhile {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        Sum = 0; /* Inisialisasi */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : "); 
        x = masukan.nextInt();/* First Elmt*/
        
        while (x != 999) /* Kondisi berhenti */ {
            Sum = Sum + x; /* Proses */
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : "); 
            x = masukan.nextInt();/* First Elmt*/
           
        }
        System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */
    }
}
