package controller;

import model.MarshmallowMonster;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members
	public Controller()
	{
		myMonster = new MarshmallowMonster("Jeef", 1.141213562373, 3, false, 1);
	}
	
	
	public void start()
	{
		System.out.println(myMonster);
	}
	
}
