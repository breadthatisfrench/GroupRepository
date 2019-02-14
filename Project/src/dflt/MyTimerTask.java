package dflt;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask 
{

	private Player pl;
	
	public MyTimerTask(Player pl)
	{
		this.pl = pl;
	}
	
	@Override
	public void run() 
	{
		pl.move();
	}

}
