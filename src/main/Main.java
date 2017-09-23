package main;

import java.util.ArrayList;

import gui.MapEditor;
import tile.Tile;

public class Main {
	
	// 0 = FLOOR
	// 1 = WALL
	
	public static ArrayList<Tile> availableTiles = new ArrayList<Tile>();
	
	public static final int[][] map_matrix = new int[20][20];
	
	public static Tile[][] tile_matrix = new Tile[20][20];
	
	public static void main(String[] args) {
		new PathFinding().start();
		//new PathFinding().generateWindow();
	}

}
