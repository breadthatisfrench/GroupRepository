import javax.swing.JFrame;

public class Main {

	private int width, height;
	
	public Main(int width, int height)
	{
		this.width = height;
		this.height = height;
		//MyScreen ms = new MyScreen();
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.pack();
		frame.setVisible(true);
		frame.pack();
		frame.repaint();
		
		Player player = new Player(new Coordinate(0, 0), width, height);
		frame.addKeyListener(player);
	}
	public static void main(String[] args)
	{
		new Main(5, 5);
	}
	
}
