/*
   Nama    : Rizky Dwi Amalia
   Stb     : 13020180138
   Kelas   : B2
   waktu   : 25 April 2020
 */

//Nomor 5
//Mengalikan bilangan bulat 
import java.util.Scanner;
public class uts5 {
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int i,n,kali=1;
	/*  i = jumlah data dalam array
            n = batas akhir input array
            kali = untuk mengkalikan semua data dalam array
	*/
		
	System.out.print("Masukkan Jumlah bilangan : ");
	n=input.nextInt();
		
	int[] bil = new int[100];

	System.out.println("\ninput "+ n +" bilangan ");
            for(i=1; i <= n; i++){
		System.out.print("\nbil ke-"+i+ " = ");
		bil[i] = input.nextInt();
		kali = kali*bil[i];
            }	
	System.out.println("\nBilangan yang diinputkan : ");
            for(i=1; i <= n; i++){
            System.out.print(bil[i] + " ");
		}
	System.out.println("\n\nHasil Perkalian : "+ kali);
		
	}
}
