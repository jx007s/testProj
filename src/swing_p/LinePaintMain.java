package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class LinePaintMain extends JFrame implements MouseMotionListener{
	
	int x=0, y=0;
	Image img =null;
	Graphics gg = null;
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
		{
			gg.setColor(Color.black);
			//gg.drawString("*", x, y);
			gg.drawLine(x, y, e.getX(), e.getY());
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
		{
			gg.setColor(Color.yellow);
			gg.fillOval(e.getX()-50, e.getY()-50, 100,100);
		}
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
	}
	
	public LinePaintMain() {
		// TODO Auto-generated constructor stub
		setBounds(0, 0, 600, 500);
		
		setVisible(true);
		
		img = createImage(400,300);
		gg = img.getGraphics();
		gg.setColor(Color.yellow);
		gg.fillRect(0, 0, 400, 300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseMotionListener(this);
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		g.drawImage(img, 0, 0, this);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LinePaintMain();
	}

}
