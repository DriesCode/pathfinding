package tile;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tile {

	private int x, y;
	private JLabel label;
	private int ID;
	private int[] coords = new int[2];
	
	public Tile(int x, int y, int ID) {
		this.x = x;
		this.y = y;
		this.ID = ID;
		coords[0] = (x/2);
		coords[1] = (y/2);
		label = new JLabel();
		label.setBounds(x, y, 32, 32);
		
		ImageIcon iconWall, iconFloor, iconPlayer, iconEnd;
		
		iconWall = new ImageIcon(getScaledImage(new ImageIcon("res/wall.png").getImage(), 32, 32));
		iconFloor = new ImageIcon(getScaledImage(new ImageIcon("res/floor.png").getImage(), 32, 32));
		iconPlayer = new ImageIcon(getScaledImage(new ImageIcon("res/player.png").getImage(), 32, 32));
		iconEnd = new ImageIcon(getScaledImage(new ImageIcon("res/end.png").getImage(), 32, 32));
		
		switch (ID) {
		case 0:
			label.setIcon(iconFloor);
			break;
		case 1:
			label.setIcon(iconWall);
			break;
		case 2:
			label.setIcon(iconPlayer);
			break;
		case 3:
			label.setIcon(iconEnd);
			break;
		}
	}
	
	private Image getScaledImage(Image srcImg, int w, int h){
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();

	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	}
	
	public int getCoordY() {
		return coords[1];
	}
	
	public int getCoordX() {
		return coords[0];
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
