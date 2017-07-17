package gui;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import main.Main;
import main.PathFinding;
import tile.TileRenderer;

public class PreviewWindow {
	
	private JFrame window;
	private JPanel panel;
	
	private JLabel[][] jMatrix = new JLabel[10][10];
	private int[][] iMatrix = Main.map_matrix;
	
	public PreviewWindow() {
		window = new JFrame("Preview Window");
		panel = new JPanel();
		panel.setLayout(null);
		window.add(panel);
		
		window.setPreferredSize(new Dimension(647, 665));
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		
		createMatrix();
		showMatrix();
		confirm();
	}
	
	private void createMatrix() {
		for (int i = 0; i < iMatrix.length; i++) {
			for (int j = 0; j < iMatrix.length; j++) {
				switch (iMatrix[i][j]) {
				case 0:
					JLabel l = new JLabel();
					l.setBounds((i*64), (j*64), 64, 64);
					l.setIcon(new ImageIcon("_floor.png"));
					jMatrix[i][j] = l;
					break;
				case 1:
					JLabel l2 = new JLabel();
					l2.setBounds((i*64), (j*64), 64, 64);
					l2.setIcon(new ImageIcon("_wall.png"));
					jMatrix[i][j] = l2;
					break;
				default:
					System.out.println("ID no disponible.");
				}
			}
		}
	}
	
	private void showMatrix() {
		for (int i = 0; i < iMatrix.length; i++) {
			for (int j = 0; j < iMatrix.length; j++) {
				panel.add(jMatrix[i][j]);
			}
		}
			window.setVisible(true);
	}
	
	private void confirm() {
		int c = JOptionPane.showConfirmDialog(null, "Confirm map?");
		
		if (c == JOptionPane.OK_OPTION) {
			window.dispose();
			new PathFinding().generateWindow();
		}else if (c == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
	}

}
