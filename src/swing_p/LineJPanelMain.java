package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import swing_p.CharPaintMain.ColorActionListen;

public class LineJPanelMain extends JFrame{
	int currCC;
	
	Graphics gg = null;
	
	Color [] cc = {
			Color.red,
			new Color(255, 187, 0),
			new Color(255, 255, 0),
			new Color(0,255,0),
			new Color(0,0,255),
			new Color(5,0,153),
			new Color(95,0,255),
			new Color(255,255,255),
			new Color(0,0,0)
	};
	
	class WorkArea extends JPanel  implements MouseMotionListener
	{
		int x=0, y=0;
		Image img =null;
		
		public WorkArea() {
			// TODO Auto-generated constructor stub

			addMouseMotionListener(this);
			
		}
		
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
			{
				gg.setColor(cc[currCC]);
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
		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			
			if(img==null)
			{
				img = createImage(400,300);
				gg = img.getGraphics();
				gg.setColor(Color.yellow);
				gg.fillRect(0, 0, 400, 300);
			}
			
			
			g.drawImage(img, 0, 0, this);
			
	
		}
	}
	
	class ColorActionListen implements ActionListener
	{
		int num;

		public ColorActionListen(int num) {
			super();
			this.num = num;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			currCC =num;
		}
	}
	
	
	public LineJPanelMain() {
		// TODO Auto-generated constructor stub
		currCC = cc.length-1;
		setBounds(0, 0, 600, 500);
		setLayout(null);
		
		JPanel ccPan = new JPanel();
		ccPan.setLayout(null);
		ccPan.setBounds(0, 400, 600, 100);
		for (int i =0; i<cc.length;i++) {
			JButton btn = new JButton();
			btn.setBounds(20+50*i, 0, 50, 50);
			btn.setBackground(cc[i]);
			ccPan.add(btn);
			btn.addActionListener(new ColorActionListen(i));
		}
		
		ccPan.setBackground(Color.pink);
		add(ccPan);
		
		WorkArea wa = new WorkArea();
		wa.setBounds(0, 0, 600, 400);
		add(wa);
		setVisible(true);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LineJPanelMain();
	}

}
