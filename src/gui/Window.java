package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Window {

	private final int height = 665, width = 640;
	
	public static JFrame window;
	public static JLayeredPane map;
	
	public Window() {
		window = new JFrame("Pathfinding");
		map = new JLayeredPane();
		map.setLayout(null);
		window.add(map);
		
		window.setPreferredSize(new Dimension(width, height));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
	}
	
}
