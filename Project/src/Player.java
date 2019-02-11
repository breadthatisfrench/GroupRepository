import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener
{
	int x = 0;
	int y = 0;
	
	public void setLocation(int x, int y)
	{
		
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		
	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		char key = arg0.getKeyChar();
		key = Character.toLowerCase(key);
		switch(key)
		{
		case 'w':
			up();
			break;
		case 's':
			down();
			break;
		}
	}

		
}
