import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;


public class ListFrame extends JFrame {
	private JList colorList;
	private static final String[] colorNames = { "Black" , "Blue" , "Cyan" ,"Dark Gray", "Gray" ,"Green","Red" };
	private static final Color[] colors = {Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.RED };
	
	public ListFrame()
	{
		super("List Frame");
		setLayout(new FlowLayout());
		
		colorList= new JList(colorNames);
		colorList.setVisibleRowCount(5);
		
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(colorList));
		
		
		colorList.addListSelectionListener(
				new ListSelectionListener() {  //start anonymous inner class
					
					public void valueChanged(ListSelectionEvent event) {
						// TODO Auto-generated method stub
						getContentPane().setBackground(colors[colorList.getSelectedIndex()]);
						
					}
				}
				);
	
	}

}
