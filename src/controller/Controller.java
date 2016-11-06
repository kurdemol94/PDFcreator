package controller;

import view.Window;

public class Controller{
	public static ButtonPressedAction action;
	
	public static void main(String[] args){
		action = new ButtonPressedAction("Create PDF");
		new Window();
		
	}

}
