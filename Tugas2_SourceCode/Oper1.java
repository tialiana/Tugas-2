/* NIM          : 13020200176
*  Nama         : Tia Liana
*  Hari/Tanggal : Rabu/9-Maret-2022
*  Waktu        : 09.40
*/
package tugas2_sourcecode;


public class Oper1 {
    
    public static void main(String[] args) {
        int n = 10; /* 1010 */
        int x = 1; /* 1 */
        int y = 2; /* 10 */

        System.out.println ("n = "+ n);
        System.out.println ("x = "+ x);
        System.out.println ("y = "+ y);
        System.out.println ("n & 8 = "+ (n & 8));
        System.out.println ("x & ~ 8 = "+ (x & ~8)); 
        System.out.println ("y << 2 = "+ (y << 2)); 
        System.out.println ("y >> 3 = "+ (y >>3)); 
    }
}
