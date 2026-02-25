package son_tekrar1;

import javax.swing.JOptionPane;

public class intro {

	public static void main(String[] args) {
		//GUI 
		String name = JOptionPane.showInputDialog("Adınızı giriniz: ");
		JOptionPane.showMessageDialog(null,"Sisteme hoşgeldiniz "+ name);
	
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("1. sayıyı giriniz: "));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("2. sayıyı giriniz: "));
		int total = number1+number2;
		JOptionPane.showMessageDialog(null,"Girilen değerlerin toplamı: "+total);
	
	
	
	
	
	
	}

}
