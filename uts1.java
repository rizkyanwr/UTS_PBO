/*
 *  Nama    : Rizky Dwi Amalia
 *  Stb     : 13020180138
 *  Kelas   : B2
 */

//Nomor 1
//Konversi cm ke inch
import java.util.Scanner;
public class uts1 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int cm; float inch;
        System.out.print("masukan ukuran dalam cm : ");
        cm = masuk.nextInt();
        inch = cm/2.54f;
        System.out.println("Hasil dari "+cm+" cm = "+inch+" inch");
    }
}
