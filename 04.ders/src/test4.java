
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		/*
		char a = '\u16B5';  //unicode table
		System.out.println(a);
		*/
		
		
		/*
		int b = 20;
		double c = 100;
		
		double d = b/c; // int --> float --> double baskın
		System.out.println(d);
		*/
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		int yas = input.nextInt();
		input.nextLine(); //DUMMY sonraki satıra geçer ve hata vermez
							// kaldır ve hatayı gör
		String isim = input.nextLine();
		
		System.out.println("yaş: "+ yas);
		System.out.println("isim: "+ isim);
		*/		
		
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("kilo giriniz: ");
		int kilo = input.nextInt();
		
		System.out.println("boy giriniz (m): ");
		double boy = input.nextDouble();
		
		double endex = kilo / (boy*boy);
		
		System.out.println(" boy kilo endeksiniz: "+endex);
		*/
		
		
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("benzin lt fiyati 30.72 TL");
		double benzin = 30.72 ;
		System.out.println("km başı kaç lt benzin yakıyor: ");
		double km = input.nextDouble();
		
		System.out.println("kaç km yol gittiniz: ");
		double yol = input.nextDouble();
		
		double masraf = yol*km*benzin;
		
		System.out.println("masrafınız: "+masraf+" tl");
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("yaşınızı girniz: ");
		int yas = input.nextInt();
		
		if (yas <= 15) {
			System.out.println("yaşınız "+yas+" olduğu için giremessiniz");
		}else {
			System.out.println("hoşgeldiniz.");
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		
		System.out.println("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();		
		
		System.out.println("3. sayıyı giriniz: ");
		int sayi3 = input.nextInt();	
		
		if ( sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("en büyük sayı: "+sayi1);
		}else if ( sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("en büyük sayı: "+sayi2);
		}else {
			System.out.println("en büyük sayı: "+sayi3);
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		int sayi = input.nextInt();
		
		int fac = 1;
		for(int i = 1;i <= sayi; i++) {
			fac *= i;
			
		}System.out.println(fac);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		int sayi = input.nextInt();
		
		int basamakSayisi = 0;
		int sayi1 = sayi;
		
		while(sayi1!=0) {
			sayi1 = sayi1/10;
			basamakSayisi ++ ;
		}
		System.out.println(basamakSayisi);
			
		int toplam = 0;
		int sayi2 = sayi;
		
		while(sayi2 != 0) {	
			int basamakDeğeri = sayi2 % 10;
			toplam += Math.pow(basamakDeğeri, basamakSayisi);
			sayi2 /=10;			
		}
		
		
		if(sayi == toplam) {
			System.out.println(sayi +" armstrong sayıdır");
		}else {
			System.out.println(sayi +" armstrong sayısı değildir");
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		int sayi = input.nextInt();
		
		for(int i = 0; i <=10;i++) {
			for(int j=1;j<=sayi;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
