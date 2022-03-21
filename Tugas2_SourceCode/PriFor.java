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
public class PriFor {
    
    public static void main(String[] args) {

        int i,N; 
        Scanner masukan=new Scanner(System.in);
        /* Program */
        /* program */
        System.out.print ("Baca N, print 1 s/d N "); 
        System.out.print ("N = ");
        N=masukan.nextInt();
            for (i = 1; i <= N; i++){
                System.out.println (i); 
            };
                System.out.println ("Akhir program \n"); 
    }
}
