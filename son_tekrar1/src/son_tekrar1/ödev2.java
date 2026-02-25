package son_tekrar1;

import java.util.Scanner;

public class ödev2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int total = 0;
		while(true) {
			int sayi = input.nextInt();
			if(sayi<0) {
				
				break;
			}
			if(sayi%2==1) {
				total +=sayi;
			}
		}System.out.println("Girdiğiniz sayılardan tek olanların toplamı: "+total);
		

	}

}
