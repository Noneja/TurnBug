/**
 * A class that extends Bug to use user input.
 * @author aroggemann
 * @version 3.20.14
 */
package turnbug;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class TurnBug extends Bug implements KeyListener, ActionListener
{
	public boolean right = false;
	public boolean left = false;
	Location locObj = getLocation();
	
	public TurnBug()
	{
		
	}
	public void act() 
	{
		if (canMove())
		{
			if (right)
			{
				setDirection(locObj.RIGHT);
				move();
			}
			else if (left)
			{
				setDirection(locObj.LEFT);
				move();
			}
			else
			{
				move();
			}
		}
	}
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode()==39)
		{
			right = true;
			left = false;
		}
		if(e.getKeyCode()==37)
		{
			left = true;
			right = false;
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
