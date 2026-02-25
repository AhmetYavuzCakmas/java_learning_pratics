package son_tekrar1;

import java.util.Scanner;

public class ödev11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		
		int sayi = input.nextInt();
		
		int f1 = 0;
		int f2 = 1;
		int toplam;
		
		for(int i = 0;i <sayi;i++) {
			
			System.out.print(f1+" , ");
			toplam = f1+f2;
			f1=f2;
			f2 = toplam;
			
		}
 
	}

}
