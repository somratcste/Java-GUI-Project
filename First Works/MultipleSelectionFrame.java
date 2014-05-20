import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
	
	private JList colorList;
	private JList copyList;
	private JButton copyButton;
	private static final String[] colorNames = { "Black" , "Blue" , "Cyan" ,"Dark Gray", "Gray" ,"Green","Red" };
	
	
	public MultipleSelectionFrame()
	{
		super("Multipls Selection Frame");
		setLayout(new FlowLayout());
		
		colorList = new JList(colorNames);
		colorList.setVisibleRowCount(5);
		colorList.setFixedCellWidth(80);
		colorList.setFixedCellHeight(20);
		colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorList));
		
		copyButton = new JButton("copy >>>");
		copyButton.addActionListener(
				new ActionListener() {  // start anonymous inner class
					
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent event) {
						// TODO Auto-generated method stub
						copyList.setListData(colorList.getSelectedValues());
						
					}
				}
				);
		
		add(copyButton);
		copyList = new JList();
		
		copyList.setVisibleRowCount(5);
		copyList.setFixedCellWidth(80);
		copyList.setFixedCellHeight(20);
		copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add (new JScrollPane(copyList));
	}
	
}
