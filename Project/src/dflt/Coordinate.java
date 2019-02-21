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
}
