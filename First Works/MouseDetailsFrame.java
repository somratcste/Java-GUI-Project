import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame  extends JFrame{
	
	private String details;
	private JLabel statusBar;
	
	public MouseDetailsFrame()
	{
		super("Moouse Clicks and Buttons ");
		
		statusBar  = new JLabel("Click the mosue");
		add(statusBar , BorderLayout.SOUTH);
		addMouseListener(new MouseClickedHandler());
		
	}
	
	private class MouseClickedHandler extends MouseAdapter 
	{
		public void mouseClicked(MouseEvent event)
		{
			int xPos= event.getX();
			int yPos= event.getY();
			
			details = String.format("Clicked %d time(s)" , event.getClickCount());
			
			if(event.isMetaDown())
				details+= "With Right Mouse Button ";
			else if ( event.isAltDown())
				details += "With Center Mouse Button";
			else  
				details += "With Left Mouse Button";
			
			statusBar.setText(details);
		}
	}

}
