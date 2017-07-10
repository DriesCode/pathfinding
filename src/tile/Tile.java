package tile;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tile {

	private int x, y;
	private JLabel label;
	private int ID;
	
	public Tile(int x, int y, int ID) {
		this.x = x;
		this.y = y;
		this.ID = ID;
		
		switch (ID) {
		case 0:
			label = new JLabel();
			label.setBounds(x, y, 64, 64);
			label.setIcon(new ImageIcon("floor.png"));
			break;
		case 1:
			label = new JLabel();
			label.setBounds(x, y, 64, 64);
			label.setIcon(new ImageIcon("wall.png"));
			break;
		}
	}
	
	public int getID() {
		return ID;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setJLabel(JLabel label) {
		this.label = label;
	}
	
	public JLabel getJLabel() {
		return label;
	}
	
}
