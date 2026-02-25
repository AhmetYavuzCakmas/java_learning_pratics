package quiz_tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class array_tek_cift_ayırma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("dizi giriniz(ilk sayınız dizi uznluğu): ");
		int dizi_uzunluğu = input.nextInt();
		ArrayList<Integer> tek_sayilar = new ArrayList<>(); 
		ArrayList<Integer> cift_sayilar = new ArrayList<>();
		int i = 0;
		while(i<dizi_uzunluğu) {
			int sayi =input.nextInt();
			if(sayi %2==0) {
				cift_sayilar.add(sayi);
			}else {
				tek_sayilar.add(sayi);
			}
			i++;
		}
		System.out.println("tek sayılar: "+tek_sayilar);
		System.out.println("çift sayılar"+cift_sayilar);
	}

}
