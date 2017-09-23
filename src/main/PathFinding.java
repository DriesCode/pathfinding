package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import gui.MapEditor;
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
		//new TileRenderer().repaint();
	}
	
	public void generateWindow() {
		new Window();
		new TileRenderer().create_matrix();
		new TileRenderer().seeMatrix();
		
		Window.window.setVisible(true);
	}
	
	public void start() {
		new MapEditor();
	}
	
}
