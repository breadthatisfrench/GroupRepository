package dflt;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyListener;
import bensAbstract.Screen;

//Use Random or rand.nextInt() to get food to position itself. Then, in order to make it into the grid neatly, if we have the grid have 10x10px cells, then divide x and y by 10, then
//multiply by 10, thus making the coordinates into multiples of 10, fitting nicely in grid cells.


public class Player implements KeyListener
{
	private int width, height;
	private Coordinate pos, foodPos;
	private Random rand = new Random();
	private Direction dir;
	private MyScreen ms;
	
	public Player(Coordinate pos, MyScreen ms, int width, int height) {
		this.pos = pos;
		this.width = width;
		this.height = height;
		this.ms = ms;
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask(this), 0, 250);
		dir = Direction.EAST;
	}
	
	public Coordinate getFoodPos() 
	{
		return foodPos;
	}
	
	public Coordinate getPos()
	{
		return pos;
	}
	
	public void setFoodPos() {
		foodPos = new Coordinate(rand.nextInt(width), rand.nextInt(height));
	}
	
	private void die() {
		System.out.println("You died");
		ms.stop();
	}
	
	public boolean isAt(int width, int height)
	{
		return pos.equals(new Coordinate(width, height));
	}
	
	public Coordinate getLocation()
	{
		return pos;
	}
	
	public void setLocation(Coordinate input)
	{
		pos = input;
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
				dir = Direction.NORTH;
				break;
			case 's':
				//down();
				dir = Direction.SOUTH;
				break;
			case 'a':
				//left();
				dir = Direction.WEST;
				break;
			case 'd':
				//ight();
				dir = Direction.EAST;
				break;
		}
		
	}
	
	public void move()
	{
		switch(dir)
		{
			case NORTH:
				pos.y--;
				
				break;
			case EAST:
				pos.x++;
				
				break;
			case SOUTH:
				pos.y++;
				break;
			case WEST:
				pos.x--;
		}
	}
		
}
