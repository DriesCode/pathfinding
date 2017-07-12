package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import gui.Window;
import tile.TileRenderer;

public class PathFinding {

	ActionListener task = (ActionEvent e) -> {
		gameStep();
	};
	
	private Timer timer = new Timer(10, task);
	
	public void run() {
		generateWindow();
		timer.start();
	}
	
	public void gameStep() {
		new TileRenderer().repaint();
	}
	
	public void generateWindow() {
		new Window();
		new TileRenderer().create_matrix();
		new TileRenderer().seeMatrix();
		
//		JLabel l = new JLabel();
//		l.setBounds(Main.tile_matrix[2][3].getCoordX(), Main.tile_matrix[2][3].getCoordX(), 16, 16);
//		l.setIcon(new ImageIcon("wall.png"));
//		Window.panel.add(l);
		Window.window.setVisible(true);
	}
	
}
