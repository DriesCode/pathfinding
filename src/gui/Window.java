package gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {

	private final int side = 640;
	
	public static JFrame window;
	public static JPanel panel;
	
	public Window() {
		window = new JFrame("Pathfinding");
		panel = new JPanel();
		panel.setLayout(new GridLayout(10, 10));
		window.add(panel);
		
		window.setPreferredSize(new Dimension(side, side));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
	}
	
}
