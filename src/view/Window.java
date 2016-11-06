package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Window extends JFrame {
	private final JLabel description;
	private JPanel panel1;
	private JPanel panel2;
	private JTextArea text;
	private JButton button;
	
	public Window(){
		super("PDF Creator");
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		panel1 = new JPanel();
	}


}
