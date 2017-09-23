package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import main.Main;
import main.PathFinding;

public class MapEditor extends JLayeredPane implements MouseListener, ActionListener {
	private static final long serialVersionUID = 1L;

	private final int width = 740, height = 740;
	
	private JFrame window;
	private JFrame accWindow;
	private JPanel accPanel;
	
	private ImageIcon iconWall, iconFloor, iconPlayer, end;
	
	JButton confirm;
	
	int endC = 0;
	int pC = 0;
	
	private JLabel[][] tiles2 = new JLabel[20][20];
	private JLabel[] tiles = new JLabel[400];
	private int[] til = new int[400];
	
	public MapEditor() {
		super();
		window = new JFrame("Map Editor");
		accWindow = new JFrame("Map Editor");
		accPanel = new JPanel();
		accPanel.setLayout(null);
		accWindow.add(accPanel);
		this.setLayout(new GridLayout(20, 20));
		window.add(this);
		
		iconWall = new ImageIcon(getScaledImage(new ImageIcon("res/_wall.png").getImage(), 32, 32));
		iconFloor = new ImageIcon(getScaledImage(new ImageIcon("res/_floor.png").getImage(), 32, 32));
		iconPlayer = new ImageIcon(getScaledImage(new ImageIcon("res/player.png").getImage(), 32, 32));
		end = new ImageIcon(getScaledImage(new ImageIcon("res/end.png").getImage(), 32, 32));
		
		window.setPreferredSize(new Dimension(width, height));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
		accWindow.setPreferredSize(new Dimension(420, 120));
		accWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		accWindow.setResizable(false);
		accWindow.pack();
		accWindow.setLocation(window.getX() + 700, window.getY() + 200);
		
		confirm = new JButton("Confirm map");
		confirm.setBounds(15, 15, 150, 50);
		confirm.addActionListener(this);
		accPanel.add(confirm);
		
		JButton cancel = new JButton("Cancel map");
		cancel.setBounds(245, 15, 150, 50);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == cancel) System.exit(0);
			}
		});
		accPanel.add(cancel);
		
		JLabel label = new JLabel("Press confirm if you have finished the map and you want to load it.");
		label.setBounds(20, 70, 500, 15);
		accPanel.add(label);
		
		genTiles();
	}
	
	private void genTiles() {
		for (int i = 0; i < tiles.length; i++) {
			tiles[i] = new JLabel();
			tiles[i].setOpaque(true);
			tiles[i].addMouseListener(this);
			tiles[i].setIcon(iconFloor);
			tiles[i].setBorder(BorderFactory.createLineBorder(Color.black));
			
		}
		
		for (int i = 0; i< tiles.length; i++) {
			add(tiles[i], 0);
		}
		
		window.setVisible(true);
		accWindow.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		JLabel clickedPanel = (JLabel) e.getSource();
		
		if (e.getButton() == MouseEvent.BUTTON1) {
			if (clickedPanel.getIcon() == iconWall) {
				clickedPanel.setIcon(iconFloor);
			}else if (clickedPanel.getIcon() == iconFloor) {
				clickedPanel.setIcon(iconWall);
			}else if (clickedPanel.getIcon() == iconPlayer) {
				pC--;
				System.out.println(pC);
				System.out.println(endC);
				clickedPanel.setOpaque(false);
				clickedPanel.setIcon(iconFloor);
			}else if (clickedPanel.getIcon() == end) {
				clickedPanel.setOpaque(false);
				endC--;
				System.out.println(pC);
				System.out.println(endC);
				clickedPanel.setIcon(iconFloor);
			}
		}else if (e.getButton() == MouseEvent.BUTTON3 && pC == 0) {
			pC++;
			System.out.println(pC);
			System.out.println(endC);
			clickedPanel.setBackground(Color.GRAY);
			clickedPanel.setOpaque(true);
			clickedPanel.setIcon(iconPlayer);
		}else if (e.getButton() == MouseEvent.BUTTON3 && endC == 0) {
			if (clickedPanel.getIcon().equals(iconPlayer)) {
				endC++;
				pC--;
				System.out.println(pC);
				System.out.println(endC);
				
				clickedPanel.setIcon(end);
			}else {
				endC++;
				System.out.println(pC);
				System.out.println(endC);
				
				clickedPanel.setIcon(end);
			}
		}
	}
	
	public void saveMap() {
		int count = 0;
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (count == tiles.length) break;
				tiles2[i][j] = tiles[count];
				count++;
			}
		}
		
		for (int i = 0; i < tiles.length; i++) {
			if (tiles[i].getIcon() == iconFloor) {
				til[i] = 0;
			}else if (tiles[i].getIcon() == iconWall) {
				til[i] = 1;
			}else if(tiles[i].getIcon() == iconPlayer) {
				til[i] = 2;
			}else if (tiles[i].getIcon() == end) {
				til[i] = 3;
			}
		}
		
		for(int i = 0; i < til.length / 2; i++)
		{
		    int temp = til[i];
		    til[i] = til[til.length - i - 1];
		    til[til.length - i - 1] = temp;
		}
		
		for (int i = 0; i < til.length; i++) {
			switch (til[i]) {
			case 0:
				tiles[i].setIcon(iconFloor);
				break;
			case 1:
				tiles[i].setIcon(iconWall);
				break;
			case 2:
				tiles[i].setIcon(iconPlayer);
				break;
			case 3:
				tiles[i].setIcon(end);
				break;
			}
		}
		
		for (int i = 0; i < tiles2.length; i++) {
			for (int j = 0; j < tiles2.length; j++) {
				if (tiles2[i][j].getIcon() == iconFloor) {
					Main.map_matrix[i][j] = 0;
				}else if (tiles2[i][j].getIcon() == iconWall) {
					Main.map_matrix[i][j] = 1;
				}else if (tiles2[i][j].getIcon() == iconPlayer) {
					Main.map_matrix[i][j] = 2;
				}else if (tiles2[i][j].getIcon() == end) {
					Main.map_matrix[i][j] = 3;
				}
			}
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == confirm) {
			saveMap();
			new PathFinding().generateWindow();
			window.dispose();
			accWindow.dispose();
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
	
public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
	
}
