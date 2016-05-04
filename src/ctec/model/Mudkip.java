package ctec.model;

public class Mudkip extends Pokemon
{
	public Mudkip()
	{
		super();
		
		this.setName("Mudkip");
		this.setNumberOfArms(0);
		this.setNumberOfLegs(4);
		this.setDexNumber(258);
	}
	
	@Override
	public String name(String name)
	{
		name = "Mudkip";
		
		return name;
	}
	
	@Override
	public int numberOfArms()
	{
		int mudkipArms = 0;
	}
	
	@Override
	public int numberOfLegs()
	{
		int mudkipLegs = 4;
	}

}
