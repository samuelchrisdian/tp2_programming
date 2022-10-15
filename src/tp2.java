import java.util.*;

public class tp2 {
	public static void main(String[] args) {
		String Restart;
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Belajar Deret ARitmatika, Geometri, dan menghitung Faktorial");
			int angka,selisih,i=1,j=0,k=1,l=0,m=1,n;
			do {
				System.out.print("Masukkan banyak angka yang mau dicetak[2-10] : ");
				angka = in.nextInt();
				if(angka > 1 && angka < 11) {
					System.out.println(" ");
				}else {
					System.out.println("---- Input tidak valid! Silahkan masukkan angka yang mau dicetak[2-10] : ");
				} 
			}while (angka < 2 || angka > 10);
			
			do {
				System.out.print("Masukkan beda masing - masing angka[2-9] : ");
				selisih = in.nextInt();
				if(selisih > 1 && selisih < 10) {
					System.out.println(" ");
				}else {
					System.out.println("---- Input tidak valid! Silahkan masukkan beda masing - masing angka[2-9] : ");
				} 
			}while (selisih < 2 || selisih > 9);
			
			System.out.println("Deret Aritmatika : ");
			do {
				System.out.print(i + " ");
				i += selisih;
				j++;
			}while(j < angka);
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Deret Geometri : ");
			do {
				System.out.print(k + " ");
				k = k * selisih;
				l++;
			}while(l < angka);
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Faktorial : ");
			for(n = angka; n > 0; n--) {
				System.out.print(n + " * ");
				m *= n;
			}			
			System.out.print(" = " + m);
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.print("\nAnda mau ulang [y/t] :");
			Restart = in.next();
		}while(Restart.equals("y") || Restart.equals("Y"));
		System.out.println("Terimakasih Sudah menggunakan program saya :D!");
	}
}