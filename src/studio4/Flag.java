package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		StdDraw.setPenRadius(0.05);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(11,10, 9, 2);
		StdDraw.setPenColor(Color.BLACK);
		
		StdDraw.rectangle(11,8, 9, 4);
	}
}