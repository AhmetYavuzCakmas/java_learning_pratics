package son_tekrar1;

import java.util.Scanner;

public class ödev7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int star = input.nextInt();
		
		int i = 1;
		while(i<=star) {
			int k = 1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		int j = star-1;
		while(j>0) {
			int k = j;
			while(k>1) {
				System.out.print("*");
				k--;
			}
			System.out.println();
			j--;
		}
	}

}
