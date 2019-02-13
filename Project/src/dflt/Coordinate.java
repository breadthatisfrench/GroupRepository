package dflt;

public class Coordinate {
	public int x, y;
	public Coordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object input)
	{
		if(input instanceof Coordinate)
		{
			Coordinate oth = (Coordinate)input;
			System.out.println(x + " " + oth.x + " " + y + " " + oth.y);
			return x == oth.x && y == oth.y;
		}
		return false;
	}
}
