import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class MyLineDrawPanel extends JPanel {
	private Random randomnumbers = new Random();
	private MyLine[] lines;
	//array of lines 
	
	public MyLineDrawPanel ()
	{
		setBackground(Color.WHITE);
		lines = new MyLine [5 + randomnumbers.nextInt(5)];
		
		//creates lines 
		
		for (int count=0 ; count< lines.length ; count++)
		{
			int xone=randomnumbers.nextInt(300);
			int yone=randomnumbers.nextInt(300);
			int xtwo = randomnumbers.nextInt(300);
			int ytwo=randomnumbers.nextInt(300);
			
			Color color= new Color (randomnumbers.nextInt(256) , 
					randomnumbers.nextInt(256) , randomnumbers.nextInt(256));
			
			lines[count] = new MyLine(xone, yone, xtwo , ytwo , color);
		}
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(MyLine line : lines)
			line.draw(g);
	}
	

}
