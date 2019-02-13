package dflt;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import bensAbstract.Screen;

public class MyScreen extends Screen 
{
	private Main main;
	
	public JPanel getPanel()
	{
		return panel;
	}
	
	public MyScreen(Main main)
	{
		super(50);
		this.main = main;
	}
	@Override
	protected void update() {
		pixels = new BufferedImage(panel.getWidth(), panel.getHeight(), pixels.TYPE_INT_RGB);
		Graphics2D g = (Graphics2D)pixels.getGraphics();
		BufferedImage otherPixels = main.getPixels();
		g.drawImage(otherPixels, 0, 0, null);
	}
	
	@Override
	public void start()
	{
		gameRunning = true;
		super.start();
	}
	
	public void stop()
	{
		gameRunning = false;
	}

}
