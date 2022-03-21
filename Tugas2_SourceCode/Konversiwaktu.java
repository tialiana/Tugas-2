/* NIM          : 13020200176
*  Nama         : Tia Liana
*  Hari/Tanggal : Rabu/9-Maret-2022
*  Waktu        : 09.40
*/
package konversiwaktu;
import java.util.Scanner;

public class Konversiwaktu {

    public static void main(String[] args) {
        int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan total detik = ");
            totalDetik = input.nextInt();
            
            detikSekarang = totalDetik%60;
            totalMenit = totalDetik/60;
            menitSekarang = totalMenit%60;
            totalJam = totalMenit/60;
            jamSekarang = totalJam%24;
                
            System.out.println("Waktu " + jamSekarang + " jam : " + menitSekarang + " menit : " +  detikSekarang + " detik");
    }
    
}
