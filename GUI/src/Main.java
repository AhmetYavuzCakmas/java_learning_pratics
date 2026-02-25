import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Frame Örneği");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		
		JLabel l1 = new JLabel();
		l1.setText("yazı alanı");
		l1.setBounds(0,86,150,50);

		
		JButton btn = new JButton();
		btn.setText("Gönder");
		btn.setBounds(0,0,85,85);
		
		JTextField t = new JTextField();
		t.setBounds(0,140,90,30);
		
		btn.addActionListener(new ActionListener() {
			int c = 1;
			public void actionPerformed(ActionEvent e) {
				System.out.println("butona tıklanıldı");
				l1.setText("butona tıklanıldı "+ c++ +" kez ");
			}
		});
		
		frame.add(t);
		frame.add(l1);
		frame.add(btn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
