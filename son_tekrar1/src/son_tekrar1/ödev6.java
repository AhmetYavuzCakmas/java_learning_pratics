package son_tekrar1;

import java.util.Scanner;

public class ödev6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = input.nextInt();
		
		double total = 0.0;
		while(sayi>0) {
			total += (double)1/sayi;
			sayi--;
		}
		System.out.println(total);

	}

}
