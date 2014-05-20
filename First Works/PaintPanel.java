import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel{
	
	private int pointCount =0 ;
	private Point[] points = new Point[10000];
	
	public PaintPanel()
	{
		addMouseMotionListener(
				new MouseMotionAdapter()
				{
					public void mouseDragged(MouseEvent event)
					{
						if(pointCount < points.length)
						{
							points[pointCount] = event.getPoint();
							++pointCount;
							repaint();
						}
					}
				}
				) ;
		
		
	}
	
	public void paintComponenet(Graphics g)
	{
		super.paintComponent(g);
		
		for(int i=0 ; i < pointCount ; i ++ )
			g.fillOval(points[i].x, points[i].y, 4, 4);
	}
	

}
