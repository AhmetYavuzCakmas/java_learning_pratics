import java.util.Iterator;
import java.util.Scanner;

public class test3 {
	public static void kendiniTanıt() {
		System.out.println("adı: yavuz");
		System.out.println("soyadı: Çakmas");
		System.out.println("okulu: marmara");
		System.out.println("bölümü: bilgisayar");
		
	}
	
	//-----------------------------------------------
	
	public static void ortalamaAl(int sayi1, int sayi2 ) {
		int toplam = sayi1 + sayi2;
		double ortalama = toplam / 2;
		System.out.println(ortalama);
	}
	
	//----------------------------------------------
	
	public static void buyukBul(int sayi1, int sayi2) {
		if(sayi1>sayi2) {
			System.out.println("büyük sayı: " + sayi1);
		}else if(sayi1<sayi2) {
			System.out.println("büyük sayı: "+ sayi2);
		}else {
			System.out.println("her iki sayıda eşittir.");
		}
	}
	
	//----------------------------------------------
	
	public static boolean asalKontrol(int sayi1) {
		boolean sonuc = true;
		for(int i = 2;i<sayi1;i++) {
			if(sayi1 % i == 0) {
				sonuc = false;
				break;
			}
		}
		return sonuc;
	}
	
	//-----------------------------------------------
	
	public static void karesiniAl(int sayi) {
		int kare = sayi * sayi;
		System.out.println(kare);
	}
	
	//-----------------------------------------------
	
	public static void puanYazdir(String adi, int puan) {
		System.out.println(adi+ " isimli kullanıcının puanını: "+ puan);
	}
	//-----------------------------------------------
	
	public static void password(String isim) {
		
		if (isim.length() < 3) {
            System.out.print("İsim en az 3 karakter olmalıdır.");
        }

        isim = isim.substring(0, 2);
        isim = isim + "*".repeat(isim.length() - 3);

        System.out.println(isim);
	}
	//-----------------------------------------------
	
	public static boolean asalSayi(int sayi) {
		for(int i = 2;i<sayi;i++) {
			if(sayi % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//----------------------------------------------
	
	public static void ebob(int sayi1,int sayi2) {
		int yeniSayi = 1;
		for(int i = 2;i <= Math.min(sayi1, sayi2);i++) {
			if(sayi1 % i == 0 && sayi2 % i ==0 ) {
				yeniSayi = i;
			}
		}System.out.println(sayi1 + " ve "+sayi2+" ebobları: "+yeniSayi);
	}
	
	public static void main(String[] args) {
		//METOTOLAR
		//metotlar main da çalıştırılır..
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		ortalamaAl(sayi1,sayi2);
		*/
		
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		buyukBul(sayi1,sayi2);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		int sayi = input.nextInt();
		
		
		if(asalKontrol(sayi)) {
			System.out.println(sayi + " sayısı asaldır");
			
		}else {
			System.out.println(sayi + " sayısı asal değildir");
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		int sayi;
		while(true) {
			System.out.print("sayı giriniz: ");
			sayi = input.nextInt();
			
			if(sayi==0) {
				break;
				
			}
			karesiniAl(sayi);			
		}System.out.println("bitti");
		*/
		
		/*
		puanYazdir("ahmet",45);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("adınızı giriniz: ");
		String isim = input.nextLine();
		isim = isim.toLowerCase();
		System.out.println(isim);
		*/
		
		/*
		String isim = "  bah aaj   psp   "; // baştaki ve sondaki fazla boşlukları aluyor.
		System.out.println(isim.trim());
		*/
		
		/*
		String isim = "ahmet";
		String ad = "yavuz";
		
		String tamİsim  = ad.concat(isim); //stringleri birleştirir.
		System.out.println(tamİsim);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
        System.out.print("adınızı giriniz: ");
        String isim = input.nextLine();

        System.out.println(password(isim));
		*/
		 
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("adınızı giriniz: ");
		String isim = input.nextLine();
		
		String isim1 = isim.substring(0,2);
		String isim2 = isim1.concat("*".repeat(isim.length()-2));
		System.out.println(isim2);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("tc kimlik no nuzun son hanesini giriniz: ");
		int sonHane = input.nextInt();
		System.out.println("bursunuzun alış tarihi:");
		switch(sonHane){
			case 0:
				System.out.println("ayın 2 sinde alınız.");
				break;
			case 2:
				System.out.println("ayın 4 sinde alınız.");
				break;
			case 4:
				System.out.println("ayın 6 sinde alınız.");
				break;
			case 6:
				System.out.println("ayın 8 sinde alınız.");
				break;
			case 8:
				System.out.println("ayın 10 sinde alınız.");
				break;
			default:
				System.out.println("tek sayı girmeyiniz..");
		}	
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("negatif sayı giriniz: ");
		int sayi = input.nextInt();
		System.out.println(Math.abs(sayi));  // mutlak değer
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		int sayi = input.nextInt();
		System.out.println(Math.sqrt(sayi)); //karekök 
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("taban sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("üs sayıyı giriniz: ");
		int sayi2 = input.nextInt(); 
		System.out.println(Math.pow(sayi1,sayi2)); //karesini al
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt(); 
		System.out.println(Math.max(sayi1,sayi2)); 
		System.out.println(Math.min(sayi1,sayi2));
		*/
		
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		double sayi = input.nextDouble();
		System.out.println(Math.round(sayi));  //onsalık sayıyı tam sayıya yuvarlar
		*/
		
		/*
		System.out.println(Math.random()*10); // bişeyle çarpmazsan 0 ile 1 arasında üretir.
		*/
		
		/*
		String sayi = "45";
		int tamSayi = Integer.parseInt(sayi);
		System.out.println(tamSayi + 10); //string ifadeyi integer çevirme
		 
		//YA DA
		
		String sayi = "45";
		int tamSayi = Integer.valueOf(sayi);
		System.out.println(tamSayi + 10 ); // bu da olur.
		*/
		
		/*
		double ondalik = 27.454;
		int tam = (int) ondalik;
		System.out.println(tam); //ondalikli sayının ondalıklı kısmını siler
		*/
		
		/*
		int sayi = 11;
		String karakter = String.valueOf(sayi);
		System.out.println(karakter+10); // stringe çevirme
		*/
		
		/*
		for(int i = 2;i<100;i++) {
			if (asalSayi(i)) {
				System.out.println(i);
			}
			
		}*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.println("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		ebob(sayi1, sayi2); 
		
		*/
	}
	

}
