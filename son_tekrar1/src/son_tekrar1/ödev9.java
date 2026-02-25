package son_tekrar1;

import java.util.Scanner;

public class ödev9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = input.nextInt();
		
		boolean asal = true;
		
		for(int i = 2;i <=sayi/2;i++) {
			if(sayi%i==0) {
				asal = false;
				break;
			}
		}
		
		if(asal) {
			System.out.println(sayi+" sayısı asaldır");
		}else {
			System.out.println(sayi+" sayısı asal değildir");
		}
	}

}
