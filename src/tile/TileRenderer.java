package tile;

import java.awt.Color;

import gui.Window;
import main.Main;

public class TileRenderer {

	public void repaint() {
		for (int i = 0; i < Main.map_matrix.length; i++) {
			for (int j = 0; j < Main.map_matrix.length; j++) {
				Main.tile_matrix[i][j].getJLabel().setBackground(Color.BLACK);;
			}
		}
		
		seeMatrix();
	}
	
	public void create_matrix() {
		for (int i = 0; i < Main.map_matrix.length; i++) {
			for (int j = 0; j < Main.map_matrix.length; j++) {
				//System.out.println("[" + i + " " + j + "] = " +Main.map_matrix[i][j]);
				Main.tile_matrix[i][j] = new Tile((i*64), (j*64), Main.map_matrix[i][j]);
			}
		}
	}
	
	public void seeMatrix() {
		for (int i = 0; i < Main.map_matrix.length; i++) {
			for (int j = 0; j < Main.map_matrix.length; j++) {
				System.out.println("[" + i + " " + j +"] = x: " + Main.tile_matrix[i][j].getX() + " y: " + Main.tile_matrix[i][j].getY() + " ID: " + Main.tile_matrix[i][j].getID() + " NODE: " + Main.tile_matrix[i][j].getCoordX() + " " + Main.tile_matrix[i][j].getCoordY());
				Window.panel.add(Main.tile_matrix[i][j].getJLabel());
			}
		}
	}
	
}
