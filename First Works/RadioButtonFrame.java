import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import sun.net.www.content.text.plain;

public class RadioButtonFrame extends JFrame {
	private JTextField textField;
	private Font plainFont;
	private Font boldFont;
	private Font italicFont;
	private Font boldItalicFont;
	private JRadioButton plainRadioButton;
	private JRadioButton boldRadioButton;
	private JRadioButton italicRadioButton;
	private JRadioButton boldItalicRadioButton;
	private ButtonGroup radioGroup;
	
	public RadioButtonFrame()
	{
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change" , 25);
		add(textField);
		
		plainRadioButton = new JRadioButton("Plain" , true);
		boldRadioButton = new JRadioButton("Bold" , false);
		italicRadioButton = new JRadioButton("Italic" , false);
		boldItalicRadioButton = new JRadioButton("Bold/Italic",false);
		
		add(plainRadioButton);
		add(boldRadioButton);
		add(italicRadioButton);
		add(boldItalicRadioButton);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(plainRadioButton);
		radioGroup.add(boldRadioButton);
		radioGroup.add(italicRadioButton);
		radioGroup.add(boldItalicRadioButton);
		
		plainFont = new Font("Serif" , Font.PLAIN,14);
		boldFont = new Font("Serif" , Font.BOLD,14);
		italicFont = new Font("Serif" , Font.ITALIC,14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC , 14);
		textField.setFont(plainFont);
		
		plainRadioButton.addItemListener(new RadioButtonHandler(plainFont));
		boldRadioButton.addItemListener(new RadioButtonHandler(boldFont));
		italicRadioButton.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
		
		
		
	}
	
	private class RadioButtonHandler implements ItemListener
	{
		private Font font;
		public RadioButtonHandler(Font f)
		{
			font = f;
			
		}
		
		public void itemStateChanged(ItemEvent event)
		{
			textField.setFont(font);
			
		}
	}

}
