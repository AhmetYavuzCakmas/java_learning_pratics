package alexlee2;

import java.awt.datatransfer.SystemFlavorMap;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class alexlee2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("cümlenizi giriniz: ");
		String cumle = input.nextLine();
		
		System.out.println("girilen cümle: "+cumle);
		String  r = reverse(cumle);
		System.out.println("ters çevrilen cümle: "+r);
	}

	
	public static String reverse(String s) {
		char[] letters = new char[s.length()];
		
		int letterIndex = 0;
		for (int i = s.length()-1;i>=0;i--) {
			letters[letterIndex] = s.charAt(i);
			letterIndex++;
		}
		String reverse ="";
		for(int i = 0;i<s.length();i++){
			reverse = reverse+letters[i];
		}
		
		return reverse;
	
		*/
		/*
		System.out.println("sayı giriniz: ");
		int i = input.nextInt();
		
		switch(i) {
			case 0:
				System.out.println("0");
				break;
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			default:
				System.out.println("0,1,2,3 ve 4 sayılarından birini gir");
		}
		*/
	/*
		String aString  = null;
		System.out.println(aString.length());
	*/
		/*
	System.out.println("uğurlu saynızı girinşz: ");
		try {
		int a = input.nextInt();
		System.out.println(a);
	 }catch(Exception e){
		System.out.println("sayı gir olum sayı dışında bişey girme");
	    }
		*/
		/*
		int a = 10;
		int b = 3;
		int c = 88;
		
		HashMap<String,Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c",88);
		
		System.out.println(happy.get("c"));
		System.out.println(happy);
		*/
		/*System.out.println(a);
		*/
		/*
		String s ="age: 47";
		s = s.replaceAll("\\D+", "");//içeriğin sayı kısmını string olarak alır
		int n =Integer.parseInt(s);
		
		
		System.out.println(n+15);
 		*/
		/*
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("başlaa.....");
		long startTime = System.currentTimeMillis();
		
		Scanner s = new Scanner(System.in);
		String a = s.next();
		
		long stopTime = System.currentTimeMillis();
		
		long fark = stopTime - startTime;
		System.out.println(fark+" ms de "+a+" yazdınız.");
		*/
		 /*
		 System.out.println("3");
		 TimeUnit.SECONDS.sleep(1);
		 System.out.println("2");
		 TimeUnit.SECONDS.sleep(1);
		 System.out.println("1");
		 TimeUnit.SECONDS.sleep(1);
		 System.out.println("BAŞLA");
		 TimeUnit.SECONDS.sleep(1);
		 
		 Random rand = new Random();
		 for(int i = 0;i<10;i++) {
			 System.out.print(words[rand.nextInt(9)]+" ");
		 }
		System.out.println();
		
		double start =LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typeWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end -start;
		double seconds = elapsedTime/1000000000.0;
		int numChars = typeWords.length();
		
		int wpm = (int) ((((double) numChars/5) /seconds)*60);
		
		System.out.println("senin dakikada kelime yazabilem hızın: "+wpm);
		*/
		/*
		System.out.println(asalBul(2,100));
		*/
		/*
		System.out.println("kelime giriniz: ");
		String kelime = input.nextLine();
		
		String reverse ="";
		for(int i = kelime.length()-1;i>=0;i--) {
			reverse +=kelime.charAt(i);
		}
		if (reverse.equals(kelime)) {
			System.out.println(kelime +" bir palindrom kelimedir");
			
			
		}else {
			System.out.println(kelime+" bir palindrom kelime değildir");
			System.out.println(kelime +" = "+reverse);
		}
 		*/
		/*
		  // Bir ArrayList oluştur ve bazı elemanlar ekle
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Elma");
        liste.add("Muz");
        liste.add("Portakal");

        // Iterator oluştur
        Iterator<String> iterator = liste.iterator();

        // Iterator kullanarak elemanları gez
        while (iterator.hasNext()) {
            String meyve = iterator.next();
            System.out.println(meyve);

            // Eğer eleman "Muz" ise, onu listeden çıkar
            if (meyve.equals("Muz")) {
                iterator.remove();
            }
        }

        // Güncellenmiş listeyi yazdır
        System.out.println("Güncellenmiş liste: " + liste);
	
		*/
	/*	
	ArrayList<Integer> nums = new ArrayList<Integer>()	;
	nums.add(48);	
	nums.add(78);	
	nums.add(85);	
	nums.add(28);	
		
	Iterator<Integer> it = nums.iterator();
	
	while(it.hasNext()) {
		int i = it.next();
		if(i<50) {
			it.remove();
		}
		
	}
	System.out.println(nums);
	*/
	/*	
	sayHi(7);	
	*/
		System.out.println(faktoriyel(5));
		
		
	}
	public static int faktoriyel(int a) {
		if(a == 1) {
			return 1;
		}else {
			return a * faktoriyel(a-1);
		}
	}
	
	
	
	
	/*
	public static void sayHi(int n ) {
		if(n==0) {
			System.out.println("sayı girilmedi");
		}else {
			System.out.println(n+ " hi");
			n--;
			sayHi(n);

		}
	}*/
	/*
	static int a = 7;
	*/
	/*
	static String[] words = {"ali","merhaba","helikopter","varlık","para","riale","sözler","klavye","mouse"};
	*/
	/*
	public static ArrayList<Integer> asalBul(int start,int end){
		ArrayList<Integer> asallar = new ArrayList<Integer>();
		
		for(int n = start;n < end ; n++) {
			boolean asal = true;
			
			int i = 2;
			while(i <=n2) {
				if(n%i==0) {
					asal =false;
					break;
				}
				i++;
			}
			if(prime) {
				asallar.
			}
		}
 	}
	*/
}
