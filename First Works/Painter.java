import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Painter {
	
	public static void main(String[] args)
	{
		JFrame application = new JFrame("A simple paint program.");
		PaintPanel paintPanel = new PaintPanel();
		application.add(paintPanel , BorderLayout.CENTER);
		
		application.add(new JLabel("Drag the mouse to draw") , BorderLayout.SOUTH);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400,200);
		application.setVisible(true);
	}

}
