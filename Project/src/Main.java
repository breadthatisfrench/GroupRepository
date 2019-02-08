import java.awt.Dimension;

import javax.swing.JFrame;

import dflt.MyScreen;

public class Main {

	public static void main(String[] args)
	{
		//MyScreen ms = new MyScreen();
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.pack();
		frame.setVisible(true);
		frame.pack();
		frame.repaint();
	}
}
