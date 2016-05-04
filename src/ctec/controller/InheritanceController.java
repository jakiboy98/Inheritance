package ctec.controller;

import java.util.ArrayList;
import ctec.model.*;

public class InheritanceController
{
	public InheritanceController()
	{
		makeStrengthList();
	}
	
	private ArrayList<battleStrength> battleStrength;
	
	public String showBattleStrength()
	{
		String BattlePower = "";
		for(battleStrength current : battleStrength)
		{
			battlePower.concat("This is a " + current.toString() + " and has a power level of " + current.battleStrength() + "\n");
		}
		
		return battlePower;
	}
	
	private void makeSillyList()
	{
		battleStrength.add(new Mudkip());
		battleStrength.add(new Charizard());
		battleStrength.add(new Tyranitar());
		battleStrength.add(new Giratina());
	}
	
	public void start()
	{
		
	}
	
}
