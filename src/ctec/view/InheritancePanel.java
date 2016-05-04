package ctec.view;

import javax.swing.*;

import ctec.controller.InheritanceController;

public class InheritancePanel extends JPanel
{
private InheritanceController baseController;
	private JButton sortButton; 
	private JButton textArea;
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				String temp = "The sorted contents are in : \n";
				textArea.setText(baseController.showBattleStrength());
				
				for(BattleStrength current : baseController.getBattleStrength())
				{
					temp += current.toString) + "\n";
				}
				textArea.setText(temp);
			}
		}
	}
}
