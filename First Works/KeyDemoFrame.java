import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
	
	private String line1 = "";
	private String line2 = "";
	private String line3 = "";
	private JTextArea textArea;
	
	public KeyDemoFrame()
	{
		super("Demostrating Keystroke events");
		textArea = new JTextArea(10,15);
		textArea.setText("Press any key on the keyboard...");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea);
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
		line1 = String.format("Key Pressed %s " , KeyEvent.getKeyText(event.getKeyCode()));
		setLines2and3(event);
		
	}

	private void setLines2and3(KeyEvent event) {
		// TODO Auto-generated method stub
		
		line2 = String.format("This key is %s an action key " , (event.isActionKey() ? "" : "not"));
		
		String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
	    line3 = String.format("Modifier keys pressed %s " , (temp.equals("") ? "none " : temp));
	    
	    textArea.setText(String.format("%s \n %s\n %s\n", line1 , line2 , line3));
		
	}

	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
		line1 = String.format("Key Released %s " , KeyEvent.getKeyText(event.getKeyCode()));
		setLines2and3(event);
		
	}

	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
		line1= String.format("key typed %s" , event.getKeyChar());
		setLines2and3(event);
		
	}

}
