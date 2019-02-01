package dflt;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import bensAbstract.Screen;

public class MyScreen extends Screen {

	
	public MyScreen()
	{
		super(50);
		gameRunning = true;
		start();
	}
	@Override
	protected void update() {
		pixels = new BufferedImage(panel.getWidth(), panel.getHeight(), pixels.TYPE_INT_RGB);
		Graphics2D g = (Graphics2D)pixels.getGraphics();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
