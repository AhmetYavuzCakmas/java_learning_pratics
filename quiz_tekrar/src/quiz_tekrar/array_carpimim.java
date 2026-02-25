package quiz_tekrar;

import java.util.Random;

public class array_carpimim {

	public static void main(String[] args) {
		
		int[][] dizi1 = new int[3][3];
		int[][] dizi2 = new int[3][3];
		int[][] sonuc = new int[3][3];
		 
		Random rastgele = new Random();
		
		System.out.println("Dizi1 : ");
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				dizi1[i][j] = rastgele.nextInt(101);
				System.out.print(dizi1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Dizi2 : ");
		for(int k =0;k<3;k++) {
			for(int l = 0;l<3;l++) {
				dizi2[k][l] = rastgele.nextInt(101);
				System.out.print(dizi2[k][l]+" ");
			}
			System.out.println();
		}
		
		

		System.out.println("sonuç: ");
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				int sonuc1 = dizi1[i][j]*dizi2[i][j];
				sonuc[i][j] = sonuc1;
				System.out.print(sonuc[i][j]+" ");
			}
			System.out.println();
		}
	}

}
