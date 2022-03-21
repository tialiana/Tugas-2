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
public class PrintWhile {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N >0 = "); /* Inisialisasi */
        N = masukan.nextInt();
        i = 1; /* First Elmt */
        
        System.out.print ("Print i dengan WHILE: \n"); 
        while (i <= N) /* Kondisi pengulangan */
        { 
            System.out.println (i); /* Proses */
            i++;
        }; /* (i > N) */
    }
}
