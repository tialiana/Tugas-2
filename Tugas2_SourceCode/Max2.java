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
public class Max2 {
    
    public static void main(String[] args) {

        int a, b;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a=masukan.nextInt();
        b=masukan.nextInt();

        System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b); 
        if (a >= b){
            System.out.println ("Nilai a yang maksimum "+ a);
        
        }else /* a > b */{
            System.out.println ("Nilai b yang maksimum: "+ b);
        } 
    }
}
