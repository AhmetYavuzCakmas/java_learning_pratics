import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.print.attribute.standard.PagesPerMinute;

public class test01 {

	public static void main(String[] args) {
		/*
		 * System.out.print("hello world"); long a = 999999999999999999L;
		 * System.out.println(a);
		 */
    
		
		/*
		Scanner scanner = new Scanner(System.in);

		System.out.print("Adınız: ");
		String isim = scanner.nextLine();

		System.out.print("soyadınız: ");
		String soyisim = scanner.nextLine();

		System.out.print("vize 1 : ");
		double vize1 = scanner.nextDouble();

		System.out.print("vize2 ; ");
		double vize2 = scanner.nextDouble();

		System.out.print("final : ");
		double finalnotu = scanner.nextDouble();

		double sonuc = (vize1 + vize2) * 0.3 + (finalnotu * 0.4);

		if (sonuc >= 60) {
			System.out.println(isim + " " + soyisim + " " + "notunuz: " + sonuc + "dersten geçtiniz. Tebrikler");

		} else {
			System.out.println("dersten kaldın gardaş. çalışaydın...");
		}
		*/
		
		/*
		int i = 1;
		while(i<=10) {
			
			System.out.println(i);
			i ++;
			
		}
		*/
		
		/*
		
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		int sayi = input.nextInt();
		sayi = sayi + 25;
		System.out.print(sayi);
		
		*/
		
		/*
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("yükseklik giriniz: ");
		int height = input.nextInt();
		System.out.print("yarıçap giriniz: ");
		int yaricap = input.nextInt();
		int hacim = height*3*yaricap*yaricap;
		System.out.println("silindirin hacmi: "+ hacim);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("kısa kenar giriniz: ");
		int kisa = input.nextInt();
		System.out.print("uzun kenar giriniz: ");
		int uzun = input.nextInt();
		int alan = kisa * uzun;
		System.out.print("dikdörtgenin alanı: "+alan);
		*/
		
		/*
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("kütleyi giriniz(m) : ");
		int m = scanner.nextInt();
		System.out.print("ivmeyi giriniz(a) : ");
		int a = scanner.nextInt();
		int F = m*a;
		System.out.println("kuvvet değeriniz : "+F);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		int sayi = input.nextInt();
		
		if (sayi % 2 == 0) {
			System.out.println("girdiğiniz sayı çifttir");
		}else {
			System.out.println("girdiğiniz sayi tektir.");
		}
		*/
		
		/*
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = inputScanner.nextInt();
		
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = inputScanner.nextInt();
		
		if(sayi1 + sayi2 > 10) {
			System.out.println("kazandınız..");
		}else {
			System.out.println("kaybettiniz..");
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("vize notunu giriniz: ");
		int vize = input.nextInt();
		
		System.out.print("final notunu giriniz: ");
		int fınal = input.nextInt();
		
		double ortalama = ((vize*0.4) + (fınal*0.6));
		
		if(ortalama > 35) {
			if(fınal > 35) {
				System.out.println("dersi geçtiniz...");
			}else {
				System.out.println("dersten final notunuz 35 ten düşük olduğu için kaldınız..");
			}
		}else {
			System.out.println("bütünlemeye kaldınız...");
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.print("kullanıcı adı giriniz: ");
		String kullaniciAdi = input.nextLine();
		
		System.out.print("şifreyi giriniz: ");
		String sifreString = input.nextLine();
		
		if(kullaniciAdi.equals("admin")) {
			if(sifreString.equals("123456")) {
				System.out.println("giriş başarılı...");				
			}else {
				System.out.println("şifreyi yanlış girdiniz..");
			}
		}else {
			System.out.println("kullanıcı adını hatalı girdiniz..");
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("kaçıncı sınıfsınız: ");
		byte sinif = input.nextByte();
		
		switch(sinif) {
			case 1 :
				System.out.print("ÇAYLAK");
				break;
			case 2:
				System.out.print("KALFA");
				break;
			case 3:
				System.out.print("USTA");
				break;
			case 4:
				System.out.print("ÜSTAD");
				break;
			default:
				System.out.print("geçerli değer giriniz...");
		}
		*/
		
		/*
		 Scanner input = new Scanner(System.in);
		 System.out.print("bölge giriniz: ");
		 String bolge = input.nextLine();
		 
		 switch(bolge) {
		 	case "doğu anadolu bolgesi":
		 		System.out.println("bursunuz: 5000 YTL");
		 		break;
		 	case "güneydoğu anadolu bolgesi":
		 		System.out.println("bursunuz: 4000 YTL");
		 		break;
		 	case "karadeniz":
		 		System.out.println("bursunuz: 3000 YTL");
		 		break;
		 	case "akdeniz":
		 		System.out.println("bursunuz: 2000 YTL");
		 		break;
		 	case "marmara":
		 		System.out.println("bursunuz: 1500 YTL");
		 		break;
		 	case "ege":
		 		System.out.println("bursunuz: 1250 YTL");
		 		break;
		 	case "iç anadolu bolgesi":
		 		System.out.println("bursunuz: 2250 YTL");
		 		break;
		 	default:
		 		System.out.println("türkiyeden bölge giriniz..");
		 }
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		System.out.print("3. sayıyı giriniz: ");
		int sayi3 = input.nextInt();
		if(sayi1%2==0 || sayi2%2==0 || sayi3%2==0) {
			System.out.println("kazandınız..");
		}else {
			System.out.println("kaybettiniz");
		}
		*/
		
		/*
		
		for(int i = 0; i <=10; i++) {
			for(int j = 0;j <5;j++) {
				System.out.println(i +"+"+ j +"= " + (i+j));
			}
		}
		*/
		
		/*
		int sayac = 0;
		while(sayac < 10) {
			System.out.println(sayac + " ahmet");
			sayac++;
		}
		*/
		
		
		/*
		int i = 0;
		do {
			System.out.println(i+ " ahmet");
			i ++;
		}while(i<10);
		System.out.println(i+ " döngü bitti");
		*/
		
		/*
		Scanner input = new Scanner(System.in);
	
		int toplam = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+". sayı giriniz: ");
			int sayi = input.nextInt();
			toplam += sayi;
			
		}
		System.out.println("sonuç: " + toplam);
		*/
		
		/*
		Scanner input= new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		int sayi = input.nextInt();
		
		int carpım = 1;
		for(int i = 1;i<=sayi;i++) {
			carpım =carpım* i;
		}	
		System.out.println(sayi + " faktoriyel "+ carpım);
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		
		for(int i = sayi1; i<=sayi2; i++) {
			if(i%2==0) {
				System.out.println(i + " sayısı çifttir.");
			}else {
				System.out.println(i + " sayısı çift değildir.");
			}
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		
		if(sayi1<sayi2) {
			while(sayi1<=sayi2) {
				if(sayi1%2==0) {
					System.out.println(sayi1+" sayısı çifttir.");
				}
				sayi1++;
			}
		}else {
			while(sayi2<=sayi1) {
				if(sayi2%2==0) {
					System.out.println(sayi2+" sayısı çifttir.");
				}
				sayi2++;
			}
		}
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayıyı giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int sayi2 = input.nextInt();
		
		int toplamCıft = 0;
		int toplamTek = 0;
		
		if(sayi1<sayi2) {
			while(sayi1<=sayi2) {
				if(sayi1%2==0) {
					toplamCıft += sayi1;
					sayi1++;
				}else {
					toplamTek += sayi1;
					sayi1++;
				}
			}System.out.println("çiftlerin toplamı: "+ toplamCıft);
			System.out.println("teklerin toplamı: "+ toplamTek);
		}else {
			while(sayi2<=sayi1) {
				if(sayi2%2==0) {
					toplamCıft += sayi2;
					sayi2++;
				}else {
					toplamTek += sayi2;
					sayi2++;
				}
			}System.out.println("çiftlerin toplamı: "+ toplamCıft);
			System.out.println("teklerin toplamı: "+ toplamTek);
			
		}
		*/
		
		/*
		
		Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();

        int basamakSayisi = 0;
        int sayi1 = sayi;

        while (sayi1 != 0) {
            sayi1 = sayi1 / 10;
            basamakSayisi++;
        }
        System.out.println(basamakSayisi);

        int toplam = 0;
        int sayi2 = sayi;

        while (sayi2 != 0) {
            int basamakDegeri = sayi2 % 10;
            toplam += Math.pow(basamakDegeri, basamakSayisi);
            sayi2 /= 10;
        }

        if (sayi == toplam) {
            System.out.println(sayi + " Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " Armstrong sayısı değildir.");
        }
		*/
		
		
		        
		   
	}
}