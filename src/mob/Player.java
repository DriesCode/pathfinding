package mob;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.Window;

public class Player {
	
	private int x, y,xVel, yVel;
	private JLabel label;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		
		label = new JLabel();
		label.setBounds(x, y, 64, 64);
		label.setIcon(new ImageIcon("player.png"));
		Window.map.add(label, 1);
	}

}
