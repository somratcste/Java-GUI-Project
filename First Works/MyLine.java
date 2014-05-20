import java.awt.Color;
import java.awt.Graphics;

public class MyLine {
	private int xone;
	private int xtwo;
	private int yone;
	private int ytwo;
	private Color myColor;
	public MyLine(int xone, int yone, int xtwo , int ytwo , Color color)
	{
		this.xone= xone;
		this.yone=yone;
		this.xtwo = xtwo;
		this.ytwo=ytwo;
		myColor = color;
		
	}
	
	public void draw(Graphics g)
	{
		g.setColor(myColor);
		g.drawLine(xone, yone, xtwo, ytwo);
	}

}
