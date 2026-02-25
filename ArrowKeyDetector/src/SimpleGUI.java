import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGUI implements ActionListener {
	
	int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public SimpleGUI() {
		
		/*JFrame*/ frame = new JFrame();
		JButton button = new JButton("tıkla buraya");
		/*JPanel*/ panel = new JPanel();
		/*JLabel*/label = new JLabel("numara tıkla : 0");
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(this);
		
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("benim GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
    public static void main(String[] args) {
    	/*
        // JFrame oluşturma
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // JLabel oluşturma
        JLabel label = new JLabel("Hello, World!");
        frame.getContentPane().add(label);

        // JFrame görünür hale getirme
        frame.setVisible(true);
*/
    	
    	new SimpleGUI();
    
    
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		count ++;
		label.setText("sayı tıkla: "+count);
	}
}

