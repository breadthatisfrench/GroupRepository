package dflt;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyListener;

//Use Random or rand.nextInt() to get food to position itself. Then, in order to make it into the grid neatly, if we have the grid have 10x10px cells, then divide x and y by 10, then
//multiply by 10, thus making the coordinates into multiples of 10, fitting nicely in grid cells.


public class Player implements KeyListener
{
	private int width, height;
	private Coordinate pos, foodPos;
	private Random rand = new Random();
	private Direction dir;
	
	public Player(Coordinate pos, int width, int height) {
		this.pos = pos;
		this.width = width;
		this.height = height;
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask(this), 0, 250);
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
				break;
			case 'a':
				//left();
				break;
			case 'd':
				//ight();
				break;
		}
		
	}
	
	public void move()
	{
		switch(dir)
		{
			case NORTH:
				//y--;
				break;
			case EAST:
				//x++;
				break;
			case SOUTH:
				//y++;
				break;
			case WEST:
				//x--;
		}
	}
		
}
