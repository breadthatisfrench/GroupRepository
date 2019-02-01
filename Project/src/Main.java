import javax.swing.JFrame;

import dflt.MyScreen;

public class Main {

	public static void main(String args[])
	{
		MyScreen ms = new MyScreen();
		JFrame frame = new JFrame("Name");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(ms.getPanel());
	}
}
