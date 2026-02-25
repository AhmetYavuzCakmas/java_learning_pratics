package son_tekrar1;

import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

public class ödev12 {

	public static void main(String[] args) {
/*
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = input.nextInt();
		
		String sayiString = Integer.toString(sayi);
		int digits = sayiString.length();
		
		int[] yeniSayi = new int[digits];
		
		for(int i = 0;i<digits;i++) {
			yeniSayi[i] = sayiString.charAt(digits-1-i);
			System.out.println(yeniSayi[i]);
		}
		
		if(yeniSayi == sayi) {
			System.out.println(sayi+" sayısı palindrom sayısıdır");
		}else {
			System.out.println(sayi+" sayısı palindrom değildir");
		}
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int orijinalSayi = sayi;
        int tersSayi = 0;

        // Sayıyı ters çevirme
        while (sayi != 0) {
            int basamak = sayi % 10;
            tersSayi = tersSayi * 10 + basamak;
            sayi /= 10;
            System.out.println(tersSayi);
        }
/*
        // Orijinal sayı ile ters çevrilmiş sayıyı karşılaştırma
        if (orijinalSayi == tersSayi) {
            System.out.println(orijinalSayi + " sayısı palindrom sayısıdır.");
        } else {
            System.out.println(orijinalSayi + " sayısı palindrom değildir.");
        }
 */
	}

}
