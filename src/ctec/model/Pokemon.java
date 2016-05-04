package ctec.model;

public class Pokemon
{
	private String name;
	private int numberOfLegs;
	private int numberOfArms;
	private int dexNumber;
	private boolean isEvolved;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int numberOfLegs)
	{
		this.numberOfLegs = numberOfLegs;
	}
	
	public int getNumberOfArms()
	{
		return numberOfArms;
	}
	
	public void setNumberOfArms(int numberOfArms)
	{
		this.numberOfArms = numberOfArms;
	}
	
	public int dexNumber()
	{
		return dexNumber;
	}
	
	public void setDexNumber(int dexNumber)
	{
		this.dexNumber = dexNumber;
	}
	
	public boolean isEvolved()
	{
		return isEvolved;
	}
	
	public void setIsEvolved(boolean isEvolved)
	{
		this.isEvolved = isEvolved;
	}
	
	public int compareTo(object compare)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof PokemonStuff)
		{
			if(this.dexNumber() > ((PokemonStuff) compared).dexNumber())
			{
				comparedValue = 1;
			}
			else if(this.dexNumber() < ((PokemonStuff) compared).dexNumber())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
}
