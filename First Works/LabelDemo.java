import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class LabelDemo {
	public static void main(String args[])
	{
		JLabel northLabel = new JLabel("North this is north");
		
		ImageIcon labelIcon = new ImageIcon ("somrat.gif");
		
		JLabel centerLabel = new JLabel(labelIcon);
	
		
		JLabel southLabel = new JLabel(labelIcon);
		
		southLabel.setText("South");
		
		JFrame application = new JFrame() ;
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(northLabel , BorderLayout.NORTH);
		application.add(centerLabel , BorderLayout.CENTER);
		application.add(southLabel , BorderLayout.SOUTH);
		
		application.setSize(300 , 300);
		application.setVisible(true);
		
	}

}

