package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ButtonPressedAction extends AbstractAction {

	public ButtonPressedAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Action class says: creating pdf");

	}

}
