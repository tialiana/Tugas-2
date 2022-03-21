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
public class Konstant {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        final float PHI = 3.1415f; 
        float r;
        Scanner masukan=new Scanner(System.in);
        
        /* program */ /* baca data */
        System.out.print ("Jari-jari lingkaran ="); 
        r = masukan.nextFloat();
        
        /* Hitung dan tulis hasil */
        System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
        System.out.print ("Akhir program \n");
    }
    
}
