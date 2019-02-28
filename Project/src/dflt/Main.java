package dflt;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Main {

	private int width, height;
	private Player player;
	private MyScreen ms;
	
	public static final int squareLength = 20;
	
	public Main(int width, int height) //start of game, JFrame setup
	{
		this.width = height;
		this.height = height;
		ms = new MyScreen(this);
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Window");
		initFrame(frame);
		frame.add(ms.getPanel(), BorderLayout.CENTER);
		player = new Player(new Coordinate(0, 0), ms, width, height);
		frame.addKeyListener(player);
		player.setFoodPos();
		frame.pack();
		frame.repaint();
		
		System.out.println(player.getFoodPos());
		
		ms.start();
	}
	
	private void initFrame(JFrame input) //all basic JFrame setup that stays the same for all programs
	{
		input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		input.setLayout(new BorderLayout());
		input.pack();
		input.setVisible(true);
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		System.out.println(gd.getDisplayMode().getWidth()+ "   " + gd.getDisplayMode().getHeight());
		input.setPreferredSize(new Dimension(gd.getDisplayMode().getWidth(), gd.getDisplayMode().getHeight()));
		input.pack();
		input.repaint();
	}
	
	public static void main(String[] args) //dimensions for board [we input our own args (click drop-down arrow by run button, choose run configurations, click args tab, enter in two nums)]
	{
		new Main(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
	
	public BufferedImage getPixels() //colors the pieces on the board (player, empty spots). We need to still color food and other body parts when added
	{
		BufferedImage bi = new BufferedImage(ms.getPanel().getWidth(), ms.getPanel().getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D)bi.getGraphics();
		int widthSeperatorPixels = ms.getPanel().getWidth() / (width + 1);
		int heightSeperatorPixels = ms.getPanel().getHeight() / (height + 1);
		for(int x = 0; x < width; x++)
		{
			for(int y = 0; y < height; y++)
			{
				int xPix = (x + 1) * widthSeperatorPixels;
				int yPix = (y + 1) * heightSeperatorPixels;
				if(player.getPos().isAt(x, y))
				{
					g2.setColor(Color.RED);
					
				}
				else if(player.getFoodPos().isAt(x, y))
				{
					g2.setColor(Color.BLUE);
					
				}
				else
				{
					g2.setColor(Color.WHITE);
					
				}
				g2.fillRect(xPix - squareLength / 2, yPix - squareLength / 2, squareLength, squareLength);
			}
		}
		
		return bi;
	}
	
}
