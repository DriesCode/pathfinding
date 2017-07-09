package gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

	private final int side = 640;
	
	private JFrame window;
	private JPanel panel;
	
	// first row
	private JLabel tile00;
	private JLabel tile01;
	private JLabel tile02;
	private JLabel tile03;
	private JLabel tile04;
	private JLabel tile05;
	private JLabel tile06;
	private JLabel tile07;
	private JLabel tile08;
	private JLabel tile09;
	
	// second row
	private JLabel tile10;
	private JLabel tile11;
	private JLabel tile12;
	private JLabel tile13;
	private JLabel tile14;
	private JLabel tile15;
	private JLabel tile16;
	private JLabel tile17;
	private JLabel tile18;
	private JLabel tile19;
	
	// third row
	private JLabel tile20;
	private JLabel tile21;
	private JLabel tile22;
	private JLabel tile23;
	private JLabel tile24;
	private JLabel tile25;
	private JLabel tile26;
	private JLabel tile27;
	private JLabel tile28;
	private JLabel tile29;
	
	// fourth row
	private JLabel tile30;
	private JLabel tile31;
	private JLabel tile32;
	private JLabel tile33;
	private JLabel tile34;
	private JLabel tile35;
	private JLabel tile36;
	private JLabel tile37;
	private JLabel tile38;
	private JLabel tile39;
	
	// fifth row
	private JLabel tile40;
	private JLabel tile41;
	private JLabel tile42;
	private JLabel tile43;
	private JLabel tile44;
	private JLabel tile45;
	private JLabel tile46;
	private JLabel tile47;
	private JLabel tile48;
	private JLabel tile49;
	
	// sixth row
	private JLabel tile50;
	private JLabel tile51;
	private JLabel tile52;
	private JLabel tile53;
	private JLabel tile54;
	private JLabel tile55;
	private JLabel tile56;
	private JLabel tile57;
	private JLabel tile58;
	private JLabel tile59;
	
	// seventh row
	private JLabel tile60;
	private JLabel tile61;
	private JLabel tile62;
	private JLabel tile63;
	private JLabel tile64;
	private JLabel tile65;
	private JLabel tile66;
	private JLabel tile67;
	private JLabel tile68;
	private JLabel tile69;
	
	// eigth row
	private JLabel tile70;
	private JLabel tile71;
	private JLabel tile72;
	private JLabel tile73;
	private JLabel tile74;
	private JLabel tile75;
	private JLabel tile76;
	private JLabel tile77;
	private JLabel tile78;
	private JLabel tile79;
	
	// ninth row
	private JLabel tile80;
	private JLabel tile81;
	private JLabel tile82;
	private JLabel tile83;
	private JLabel tile84;
	private JLabel tile85;
	private JLabel tile86;
	private JLabel tile87;
	private JLabel tile88;
	private JLabel tile89;
	
	// tenth row
	private JLabel tile90;
	private JLabel tile91;
	private JLabel tile92;
	private JLabel tile93;
	private JLabel tile94;
	private JLabel tile95;
	private JLabel tile96;
	private JLabel tile97;
	private JLabel tile98;
	private JLabel tile99;
	
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
		window.setVisible(true);
		
		genComp();
	}
	
	private void genComp() {
		tile00 = new JLabel();
		tile00.setBounds(0, 0, 64, 64);
		panel.add(tile00);
		
		tile01 = new JLabel();
		tile01.setBounds(63, 0, 64, 64);
		panel.add(tile01);
		
		tile02 = new JLabel();
		tile02.setBounds(127, 0, 64, 64);
		panel.add(tile02);
		
		tile03 = new JLabel();
		tile03.setBounds(191, 0, 64, 64);
		panel.add(tile03);
		
		tile04 = new JLabel();
		tile04.setBounds(255, 0, 64, 64);
		panel.add(tile04);
		
		tile05 = new JLabel();
		tile05.setBounds(319, 0, 64, 64);
		panel.add(tile05);
		
		tile06 = new JLabel();
		tile06.setBounds(383, 0, 64, 64);
		panel.add(tile06);
		
		tile07 = new JLabel();
		tile07.setBounds(447, 0, 64, 64);
		panel.add(tile07);
		
		tile08 = new JLabel();
		tile08.setBounds(511, 0, 64, 64);
		panel.add(tile08);
		
		tile09 = new JLabel();
		tile09.setBounds(575, 0, 64, 64);
		panel.add(tile09);
		
		tile10 = new JLabel();
		tile10.setBounds(575, 0, 64, 64);
		panel.add(tile10);
		
		tile11 = new JLabel();
		tile11.setBounds(575, 0, 64, 64);
		panel.add(tile11);
		
		tile12 = new JLabel();
		tile12.setBounds(575, 0, 64, 64);
		panel.add(tile12);
		
		tile13 = new JLabel();
		tile13.setBounds(575, 0, 64, 64);
		panel.add(tile13);
		
		tile14 = new JLabel();
		tile14.setBounds(575, 0, 64, 64);
		panel.add(tile14);
		
		tile15 = new JLabel();
		tile15.setBounds(575, 0, 64, 64);
		panel.add(tile15);
		
		tile16 = new JLabel();
		tile16.setBounds(575, 0, 64, 64);
		panel.add(tile16);
		
		tile17 = new JLabel();
		tile17.setBounds(575, 0, 64, 64);
		panel.add(tile17);
		
		tile18 = new JLabel();
		tile18.setBounds(575, 0, 64, 64);
		panel.add(tile18);
		
		tile19 = new JLabel();
		tile19.setBounds(575, 0, 64, 64);
		panel.add(tile19);
	}
	
}
