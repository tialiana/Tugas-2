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
public class If3 {
    
    public static void main(String[] args) {

        int a;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Contoh IF tiga kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a=masukan.nextInt();
        
        if (a > 0){
            System.out.println ("Nilai a positif "+ a);
        
        }else if (a == 0){
            System.out.println ("Nilai Nol "+ a);
        
        }else /* a > 0 */ {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
}
