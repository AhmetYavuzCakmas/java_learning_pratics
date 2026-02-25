import java.security.DrbgParameters.NextBytes;
import java.security.PublicKey;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class test2 {

	public static void main(String[] args) {
		/*
		int i = 1;
		while(i<=10) {
			if(i==6) {
				i++;
				continue;
				
			}
			System.out.println(i);
			i++;
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		int sayi;
		while(true) {
			System.out.print("1 sayısını giriniz: ");
			sayi = input.nextInt();
			
			if(sayi==1) {
				break;
			}
		}System.out.println("tebrikler 1 sayısını girdiniz.");
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		int sayi;
		int toplam = 0;
		while(true) {
			System.out.print("sayı giriniz: ");
			sayi = input.nextInt();
			toplam += sayi;
			if(sayi ==0) {
				break;				
			}
			
		}System.out.println("girdiğiniz sayıların toplamı: "+toplam);
		
		*/
		
		/*
		Scanner input  = new Scanner(System.in);
		
		int toplam = 0;
		int sayi;
		do {
			System.out.print("sayı giriniz: ");
			sayi = input.nextInt();
			toplam += sayi;
		}while(sayi!=0);
		System.out.println(toplam);
		*/
		
		/*
		for(int i = 0;i<= 10;i++) {
			for(int j = 0; j<=10;j++) {
				System.out.println(i +" * "+ j +" = "+ (i*j));
			}
		}
		*/
		
		/*
		int[] sayilar = {1,2,3,4,5,6,7,55};
		
		
		for(int i = 0;i <sayilar.length;i++) {
			System.out.println(sayilar[i]);
		}
		
		//veya 
		
		for(int sayi : sayilar) {
			System.out.println(sayi);
		}
		*/
		
		/*
		Scanner input =new Scanner(System.in);
		int sayilar[] = new int[5];
		
		int toplam = 0;
		int ilkSon = 0;
		
		for(int i =0 ;i <5;i++) {
			System.out.print((i + 1)+ ". sayı giriniz: ");
			int sayi = input.nextInt();
			sayilar[i] = sayi;
			toplam += sayi;
		}System.out.println("toplam sayı: "+toplam);
		System.out.println("ilk ve son sayının toplamı: "+ ((sayilar[0])+ (sayilar[4])));
		System.out.println("çarpım: "+(((sayilar[0])+ (sayilar[4])) * toplam));
		*/
		
		/*
		int[][] dizi = {{5,10,15,50},{20,25,30,55},{35,40,45,60}};
		int toplam = 0;
		
		for(int i = 0;i<dizi.length;i++) {
			for(int j = 0;j<dizi[i].length;j++) {
				System.out.print(dizi[i][j]+" ");
				toplam += dizi[i][j];
			}System.out.println();
			System.out.println((i+1)+". satırın toplamı: "+toplam);
		}			
		*/
		
		/*
		int[][] dizi = new int[5][6];
		int sayi = 0;
		
		for(int i = 0;i < dizi.length;i++) {
			for(int j = 0;j<dizi[i].length;j++) {
				dizi[i][j] = sayi;
				System.out.print(dizi[i][j]+" ");
				sayi += 2;
			}sayi+=8;
			System.out.println();
			*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		int sayi = input.nextInt();
		
		int fac = 1;
		while(sayi >0) {
			fac *= sayi;
			sayi --;
		}System.out.println(fac);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		int sayi = input.nextInt();
		
		int toplam = 0;
		while(sayi>0) {
			int kalan = sayi % 10;
			sayi = sayi/10;
			toplam += kalan;
			System.out.println(sayi);
			}System.out.println(toplam);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("işlem sayısı giriniz: ");
			int islem =input.nextInt();
			if(islem == 0) {
				System.out.println("döngüden çıkıldı..");
				break;
			}System.out.println("işlem: " + islem);
		*/
		
		
		/*
		for(int i =0;i<=10;i++) {
			if(i ==3 || i==5) {
				continue;
				
			}System.out.println("i= " + i);
		}
		*/
		
		
		
	}
		
		
}
		
		
