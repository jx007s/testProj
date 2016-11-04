package swing_p;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintMain extends JFrame{

	public PaintMain() {
		// TODO Auto-generated constructor stub
		setBounds(0, 0, 600, 500);
		System.out.println("생성자");
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("그려요");
		super.paint(g);
		g.setColor(Color.pink);
		g.drawString("한수야 알았다", 10,50);
		g.setColor(Color.blue);
		g.fillRect(20, 100, 200, 100);
		g.setColor(Color.red);
		g.drawOval(30, 120, 150, 100);
		g.fillRoundRect(30, 280, 200, 100, 100, 50);
		g.setColor(Color.green);
		g.drawLine(20, 100, 200, 200);
		
		g.fillArc(30,400,100,100,45,90);
		g.fillPolygon(
				new int[]{380,470,580,350},
				new int[]{200,150,300,250},
				4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintMain();
	}

}
