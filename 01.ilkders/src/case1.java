import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
class case1 {

	public static void main(String[] args) {
/*		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen 1 - 7 arasında sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		switch(sayi)
		{
		case 1 :
			System.out.print("pazartesi");
			break;
		case 2 :
			System.out.print("salı");
			break;
		case 3 :
			System.out.print("çarşamba");
			break;
		case 4 :
			System.out.print("perşembe");
			break;
		case 5 :
			System.out.print("cuma");
			break;
		case 6 :
			System.out.print("cumartesi");
			break;
		case 7 :
			System.out.print("pazar");
			break;
			
			default:
				System.out.println("laa olum 1 ile 7 arası dedik daaa"+ sayi + " nedir laaa");
		}
		
		
		
*/		
		/*
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("g");
		list.add("3g");
		list.add("4m");
		
		list.add(1,"ebru"); //ekleme yapar kaçıncı indek ise
		list.set(0, "fgg"); //isim değişikliği
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		*/
		
		
		/*
		Set<String> fruits = new HashSet<String>();
		fruits.add("1. ass");
		fruits.add("2. frf");
		fruits.add("3. rfrg");
		fruits.add("4. grgv");
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		*/
		
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("birinci sayıyı griniz: ");
		int sayi1 = input.nextInt();
		System.out.print("ikinci sayıyı griniz: ");
		int sayi2 = input.nextInt();
		
		int sonuc;
		
		try {
			sonuc = sayi1/sayi2;
		
		}catch(ArithmeticException e){
			System.out.println("sıfır harici bir sayıyı girniz: " );
			sayi2 = input.nextInt();
		}
		sonuc = sayi1/sayi2;

		System.out.println(sonuc);
		*/
		
		int[] sayilar = {2,5,8,7,9};
		
		try {
			int bolum = 300/0;
			System.out.println(bolum);
			int eleman = sayilar[7];
			System.out.println(eleman);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("HATA 1 : " +e);
		}catch(ArithmeticException e) {
			System.out.println("HATA 2 : "+e);
		}
		
		System.out.println("kod çalışyıor");
		
		
		
		
		
		
		
		
	}

}
