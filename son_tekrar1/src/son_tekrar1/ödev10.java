package son_tekrar1;

import java.util.Scanner;

public class ödev10 {

	public static void main(String[] args) {
		
		for(int i =100;i<=999;i++) {
			int birler = i%10;
			
			int onlar = ((int)(i/10))%10;
			
			int yüzler = ((int)(i/100))%10;
			
			double toplam = Math.pow(birler,3) + Math.pow(onlar, 3) + Math.pow(yüzler, 3);
			if(i == toplam) {
				System.out.println(i+" sayısı armstrong sayısıdır.");
			}			
		}
	}
}
