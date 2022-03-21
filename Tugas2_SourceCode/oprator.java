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
public class oprator {
    public static void main(String[] args) {

        boolean Bool1, Bool2, TF ;
        int i, j, hsl ;
        float x, y, res; 
        /* algoritma */
        System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
        Bool1 = true; Bool2 = false;
        
        TF = Bool1 && Bool2 ;/* Boolean AND */
        System.out.println(TF);
        
        TF = Bool1 || Bool2 ; /* Boolean OR */
        System.out.println(TF);
        
        TF = ! Bool1 ; /* NOT */
        System.out.println(TF);
        
        TF = Bool1 ^Bool2; /* XOR */
        System.out.println(TF);
        
        /* operasi numerik */
        i = 5; j = 2 ;
        hsl = i+j; 
        System.out.println(hsl);
        hsl = i - j; 
        System.out.println(hsl);
        hsl = i / j; 
        System.out.println(hsl);
        hsl = i * j;
        System.out.println(hsl);
        hsl = i /j ; /* pembagian bulat */
        System.out.println(hsl);
        hsl = i%j ; /* sisa. modulo */
        System.out.println(hsl);
        
        /* operasi numerik */
        x = 5 ; y = 5 ;
        res = x + y;
        System.out.println(res);
        res = x - y; 
        System.out.println(res);
        res = x / y; 
        System.out.println(res);
        res = x * y;
        System.out.println(res);
        
        /* operasi relasional numerik */
        TF = (i==j); 
        System.out.println(TF);
        TF = (i!=j);
        System.out.println(TF);
        TF = (i < j); 
        System.out.println(TF);
        TF = (i > j); 
        System.out.println(TF);
        TF = (i <= j);
        System.out.println(TF);
        TF = (i >= j);
        System.out.println(TF);
        
        /* operasi relasional numerik */
        TF = (x != y);
        System.out.println(TF);
        TF = (x < y); 
        System.out.println(TF);
        TF = (x > y); 
        System.out.println(TF);
        TF = (x <= y);
        System.out.println(TF);
        TF = (x >= y);
        System.out.println(TF);
    }
}
