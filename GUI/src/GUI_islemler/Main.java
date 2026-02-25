package GUI_islemler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main  {

	public static void main(String[] args) throws Exception{
		
		JFrame f = new JFrame("TextField Örneği");
		f.setSize(600,600);
		f.setLocationRelativeTo(null);
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton btn;
		
		l1 = new JLabel("İlk Sayı");
		l1.setBounds(50,10,100,30);
		
		t1 = new JTextField();
		t1.setBounds(50,40,200, 30);
		
		l2 = new JLabel("İkinci Sayı");
		l2.setBounds(50,80,100,30);
		
		t2 = new JTextField();
		t2.setBounds(50,120,200, 30);
		
		JButton btn1 = new JButton();
		btn1.setText("Topla");
		btn1.setBounds(50,180,90,35);
		
		l3 = new JLabel("Sonuç: ");
		l3.setBounds(50,240,160,30);
		
		
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
				int sayi1 = Integer.parseInt(t1.getText());
	            int sayi2 = Integer.parseInt(t2.getText());
	            int sonuc = sayi1 + sayi2;
				System.out.println("butona tıklanıldı");
				l3.setText(sayi1+" + "+sayi2+" = "+sonuc);
				}catch(NumberFormatException ex) {
					l3.setText("Lütfen geçerli sayı giriniz");
				}
			}
		});
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(l3);
		f.add(t2);
		f.add(btn1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
