package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventMain extends JFrame implements MouseMotionListener,MouseListener{

	JLabel me = new JLabel();
	JLabel txt = new JLabel("마우스방향:");
	int x=0,y=0;
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("드래그 :"+e.getX()+","+e.getY());
		
		String xx = ">", yy="V";
		if(e.getX()<x) xx="<";
		if(e.getY()<y) yy="^";
		txt.setText("마우스방향:"+xx+","+yy);
		
		x=e.getX();
		y=e.getY();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("이동 :"+e.getX()+","+e.getY());
		x=e.getX();
		y=e.getY();
		me.setLocation(x-25, 400);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Clicked");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Exited");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Entered");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Released");
	}
	
	public MouseEventMain() {
		// TODO Auto-generated constructor stub
		
		setBounds(0, 0, 600, 500);
		setLayout(null);
		me.setBounds(x, 400, 50,50);
		me.setBackground(Color.green);
		me.setOpaque(true);
		add(me);
		
		txt.setBounds(20, 20, 100,30);
		
		
		add(txt);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventMain();
	}

}
