package son_tekrar1;

import java.util.Scanner;

public class while_dongusu_ortalama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = 1;
		int total = 0;
		double mean = 0; 
		while(true) {
			System.out.println("Sayı giriniz: (çıkış için 0'a basınız)");
			int sayi = input.nextInt();
			if(sayi ==0) {
				break;
			}
			total +=sayi;
			mean = (double)total/k;
			k++;
			
		}System.out.println("ortalama değer: "+mean);
		

	}

}
