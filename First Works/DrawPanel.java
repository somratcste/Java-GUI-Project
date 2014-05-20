import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int width=getWidth();
		int height=getHeight();
		int wtwo=width/2;
		int htwo=height/2;
		
		g.drawLine(0, 0, htwo, wtwo);
		g.drawLine(0,height,width,0);
		
	}
		

}
