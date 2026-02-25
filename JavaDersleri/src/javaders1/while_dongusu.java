package javaders1;

import java.util.Scanner;

public class while_dongusu {

	public static void main(String[] args) {
		/*
		int i = 1;
		
		while(i<51) {
			if (i%5==0) {
				System.out.println(i);
			}
			
			i++;
		}
*/
		
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		int sayi = input.nextInt();
		
		String sayiString = Integer.toString(sayi);
		int basamakSayisi = sayiString.length();
		System.out.println("Basamak sayısı: "+basamakSayisi);
		
		int i = 0;
		int toplam = 0;
		int onlu = 1;
	
		while(i<basamakSayisi) {
			toplam += (sayi/onlu)%10;
			i++;
			onlu*=10;
			
		}
		System.out.println("Basamaktaki sayıların toplamı: "+toplam);
		*/
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Sayı giriniz: "); 
		int sayi = input.nextInt(); 
		int toplam = 0; 
		while (sayi > 0) { 
			toplam += sayi % 10; 
			sayi /= 10; } 
		System.out.println("Basamaktaki sayıların toplamı: " + toplam);
		
	}

}
