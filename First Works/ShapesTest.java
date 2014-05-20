import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
	public static void main (String arts[])
	{
		String input = JOptionPane.showInputDialog(
				"Etner 1 to draw rectangles \n" +
		         "Enter 2 to draw ovals\n" + 
				 "Enter 3 to draw world" );
		int choice =Integer.parseInt(input);
		Shapes panel = new Shapes(choice);
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(350,350);
		application.setVisible(true);
		
	}
	     
}
