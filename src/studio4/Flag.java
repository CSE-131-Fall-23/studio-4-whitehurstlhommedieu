package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(600,300);
		
		StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 300);
		
		StdDraw.setPenColor(0, 255, 0);
		StdDraw.filledRectangle(0, 300, 600, 100);
		
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledRectangle(0, 150, 600, 50);
		
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledRectangle(0, 0, 600, 100);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.setPenRadius(.05);
		StdDraw.rectangle(600,300,600,300);
		StdDraw.rectangle(0,0,600,300);
			
	}
	
}