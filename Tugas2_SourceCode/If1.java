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
public class If1 {
    public static void main(String[] args) {
 
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Program */
        System.out.print ("Contoh IF satu kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer : "); 
        a = masukan.nextInt();
        
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a); 
    }
}
