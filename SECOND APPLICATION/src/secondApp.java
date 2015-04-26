import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class secondApp {
	
	public static void main(String[] args)
	{
		
		//frame likes to manage it's own special thread and is a special swing method that create a swing thread 
		//and must to run this code in that thread
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				//JFrame is the main window of our application
				//create an object of JFrame type
				JFrame frame = new MainFrame("Hello world of GUI !");//the title can be set like this too
				//frame.setTitle("Whohoo!");for set the title
				frame.setSize(500,400);//the size of the window
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminate the program when I click the close button of window
				frame.setVisible(true);//set the window visible 
				
			}
			
		});
		
		
	}

}
