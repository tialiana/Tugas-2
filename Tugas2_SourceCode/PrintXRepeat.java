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
public class PrintXRepeat {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        
            if (x == 999){
            System.out.print("Kasus kosong \n");
            
            }else { /* MInimal ada satu data yang dijumlahkan*/
                Sum = 0; /* Inisialisasi; invariant !! */
                
                do{
                    Sum = Sum + x; /* Proses */
                    System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                    x = masukan.nextInt(); /* Next Elmt */
                        
                     } while (x != 999);
                       System.out.println ("Hasil penjumlahan = "+Sum);
                        /* Terminasi */
            } 
    }

}
