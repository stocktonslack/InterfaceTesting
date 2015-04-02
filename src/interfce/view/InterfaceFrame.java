package interfce.view;

import interfce.controller.InterfaceAppController;

import javax.swing.JFrame;
import java.awt.Color;

public class InterfaceFrame extends JFrame
{
	
	private InterfacePanel basePanel;
	
	public InterfaceFrame(InterfaceAppController baseController)
	{
		basePanel = new InterfacePanel(baseController);
		basePanel.setBackground(Color.YELLOW);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(200, 200);
		this.setResizable(true);
		this.setVisible(true);
	}
}
