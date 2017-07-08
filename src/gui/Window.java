package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

	private final int side = 640;
	
	private JFrame window;
	private JPanel panel;
	
	public Window() {
		window = new JFrame("Pathfinding");
		panel = new JPanel();
		panel.setLayout(null);
		window.add(panel);
		
		window.setPreferredSize(new Dimension(side, side));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
	
}
