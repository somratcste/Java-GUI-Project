import javax.swing.JFrame;

public class MouseTracker {
	
	public static void main(String[] args)
	{
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseTrackerFrame.setSize(300,200);
		mouseTrackerFrame.setVisible(true);
	}

}
