import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame{
	
	private JButton leftButton;
	private JButton centerButton;
	private JButton rightButton;
	private FlowLayout layOut;
	private Container container;
	
	public FlowLayoutFrame()
	{
		super("FlowLayout Demo");
		
		layOut = new FlowLayout();
		container = getContentPane();
		setLayout(layOut);
		
		leftButton = new JButton ("Left");
		add(leftButton);
		leftButton.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent event) {
						// TODO Auto-generated method stub
						layOut.setAlignment(FlowLayout.LEFT);
						layOut.layoutContainer(container);
						
					}
				}
				);
		
		centerButton = new JButton ("Center");
		add(centerButton);
		centerButton.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						layOut.setAlignment(FlowLayout.CENTER);
						layOut.layoutContainer(container);
						
					}
				}
				);
		rightButton = new JButton("Right");
		add(rightButton);
		rightButton.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						layOut.setAlignment(FlowLayout.RIGHT);
						layOut.layoutContainer(container);
						
					}
				}
				);
		
		
	}
 
}
