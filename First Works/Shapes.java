import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
	private int choice;
	
	public Shapes(int userChoice)
	
	{
		choice=userChoice;
	}
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		int height=getHeight();
		int width=getWidth();
		int m=height/2;
		int n=width/2;
		for (int i=0;i<=m;i+=10)
		{
			switch (choice )
			{
			case 1:
				g.drawRect(m-i, n-i, 10+i*2, 10+i*2);
				break;
			case 2 : 
				g.drawOval(10+i *10, 10+i*10, 50+i*10, 50+i*10);
				break;
			case 3 : 
				g.drawOval(m-i, n-i, 10+i*2, 10+i*2);
				break;
				
			}
		}
	}

}
