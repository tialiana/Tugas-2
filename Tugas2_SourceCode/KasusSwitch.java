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
public class KasusSwitch {
    
    public static void main(String[] args) {

        char cc;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n"); 
        cc=masukan.next().charAt(0);
        
        switch (cc) {
            case 'a': { System.out.print (" Yang anda ketik adalah a \n"); break;}
            case 'u': { System.out.print (" Yang anda ketik adalah u \n"); break;}
            case 'e': { System.out.print (" Yang anda ketik adalah e \n"); break;}
            case 'i': { System.out.print (" Yang anda ketik adalah i \n"); break;}
            case 'o': { System.out.print (" Yang anda ketik adalah o \n"); break;}
            default:
                
            System.out.print (" Yang anda ketik adalah huruf mati \n");
        }
    }
}
