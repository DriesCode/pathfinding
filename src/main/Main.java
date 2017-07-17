package main;

import java.util.ArrayList;

import gui.MapEditor;
import tile.Tile;

public class Main {
	
	// 0 = FLOOR
	// 1 = WALL
	
	public static ArrayList<Tile> availableTiles = new ArrayList<Tile>();
	
	public static final int[][] map_matrix = new int[][] {
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		
	};
	
	public static Tile[][] tile_matrix = new Tile[10][10];
	
	public static void main(String[] args) {
		//new PathFinding().generateWindow();
		//new PreviewWindow();
		new MapEditor();
	}

}
