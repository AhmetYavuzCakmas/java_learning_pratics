import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class ArrowKeys {
	
	public ArrowKeys(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setFocusable(true);
		
		JPanel panel = new JPanel();
		JLabel up = new JLabel();
		JLabel down = new JLabel();
		JLabel left = new JLabel();
		JLabel right = new JLabel();
		
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);
		
		up.setText("up: 0");
		down.setText("down: 0");
		right.setText("right: 0");
		left.setText("left: 0");
		
		frame.add(panel);
		
		frame.addKeyListener(new KeyListener() {
			 
			int upCount = 0;
			int downCount = 0;
			int rightCount = 0;
			int leftCount = 0;
		
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
			

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				    case KeyEvent.VK_UP:
				    	up.setText("up: "+ upCount++);
				    	break;
				    case KeyEvent.VK_DOWN:
			    		up.setText("down: "+ downCount++);
			    		break;
				    case KeyEvent.VK_RIGHT:
			    		up.setText("right: "+ rightCount++);
			    		break;
				    case KeyEvent.VK_LEFT:
			    		up.setText("left: "+ leftCount++);
			    		break;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	
		
		
		
		
	}

	public static void main(String[] args) {
	
		new ArrowKeys();
		
		
	}

}
