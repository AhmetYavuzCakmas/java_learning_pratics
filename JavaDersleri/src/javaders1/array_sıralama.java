package javaders1;

public class array_sıralama {

	public static void main(String[] args) {
		
		int[] sayilar = {5, 3, 8, 1, 2, 7}; 
		int[] sirali_sayilar = array_sirala(sayilar);
		
		System.out.println("Sıralanmış Dizi: " + java.util.Arrays.toString(sirali_sayilar)); 
	} 
	
	public static int[] array_sirala(int[] array) { 
		int n = array.length; 
		for (int i = 0; i < n - 1; i++) { 
			for (int j = 0; j < n - 1 - i; j++) { 
				if (array[j] > array[j + 1]) {
					// Elemanları yer değiştir 
					int temp = array[j]; 
					array[j] = array[j + 1]; 
					array[j + 1] = temp; } 
				} 
			} return array;		
		}
	}

