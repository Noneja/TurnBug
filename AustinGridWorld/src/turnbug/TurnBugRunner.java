/**
 * @author aroggemann
 * @version 3.20.14
 */
package turnbug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * @author austin.roggemann
 *
 */
public class TurnBugRunner 
{

	/**
	 * @param args
	 */
	public TurnBugRunner()
	{
		
	}
	public static void main(String[] args) 
	{
		ActorWorld world = new ActorWorld();
		TurnBug bug1 = new TurnBug();
		bug1.setColor(Color.BLUE);
		
		world.add (new Location(7, 8), bug1);
		
		world.show();
	}

}
