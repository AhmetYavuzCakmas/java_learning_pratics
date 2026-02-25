package son_tekrar1;

import java.util.Scanner;

public class ödev8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Taban giriniz: ");
		int taban = input.nextInt();
		
		System.out.println("Üs giriniz: ");
		int us = input.nextInt();
		
		int i = 1;
		int result=1;
		while(i<=us) {
			result = result* taban;
			i ++;
		}
		System.out.println(result);
	}

}
