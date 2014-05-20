import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class LabelFrame extends JFrame {
	private JLabel labelone;
	private JLabel labeltwo;
	private JLabel labelthree;
	
	
	public LabelFrame()
	{
		super("Testing JLabel by somrat");
		setLayout(new FlowLayout());
		
		labelone=  new JLabel("Label with text");
		labelone.setToolTipText("This is label one ");
		
	
		add(labelone);
		
		Icon bug = new ImageIcon("somrat.gif");
		labeltwo = new JLabel("Label with text and icon " , bug , SwingConstants.LEFT);
		labeltwo.setToolTipText("THis is label two " );
		add(labeltwo);
		
		labelthree=new JLabel();
		labelthree.setText("Label with icon and text at bottom " );
		labelthree.setIcon(bug);
		labelthree.setHorizontalTextPosition(SwingConstants.CENTER);
		labelthree.setVerticalTextPosition(SwingConstants.BOTTOM);
		labelthree.setToolTipText("This is label three");
		add(labelthree);
	}

}
