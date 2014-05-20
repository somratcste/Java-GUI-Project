import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame {
	
	private JTextArea textArea1;
	private JTextArea textArea2;
	private JButton copyButton;
	

	public TextAreaFrame() {
		// TODO Auto-generated constructor stub
		super("Text Area Demo.");
		Box box = Box.createHorizontalBox();
		String demo = "this is a demo string \n " + 
		               "illustrate copying text \n from one textarea to \n" + 
				        " another textarea using an \n external event\n";
		
		textArea1 = new JTextArea(demo , 10 , 15);
		box.add(new JScrollPane(textArea1));
		
		copyButton = new JButton("copy >>>");
		box.add(copyButton);
		copyButton.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						textArea2.setText(textArea1.getSelectedText());
					}
				}
				);
		
		textArea2 = new JTextArea(10 , 15);
		textArea2.setEditable(false);
		box.add(new JScrollPane(textArea2));
		add(box);
		
	}

}
