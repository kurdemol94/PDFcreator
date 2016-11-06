package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Window extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected final JLabel description;
	protected JPanel panel1;
	protected JPanel panel2;
	public JTextArea text;
	protected JButton create;
	
	public Window(){
		super("PDF Creator");
		setSize(420,200);
		setResizable(false);
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10,10);
		setLayout(layout);
		
		panel1 = new JPanel();
		description = new JLabel("Type your text below and press the button");
		create = new JButton(controller.Controller.action);
		panel1.add(description);
		panel1.add(create);
		add(panel1);
		
		panel2 = new JPanel();
		text = new JTextArea(5,30);
		panel2.add(text);
		add(panel2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


}
