package dosyalama;

import java.io.FileWriter;
import java.io.IOException;

public class dosya1 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = null; 
		
		try {
			writer = new FileWriter("dosya.txt");
			writer.write("ahmet yavuz \n");
			writer.write("ahmet yavuz çakmas \n");
		}catch(IOException ex) {
			System.out.println("dosyalama hatası");
		}finally {
			if(writer != null) {
				try {
					writer.close();	
					}catch(IOException ex){
						System.out.println("kapatılırken hata olulştu");
						
					}
			}
		}

	}

}
