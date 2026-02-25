package son_tekrar1;

import java.util.Scanner;

public class ödev4 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz: ");
	int sayi = input.nextInt();
	int faktöriyel = 1;
	if(sayi<0) {
		System.out.println("Negatif sayının faktöriyeli olmaz");
	}
	else if(sayi ==0) {		
		System.out.println("girdiğiniz 0 sayısının faktöriyeli 1'dir.");		
	}
	else {
		for(int i = 1;i<=sayi;i++) {
			faktöriyel *= i;
					
			}
		System.out.println(faktöriyel);	
		}
	}

}
