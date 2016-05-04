package ctec.model;

public class Giratina
{
	public Giratina()
	{
		super();
		
		this.setName("Giratina");
		this.setNumberOfArms(0);
		this.setNumberOfLegs(6);
		this.setDexNumber(487);
	}
	
	@Override
	public String name(String name)
	{
		name = "Giratina";
		
		return name;
	}
	
	@Override
	public int numberOfArms()
	{
		int giratinaArms = 0;
	}
	
	@Override
	public int numberOfLegs()
	{
		int giratinaLegs = 6;
	}
	
	@Override
	public int setDexNumber()
	{
		int dexNumber = 487;
	}

}
