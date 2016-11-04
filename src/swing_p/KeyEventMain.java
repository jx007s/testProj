package swing_p;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class KeyEventMain extends JFrame{

	JLabel icon = new JLabel();
	
	int life = 2;
	int xSize = 600, ySize = 500, meSize = 50, iconSize = 35;
	JMenuItem lifeTxt = new JMenuItem("생명:"+life);
	ArrayList<PacMan>pacArr = new ArrayList();
	int x=10, y=10, sp =10, rk = 1, rcnt=0, stopCnt=0;
	boolean chk = false;
	
	
	class PacMan extends JLabel
	{
		KeyEventMain main;
		
		int px, py, dx=5, dy=5;
		
		public PacMan(KeyEventMain main, String img) {
			// TODO Auto-generated constructor stub
			
			super(new ImageIcon(img));
			px = (int)(Math.random()*400+100);
			py = (int)(Math.random()*300+100);
			int buf = (int)(Math.random()*2);
			dx*=  buf>0 ? buf:-1;
			buf = (int)(Math.random()*2);
			dy*=  buf>0 ? buf:-1;
			setBounds(px, py, iconSize, iconSize);
			main.add(this);
			
		}
		
		boolean move()
		{
			
				px+=dx;
				py+=dy;
			
			if((x+meSize>=px && x<=px+iconSize) && (y+meSize>=py && y<=py+iconSize)){ 
				crash();
				pacArr.remove(this);
				this.setVisible(false);
				
				return true;
			}
			
			if(px<0 || px>=xSize-iconSize-15) dx*=-1;
			if(py<0 || py>=ySize-iconSize-65) dy*=-1;
			setLocation(px, py);
			
			return false;
		}
		
		void crash()
		{
			life--;
			lifeTxt.setText("생명:"+life);
			System.out.println("한방 먹었어");
			if(life<1)
				chk = true;
		}
	}
	
	
	class Item extends PacMan
	{
		int type =2;
		public Item(KeyEventMain main, String img) {
			// TODO Auto-generated constructor stub
			super(main, img);
			dx=3; dy=3;
			
			//type = (int)(Math.random()*3);
		}
		void crash()
		{
			switch(type)
			{
				case 0:
					System.out.println("생명 추가");
					life++;
					lifeTxt.setText("생명:"+life);
					break;
				case 1:
					rcnt = 60;
					rk=-1;
					break;
				case 2:
					stopCnt=60;
					break;
			}
			
			//chk = true;
		}
	}
	
	class Timer extends Thread
	{
		void rkCal()
		{
			if(rcnt>0)
				rcnt--;
			else{
				rcnt=0;
				rk=1;
			}
		}
		
		void stopCal()
		{
			if(stopCnt>0)
				stopCnt--;
			else{
				stopCnt=0;
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			ww:while(true)
			{
				try {
					sleep(meSize);
					
					rkCal();
					stopCal();
					for (PacMan pacMan : pacArr) {
						
						if(pacMan.move()) break;
						if(chk) break ww;
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("게임종료");
			dispose();
		}
		
	}
	
	
	public KeyEventMain() {
		// TODO Auto-generated constructor stub
		setBounds(0, 0, xSize, ySize);
		setLayout(null);
		icon.setBounds(x,y, meSize, meSize);
		icon.setBackground(Color.green);
		icon.setOpaque(true);
		add(icon);
		
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		mb.add(lifeTxt);
		
		pacArr.add(new PacMan(this,"img/packman.png"));
		pacArr.add(new PacMan(this,"img/packman.png"));
		pacArr.add(new PacMan(this,"img/packman.png"));
		pacArr.add(new PacMan(this,"img/packman.png"));
		pacArr.add(new PacMan(this,"img/packman.png"));
		pacArr.add(new Item(this,"img/qq.png"));
		pacArr.add(new Item(this,"img/qq.png"));
		
		setVisible(true);
		addWindowListener(new WinClose());
		addKeyListener(new MyKey());
		new Timer().start();
	}
	
	class MyKey extends KeyAdapter
	{
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
			//System.out.println(e.getKeyCode());
			if(stopCnt==0)
			{
				switch(e.getKeyCode())
				{
					case KeyEvent.VK_S:
						sp+=4;
						if(sp>meSize) sp =meSize;
						break;
					case KeyEvent.VK_D:
						sp-=4;
						if(sp<4) sp =4;
					break;
					case KeyEvent.VK_LEFT:x-=sp*rk;break;
					case KeyEvent.VK_RIGHT:x+=sp*rk;break;
					case KeyEvent.VK_UP:y-=sp*rk;break;
					case KeyEvent.VK_DOWN:y+=sp*rk;break;
				}
			}
			
			System.out.println(icon.getX()+","+icon.getY());
			
			if(x<0) x=0;
			if(x>xSize-meSize-15) x = xSize-meSize-15;
			if(y<0) y=0;
			if(y>ySize-meSize-65) y = ySize-meSize-65;
			icon.setLocation(x, y);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventMain();
	}

}
