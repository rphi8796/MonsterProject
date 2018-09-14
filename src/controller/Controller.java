package controller;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	
	//Constructors initialize data members
	public Controller()
	{
		//myMonster = new MarshmallowMonster("Jeef", "2.2", "5", "false", "4");
		userMonster = new MarshmallowMonster();
		inputScanner =  new Scanner(System.in);
		
	}
	
	public void start()
	{
		//JOptionPane.showMessageDialog(null,  myMonster);
		//System.out.println(myMonster);
		
		//System.out.println("how many arms does your monster have?");
		//JOptionPane.showMessageDialog(null, "How many arms does your monster have?");
		
		//int arms = inputScanner.nextInt();
		
		String userInput = JOptionPane.showInputDialog(null, "How many arms for your monster");
		int arms = -99;
		if (validInt(userInput))
		{
			arms = Integer.parseInt(userInput);
		}
		
		boolean answer = Boolean.parseBoolean(userInput);
		
		userMonster.setArmCount(arms);
		//System.out.println("Your monster has " + userMonster.getArmCount() + " arms");
		
		
		//double legs = inputScanner.nextDouble();
		
		String userInput2 = JOptionPane.showInputDialog(null, "How many legs does your monster have?");
		double legs = 2.2;
		if (validDouble(userInput2))
		{
			legs = Integer.parseInt(userInput2);
		}
		
		boolean answer2 = Boolean.parseBoolean(userInput2);
		
		userMonster.setLegCount(legs);
		//System.out.println("Your monster has " + userMonster.getLegCount() + " legs");
		
		
		//int eyes = inputScanner.nextInt();
		
		String userInput3 = JOptionPane.showInputDialog(null, "How many eyes does your monster have?");
		int eyes = 3;
		if (validInt(userInput3))
		{
			eyes = Integer.parseInt(userInput3);
		}
		
		boolean answer3 = Boolean.parseBoolean(userInput3);
		
		userMonster.setEyeCount(eyes);
		
		//System.out.println("Your monster has" + userMonster.getEyeCount() + " eyes");
		
		//String name = inputScanner.next();
		
		String userInput4 = JOptionPane.showInputDialog(null, "what is your monster's name?");
		String name = "jeef";
		userMonster.setName(name);
		
		//System.out.println("Your monsters name is " + userMonster.getName() + " name");
		
		//boolean nose = inputScanner.nextInt();
		
		String userInput5 = JOptionPane.showInputDialog(null, "Is it true or false that your monster has a nose?");
		boolean nose = false;
		
		userMonster.setHasNoses(nose);
		//System.out.println("Your monster has a " + userMonster.getEyeCount() + " nose");
		
			
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try 
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		
		return isValid;
		
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;	
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number witha . in the middle?");
		}
		
		return isValid;
	}
}
