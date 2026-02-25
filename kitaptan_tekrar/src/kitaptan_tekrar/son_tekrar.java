package kitaptan_tekrar;

public class son_tekrar {

	public static void main(String[] args) {

		sum(8, 10);
		nPrint("yavuz", 5);
		int max = 12;
		 max(1, 2, max);
		 System.out.println(max);
		 
		 int i = 1;
		 while (i <= 6) {
		  method1(i, 2);
		  i++;
		 }
		 
		 System.out.println(gcd(75, 150));
		 
		 char ch = (char)('a' + Math.random() * ('z' - 'a' + 1));
		 System.out.println(ch);


	}

	
	
	
	
	
	
	
	
	
	
	public static void sum(int i1,int i2) {
		int result = 0;
		for(int i = i1;i<=i2;i++) {
			result +=i;
			
		}
		System.out.println(result);
	}
	
	public static void nPrint(String messageString , int i) {
		for(int j =0;j<i;j++) {
			System.out.println(messageString);
		}
	}
	
	public static void max(
			int value1, int value2, int max) {
			if (value1 > value2)
			 max = value1;
			else
			 max = value2;
			 }
	
	public static void method1(
			int i, int num) {
			for (int j = 1; j <= i; j++) {
			 System.out.print(num + " ");
			 num *= 2;
			 }
			 System.out.println();
	}
	
	public static int gcd(int n1,int n2) {
		int gcd = 1;
		int k =2;
		
		while(k<=n1 && k<= n2) {
			if(n1%k == 0 && n2%k==0) 
				gcd = k;
			
			
			k++;
			
		}
		return gcd;
	}

}
