package model;

public class MarshmallowMonster
{
	//Declaration section
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	public MarshmallowMonster()
	{	
		//Default constructor
		//Generally boring and no as helpful
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNose()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public String toString()
	{
		String description = "This monster is named " + name 
							+ " and is has " + legCount + "legs. Jeef has "  
							+ armCount + "arms. He has a nice face with " + eyeCount 
							+ " eyes and has a " + hasNoses + " nose. He likes to say: My name is Jeff "
							+ "(even though his name is Jeef)";
		
		return description;
	}
}
