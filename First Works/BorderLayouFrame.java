import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayouFrame extends JFrame implements ActionListener {
	
	private JButton[] buttons;
	private static final String[] names = {"Hide North" , "Hide South","Hide East","Hide West","Hide Center" };
	private BorderLayout layOut;
	
	public BorderLayouFrame()
	{
		super("BorderLayout Demo");
		
		layOut = new BorderLayout(15,15);
		setLayout(layOut);
		buttons = new JButton[names.length];
		
		for(int count = 0 ; count <names.length ;count++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
		}
		
		add(buttons[0] , BorderLayout.NORTH);
		add(buttons[1] , BorderLayout.SOUTH);
		add(buttons[2] , BorderLayout.EAST);
		add(buttons[3] , BorderLayout.WEST);
		add(buttons[4] , BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		for(JButton button : buttons)
		{
			if(event.getSource()==button)
				button.setVisible(false);
			else
				button.setVisible(true);
		}
		layOut.layoutContainer(getContentPane());
		
	}

}
