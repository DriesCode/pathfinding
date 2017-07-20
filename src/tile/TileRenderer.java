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
		for (int j = 0; j < Main.map_matrix.length; j++) {
			for (int i = 0;i < Main.map_matrix.length; i++) {
				//System.out.println("[" + i + " " + j + "] = " +Main.map_matrix[i][j]);
				Main.tile_matrix[j][i] = new Tile((j*32), (i*32), Main.map_matrix[i][j]);
				
				if (Main.map_matrix[j][i] == 0) {
					Main.availableTiles.add(Main.tile_matrix[j][i]);
				}
			}
		}
		
//		for (int i = 0; i < Main.map_matrix.length; i++) {
//			for (int j = 0;j < Main.map_matrix.length; j++) {
//				//System.out.println("[" + i + " " + j + "] = " +Main.map_matrix[i][j]);
//				Main.tile_matrix[i][j] = new Tile((i*64), (j*64), Main.map_matrix[i][j]);
//			}
//		}
	}
	
	public void seeMatrix() {
		for (int j = 0; j < Main.map_matrix.length; j++) {
			for (int i = 0; i < Main.map_matrix.length; i++) {
				System.out.println("[" + j + " " + i +"] = x: " + Main.tile_matrix[j][i].getX() + " y: " + Main.tile_matrix[j][i].getY() + " ID: " + Main.tile_matrix[j][i].getID() + " NODE: " + Main.tile_matrix[j][i].getCoordX() + " " + Main.tile_matrix[j][i].getCoordY());
				Window.map.add(Main.tile_matrix[j][i].getJLabel(), 0);
			}
		}
	}
	
}
