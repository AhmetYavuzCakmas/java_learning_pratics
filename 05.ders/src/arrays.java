import java.security.PublicKey;
import java.util.Scanner;
import java.util.Arrays;
public class arrays {
	
	public static void array_sort(int [] array) {
		Arrays.sort(array);
		arrayi_bastir(array);
		
	}
	
	
	public static int[] arrayi_doldur(int sayi) {
		Scanner input = new Scanner(System.in);
		int[] cikti = new int[sayi];
		
		for(int i = 0;i <sayi;i++) {
			cikti[i] = input.nextInt();
		}
		return cikti;
		
	}
	
	
	
	public static void arrayi_bastir(int[] array) {
		for(int i = 0;i<array.length;i++) {
			System.out.println("element "+(i+1)+": "+ array[i]);
		}
	}
	
	
	
	public static double ortalamaArray(int[] array) {
		int toplam = 0;
		for(int i = 0; i < array.length;i++) {
			toplam += array[i];
		}
		return ((double)toplam/array.length);
	}
	
	
	
	public static void arrayi_bastirma(int[] array) {
		
		for(int i = 0; i< array.length; i++) {
			System.out.println("element "+(i+1) + ": "+array[i]);
		}
	}

	
	
	public static void main(String[] args) {
		/*
		int[] a = new int[5];
		System.out.println("sayı giriniz: ");
		Scanner input = new Scanner(System.in);
		for(int i = 0;i <5;i++) {
			a[i] = input.nextInt();
			
		}System.out.println("----------------");
		
		for(int i =0;i <5;i++) {
			System.out.println(a[i]);
		}
		*/
		
		/*
		int[] b = {52,48,78,65,89,626};
		System.out.println("array uzunluğu: "+b.length);
		*/
		
		
		/*
		int[] b = {52,48,78,65,89,626};
		arrayi_bastirma(b);
		*/
		
		
		/*
		int[] b = {52,48,78,65,87,60};
		arrayi_bastirma(b);
		
		System.out.println("ortalama: "+ortalamaArray(b));
		*/
		
		/*
		int[] a = arrayi_doldur(7);
		arrayi_bastir(a);
		*/
		
		/*
		int[] a = arrayi_doldur(6);
		array_sort(a);
		*/
		
	
		
		
		
		
	}
	
	
}
