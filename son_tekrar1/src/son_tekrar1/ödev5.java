package son_tekrar1;

import java.util.Scanner;

public class ödev5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = input.nextInt();
		
		double total = 0;
		for(int i = 1;i<=sayi;i++) {
			total += (double)1/i;
			
		}
		System.out.println("Girdiğiniz sayının harmonik toplamı: "+total);

	}

}
