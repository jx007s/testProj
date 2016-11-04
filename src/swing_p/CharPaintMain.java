package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CharPaintMain extends JFrame implements MouseMotionListener{
	
	int x=0, y=0, kind=0, currCC;
	boolean chk = true;
	
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
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		chk = false;
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
		{
			kind=0;
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
		{
			kind=1;
		}
		repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public CharPaintMain() {
		// TODO Auto-generated constructor stub
		setBounds(0, 0, 600, 500);
		chk = true;
		setLayout(null);
		currCC = cc.length-1;
		
		for (int i =0; i<cc.length;i++) {
			JButton btn = new JButton();
			btn.setBounds(20+50*i, 400, 50, 50);
			btn.setBackground(cc[i]);
			add(btn);
			btn.addActionListener(new ColorActionListen(i));
		}
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseMotionListener(this);
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
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		//System.out.println("±×·Á¿ä");
		String str = x+","+y;
		//g.drawString(str, 10, 50);
		if(chk)
		{
			g.setColor(Color.yellow);
			g.fillRect(0, 0, 600, 500);
			
		}
		
		
		
		switch(kind)
		{
			case 0:
				g.setColor(cc[currCC]);
				g.drawString("*", x, y);
				break;
			case 1:
				g.setColor(Color.yellow);
				g.fillOval(x-50, y-50, 100,100);
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CharPaintMain();
	}

}
