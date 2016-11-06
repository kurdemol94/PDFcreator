package controller;

import view.Window;

public class Controller{
	public static ButtonPressedAction action;
	public static Controller kontroler;
	public Window window;
	
	
	public Controller(){
		action = new ButtonPressedAction("Create PDF");
		window = new Window();
		
	}
	
	public static void main(String[] args){
		kontroler = new Controller();
	}

	public String getText(){
		return window.text.getText();
	}
}
