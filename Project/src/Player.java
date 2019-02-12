import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.event.KeyListener;

//Use Random or rand.nextInt() to get food to position itself. Then, in order to make it into the grid neatly, if we have the grid have 10x10px cells, then divide x and y by 10, then
//multiply by 10, thus making the coordinates into multiples of 10, fitting nicely in grid cells.


public class Player implements KeyListener
{
	private int width, height;
	private Coordinate pos, foodPos;
	private Random rand = new Random();
	public Player(Coordinate pos, int width, int height) {
		this.pos = pos;
		this.width = width;
		this.height = height;
	}
	
	public Coordinate getFoodPos() 
	{
		return foodPos;
	}

	public void setFoodPos() {
		foodPos = new Coordinate(rand.nextInt(width), rand.nextInt(height));
	}
	
	
	
	private void die() {
		System.out.println("You died");
	}
	
	private void up() {
		if(pos.y - 1 >= 0)
		{
			pos.y--;
		}
		else
		{
			die();
		}
	}
	
	private void down() {
		if(pos.y + 1 < height)
		{
			pos.y++;
		}
		else
		{
			die();
		}
	}
	
	private void left() {
		
		if(pos.x - 1 >= 0)
		{
			pos.x--;
			
		}
		else
		{
			die();
		}
	}
	
	private void right() {
		if(pos.x + 1 < width)
		{
			pos.x++;
		}
		else
		{
			die();
		}
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
				up();
				break;
			case 's':
				down();
				break;
			case 'a':
				left();
				break;
			case 'd':
				right();
				break;
		}
		
		System.out.println("pos.x: " + pos.x + " pos.y: " + pos.y);
	}

	




		
}
