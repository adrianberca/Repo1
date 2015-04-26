import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;




public class MainFrame extends JFrame {
	public MainFrame(String title)
	{
		super(title);//here instead of title we can put any string and our window will have that title
		//ex: super("Vuyaaaa");//our window will have the title Vuyaaa 
		
		//Are 3 steps to adding components in to a swing frame
		
		//1.Set layout manager -> that means  how to arrange components in the frame
		setLayout(new BorderLayout());
		
		//2.Create swing components -> swing components usually start with a  J ans the second letter is a  capital letter
		JTextArea textArea = new JTextArea();// a big area where we can type text and create an object of TetArea type
		JButton button = new JButton("Click me ! ");
		
		//3.Add swing components to content pane (panou cu continut)
		Container c = getContentPane();
		
		c.add(textArea,BorderLayout.CENTER);//where the component should go
		c.add(button,BorderLayout.SOUTH);
		
		//Add a behaviour for the button
		JFrame framee = new JFrame();
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//this method is called when our button is clicked
				textArea.append("Hello Andrew muahahaha ! \n");
				
				
			}
			
		});
	}
}
