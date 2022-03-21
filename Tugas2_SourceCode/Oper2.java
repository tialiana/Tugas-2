/* NIM          : 13020200176
*  Nama         : Tia Liana
*  Hari/Tanggal : Rabu/9-Maret-2022
*  Waktu        : 09.40
*/
package tugas2_sourcecode;

public class Oper2 {
    
    public static void main(String[] args) {
        
        char i, j;
        /* ALGORITMA */
        i = 3; /* 00000011 dalam biner */
        j = 4; /* 00000100 dalam biner */

        System.out.println("i = "+ (int) i); 
        System.out.println("j = "+ j);
        System.out.println("i & j = "+ (i & j)); 
        System.out.println("i | j = "+ (i | j)); 
        System.out.println("i ^ j = "+ (i ^ j)); 

        System.out.println(Math.pow(i, j)); 
        System.out.println(" ~i = "+ ~i); 
    }
}
