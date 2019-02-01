package dflt;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import bensAbstract.Screen;

public class MyScreen extends Screen 
{

	
	public JPanel getPanel()
	{
		return panel;
	}
	
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

}
