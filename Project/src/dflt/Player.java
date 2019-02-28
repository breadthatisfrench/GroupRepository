package dflt;
import java.awt.GraphicsDevice;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyListener;
import bensAbstract.Screen;



public class Player implements KeyListener
{
	private int width, height;
	private Coordinate pos, foodPos;
	private Random rand = new Random();
	private Direction dir;
	private MyScreen ms;
	private GraphicsDevice gd;
	private int randwidth;
	private int randheight;
	
	public Player(Coordinate pos, MyScreen ms, int width, int height) { //sets player up where to start and how fast to move
		this.pos = pos;
		this.width = width;
		this.height = height;
		this.ms = ms;
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask(this), 0, 250);
		dir = Direction.EAST;
	}
	
	public void eat()
	{
		if(pos.x == randwidth && pos.y == randheight)
		{
			//grow();
			randwidth = rand.nextInt(width);
			randheight = rand.nextInt(height);
			foodPos = new Coordinate(randwidth, randheight);
			System.out.println(randwidth + " " + randheight);
		}
	}
	
	public Coordinate getFoodPos() //returns food's position (coords)
	{
		return foodPos;
	}
	
	public Coordinate getPos() //returns player's position
	{
		return pos;
	}
	
	public void setFoodPos() 
	{ 
		// sets where food will spawn (not working currently). we need to get it to spawn within the white squares (right now, it could be anywhere)
		
		randwidth = rand.nextInt(width);
		randheight = rand.nextInt(height);
		foodPos = new Coordinate(randwidth, randheight);
		System.out.println(randwidth + " " + randheight);
		
	}
	
	private void die() { //death
		System.out.println("You died");
		ms.stop();
	}
	
	public Coordinate getLocation() //returns player's position
	{
		return pos;
	}
	
	public void setLocation(Coordinate input)
	{
		pos = input;
	}

	@Override
	public void keyPressed(KeyEvent arg0) //pointless
	{
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) //pointless
	{
		
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) //changes player's directions
	{
		char key = arg0.getKeyChar();
		key = Character.toLowerCase(key);
		switch(key)
		{
			case 'w':
				if(dir != Direction.SOUTH)
				{
					dir = Direction.NORTH;
				}
				break;
			case 's':
				if(dir != Direction.NORTH) 
				{
					dir = Direction.SOUTH;
				}
				break;
			case 'a':
				if(dir != Direction.EAST)
				{
					dir = Direction.WEST;
				}
				break;
			case 'd':
				if(dir != Direction.WEST)
				{
					dir = Direction.EAST;
				}
				break;
		}
		
	}
	
	public void move()
	{
		switch(dir)
		{
			case NORTH:
				
				pos.y--;
				if(pos.y < 0)
				{
					die();
				}
				
				break;
			case EAST:
				pos.x++;
				if(pos.x > (width - 1))
				{
				  	die();
				}
				
				break;
			case SOUTH:
				pos.y++;
				if(pos.y > (height - 1))
				{
					die();
				}
				break;
			case WEST:
				pos.x--;
				if(pos.x < 0)
				{
					die();
				}
				
				break;
		}
	}
		
}
