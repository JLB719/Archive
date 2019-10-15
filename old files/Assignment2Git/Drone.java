package dsa_assignment2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * A Drone class to simulate the decisions and information collected by a drone
 * on exploring an underground maze.
 * 
 */
public class Drone implements DroneInterface
{
	private static final Logger logger     = Logger.getLogger(Drone.class);
	
	public String getStudentID()
	{
		//change this return value to return your student id number
		return "1888738";
	}

	public String getStudentName()
	{
		//change this return value to return your name
		return "JAMES BARTLETT";
	}

	/**
	 * The Maze that the Drone is in
	 */
	private Maze                maze;

	/**
	 * The stack containing the portals to backtrack through when all other
	 * doorways of the current chamber have been explored (see assignment
	 * handout). Note that in Java, the standard collection class for both
	 * Stacks and Queues are Deques
	 */
	private Deque<Portal>       visitStack = new ArrayDeque<>();

	/**
	 * The set of portals that have been explored so far.
	 */
	private Set<Portal>         visited    = new HashSet<>();

	/**
	 * The Queue that contains the sequence of portals that the Drone has
	 * followed from the start
	 */
	private Deque<Portal>       visitQueue = new ArrayDeque<>();

	/**
	 * This constructor should never be used. It is private to make it
	 * uncallable by any other class and has the assert(false) to ensure that if
	 * it is ever called it will throw an exception.
	 */
	@SuppressWarnings("unused")
	private Drone()
	{
		assert (false);
	}

	/**
	 * Create a new Drone object and place it in chamber 0 of the given Maze
	 * 
	 * @param maze
	 *            the maze to put the Drone in.
	 */
	public Drone(Maze maze)
	{
		this.maze = maze;
	}

	/* 
	 * @see dsa_assignment2.DroneInterface#searchStep()
	 */
	@Override
	public Portal searchStep()
	{
		/* WRITE YOUR CODE HERE */

		int currentChamber = maze.getCurrentChamber();
		int numberOfDoors = maze.getNumDoors();
		int currentdoor;
		int fakeDoor = -1;
		boolean repeatCheck = false;
		Portal currentPortal = visitStack.getLast();
		if (visitStack.isEmpty() == true) 
		{
			currentPortal = maze.traverse(0);
			visitStack.push(currentPortal);
			visitQueue.push(currentPortal);
			visited.add(currentPortal);
			return currentPortal;
		}
		Portal currentVisitPortal = visitStack.getLast();
		int notDoor = currentVisitPortal.getDoor();
		for (int i = 0; i <= numberOfDoors; i++) 
		{
			if (i == numberOfDoors) 
			{
				fakeDoor = numberOfDoors;
				break;
			}
			Portal samplePortal = new Portal(i, currentChamber);
			for (int j = 0; j < getVisitOrder().length; j++) 
			{
				if (samplePortal == getVisitOrder()[j]) 
				{
					repeatCheck = true;
					break;
				}
				
			}
			if (repeatCheck == false) 
			{
				currentPortal = maze.traverse(i);
				visitStack.push(currentPortal);
				visitQueue.push(currentPortal);
				visited.add(currentPortal);
				return currentPortal;
			}
		}
		if (fakeDoor == numberOfDoors) 
		{
			Portal portalToGoThrough = visitStack.pop();
			visitQueue.push(portalToGoThrough);
			visited.add(portalToGoThrough);
			return portalToGoThrough;
		}
		


		return currentPortal;
	}

	/* 
	 * @see dsa_assignment2.DroneInterface#getVisitOrder()
	 */
	@Override
	public Portal[] getVisitOrder()
	{
		/* WRITE YOUR CODE HERE */
		return null;
	}

	/*
	 * @see dsa_assignment2.DroneInterface#findPathBack()
	 */
	@Override
	public Portal[] findPathBack()
	{
		/* WRITE YOUR CODE HERE */
		return null;
	}

}
