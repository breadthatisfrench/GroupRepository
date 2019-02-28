package dflt;

public class Coordinate {
	public int x, y;
	public Coordinate(int x, int y) //sets coordinate of you
	{
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object input)
	{
		if(input instanceof Coordinate)
		{
			Coordinate oth = (Coordinate)input;
			
			return x == oth.x && y == oth.y;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "X: " + x + " Y: " + y;
	}
	
	public boolean isAt(int x2, int y2)
	{
		return x == x2 && y == y2;
	}
}
