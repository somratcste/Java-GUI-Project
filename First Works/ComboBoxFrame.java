import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class ComboBoxFrame extends JFrame {
	private JComboBox imagesJComboBox;
	private JLabel label;
	private static final String[] names = {"somrat.gif","somrat.gif","somrat.gif","somrat.gif"};
	private Icon[] icons = { 
			new ImageIcon(names[0]),
			new ImageIcon(names[1]),
			new ImageIcon(names[2]),
			new ImageIcon(names[3]) } ;
	
	public ComboBoxFrame()
	{
		super("Testing JComboBox");
		setLayout(new FlowLayout());
		
		imagesJComboBox = new JComboBox(names);
		imagesJComboBox.setMaximumRowCount(4);
		
		imagesJComboBox.addItemListener(
				new ItemListener() {    // start annonymous class 
					
					
					public void itemStateChanged(ItemEvent event) {
						// TODO Auto-generated method stub
						if(event.getStateChange() == ItemEvent.SELECTED)
							label.setIcon(icons[
							     imagesJComboBox.getSelectedIndex() ]);
						
					}
				}
				);
		add(imagesJComboBox);
		label = new JLabel(icons[0]);
		add(label);
		
		
	}

}
