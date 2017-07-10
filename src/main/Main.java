package main;

import gui.Window;
import tile.Tile;
import tile.TileRenderer;

public class Main {
	
	// 0 = FLOOR
	// 1 = WALL
	
	public static final int[][] map_matrix = new int[][] {
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
		{0, 0, 1, 1, 1, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
		{0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	
	public static Tile[][] tile_matrix = new Tile[10][10];
	
	public static void main(String[] args) {
		new Window();
		new TileRenderer().create_matrix();
		new TileRenderer().seeMatrix();
		Window.window.setVisible(true);
		
	}

}
