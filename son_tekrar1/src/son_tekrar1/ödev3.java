package son_tekrar1;

import java.util.Scanner;

public class ödev3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = input.nextInt();
		for(int i =1;i<=sayi;i++) {
			int karesi = i*i;
			System.out.println(karesi);
		}

	}

}
