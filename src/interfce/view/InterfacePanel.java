package interfce.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfce.controller.InterfaceAppController;
import interfce.model.InterfaceImplement;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class InterfacePanel extends JPanel
{

	private InterfaceAppController baseController;
	
	private JButton blueScreenButton;
	private JButton hotDogButton;
	private JButton baeStatusButton;
	private JButton notDoorButton;
	
	private SpringLayout baseLayout;
	
	
	public InterfacePanel(InterfaceAppController baseController)
	{
		this.baseController = baseController;
		
		blueScreenButton = new JButton("Death Screen");
		hotDogButton = new JButton("HotDogIt");
		baeStatusButton = new JButton("Bae");
		notDoorButton = new JButton("Door?");
		baseLayout = new SpringLayout();
		
		
		this.setBackground(Color.yellow);
		this.setLayout(baseLayout);
		this.add(baseLayout);
		this.add(blueScreenButton);
		this.add(hotDogButton);
		this.add(baeStatusButton);
		this.add(notDoorButton);
		
		setPreferredSize(new Dimension(200, 200));
		
		JTextPane txtpnInterface = new JTextPane();
		baseLayout.putConstraint(SpringLayout.NORTH, txtpnInterface, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, txtpnInterface, 67, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, txtpnInterface, -26, SpringLayout.EAST, blueScreenButton);
		txtpnInterface.setText("Interface");
		add(txtpnInterface);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, notDoorButton, 6, SpringLayout.SOUTH, baeStatusButton);
		baseLayout.putConstraint(SpringLayout.WEST, notDoorButton, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, notDoorButton, 0, SpringLayout.EAST, blueScreenButton);
		baseLayout.putConstraint(SpringLayout.NORTH, baeStatusButton, 6, SpringLayout.SOUTH, hotDogButton);
		baseLayout.putConstraint(SpringLayout.WEST, baeStatusButton, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, baeStatusButton, 0, SpringLayout.EAST, blueScreenButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, blueScreenButton, -121, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, blueScreenButton, -56, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, hotDogButton, 6, SpringLayout.SOUTH, blueScreenButton);
		baseLayout.putConstraint(SpringLayout.WEST, hotDogButton, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, hotDogButton, 0, SpringLayout.EAST, blueScreenButton);
	}
	
	private void setupListeners()
	{
		blueScreenButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				InterfaceImplement.bluescreen();
			}
		});
	}
}
