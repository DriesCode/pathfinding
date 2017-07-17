package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapEditor extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;

	private final int height = 665, width = 647;
	
	private JFrame window;
	
	private ImageIcon iconWall, iconFloor;
	
	Graphics g;
	
	//private JLabel[][] tiles = new JLabel[10][10];
	private JLabel[] tiles = new JLabel[100];
	
	public MapEditor() {
		super();
		window = new JFrame("Map Editor");
		this.setLayout(new GridLayout(10, 10));
		window.add(this);
		
		iconWall = new ImageIcon("_wall.png");
		iconFloor = new ImageIcon("_floor.png");
		
		window.setPreferredSize(new Dimension(width, height));
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
		genTiles();
	}
	
	private void genTiles() {
		for (int i = 0; i < tiles.length; i++) {
			tiles[i] = new JLabel();
			tiles[i].setOpaque(true);
			tiles[i].addMouseListener(this);
			tiles[i].setIcon(iconFloor);
		}
		
		for (int i = 0; i< tiles.length; i++) {
			add(tiles[i]);
		}
		
		window.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		JLabel clickedPanel = (JLabel) e.getSource();
		
		if (clickedPanel.getIcon() == iconWall) {
			clickedPanel.setIcon(iconFloor);
		}else if (clickedPanel.getIcon() == iconFloor) {
			clickedPanel.setIcon(iconWall);
		}
		
		/*for (int i = 0; i < tiles.length; i++) {
			if (e.getX()>tiles[i].getX()&&e.getX()<(tiles[i].getX()+tiles[i].getWidth())) {
				if(e.getY()>tiles[i].getY()&&e.getY()<(tiles[i].getY()+tiles[i].getHeight())){
					if (tiles[i].getIcon() == iconWall) {
						tiles[i].setIcon(iconFloor);
					}else if (tiles[i].getIcon() == iconFloor) {
						tiles[i].setIcon(iconWall);
					}
				}
			}
		}**/
	}
	
	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
	
/*	@Override
	public void paint(Graphics g) {
		g.drawLine(0, 63, 640, 63);
		g.drawLine(0, 127, 640, 127);
		g.drawLine(0, 191, 640, 191);
		g.drawLine(0, 255, 640, 255);
		g.drawLine(0, 319, 640, 319);
		g.drawLine(0, 383, 640, 383);
		g.drawLine(0, 447, 640, 447);
		g.drawLine(0, 511, 640, 511);
		g.drawLine(0, 575, 640, 575);
		
		g.drawLine(63, 0, 63, 665);
		g.drawLine(127, 0, 127, 665);
		g.drawLine(191, 0, 191, 665);
		g.drawLine(255, 0, 255, 665);
		g.drawLine(319, 0, 319, 665);
		g.drawLine(383, 0, 383, 665);
		g.drawLine(447, 0, 447, 665);
		g.drawLine(511, 0, 511, 665);
		g.drawLine(575, 0, 575, 665);
	}*/

}
