package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.naming.SizeLimitExceededException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import javafx.scene.control.ScrollBar;

class WinCC extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		e.getWindow().dispose();
	}
}

public class CanvasMain extends JFrame {
	
	static String title = "�׸���";
	
	int width = 900, height = 800;
	int brushFlag = 0;
	
	JMenuBar menuBar = new JMenuBar();
	JMenu mn_Figure = new JMenu("����");
	JMenu mn_Edit = new JMenu("����");
	JMenu mn_edit_brush = new JMenu("�귯��");
	JLabel ccLabel = new JLabel();
	
	ArrayList<JCheckBoxMenuItem> edit_list = new ArrayList<>();
	ArrayList<JCheckBoxMenuItem> figure_list = new ArrayList<>();
	
	String[] editArr = {"��", "�⺻", "��", "��Ʈ"};
	String[] figurArr = {"��", "��", "�簢��"};
	
	ButtonGroup btng = new ButtonGroup();
	int brushSize = 2;	// �귯�� ũ��
	Graphics gg = null;
	JPanel size_color;
	JScrollBar sizeScroll;
	int [] colorArr = {0,0,0,255};
	/*Color [] colorArr = {
			new Color(255, 0, 0),
			new Color(255, 187, 0),
			new Color(255, 255, 0),
			new Color(0,255,0),
			new Color(0,0,255),
			new Color(5,0,153),
			new Color(95,0,255),
			new Color(255,255,255),
			new Color(0,0,0)
	};*/
	
	public CanvasMain() {
		// TODO Auto-generated constructor stub
		super(title);
		setBounds(200, 30, width, height);
		setLayout(null);
		
		setJMenuBar(menuBar);
		
		
		
		init();
		
		CanvasArea ca = new CanvasArea();
		ca.setBounds(0, 100, width, height);
		
		
		size_color = new JPanel(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.setColor(Color.white);
				g.fillRect(0, 0, 300,100);
				g.setColor(Color.BLACK);
				g.fillOval(0, 10, brushSize*10, brushSize*10);
			}
		};
		size_color.setLayout(null);
		size_color.setBounds(width-300, 0, 300, 100);
		size_color.setBackground(Color.white);
		
		
		
		JPanel pn_color = new JPanel();
		pn_color.setLayout(null);
		pn_color.setBounds(0, 0, width-300, 100);
		pn_color.setBackground(Color.white);
		
		ccLabel.setBackground(Color.BLACK);
		ccLabel.setBounds(20, 10, 80, 80);
		ccLabel.setOpaque(true);
		pn_color.add(ccLabel);
		
		JScrollBar [] ccScroll = new JScrollBar[colorArr.length];
		
		
		for (int i = 0; i < ccScroll.length; i++) {
			JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL, colorArr[i], 10, 0, 265);
			
			bar.setBounds(200, i*20, 300, 20);
			pn_color.add(bar);
			bar.addAdjustmentListener(new ColorAdjust(i));
		}
		
		 
		sizeScroll = 
				new JScrollBar(JScrollBar.HORIZONTAL,brushSize , 10, 1, 20);
		sizeScroll.setBounds(200, 80, 200, 20);
		pn_color.add(sizeScroll);
		
		sizeScroll.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(e.getValue());
				brushSize=e.getValue();
				size_color.repaint();
			}
		});
		//sizeScroll.addAdjustmentListener(new ColorAdjust(i));
		
		
		/*for (int i =0; i<colorArr.length;i++) {
			JButton btn = new JButton();
			btn.setBounds(100+75*i, 20, 70, 50);
			btn.setBackground(colorArr[i]);
			pn_color.add(btn);
			btn.addActionListener(new BtnAction(colorArr[i]));
		}*/
		add(ca);
		add(pn_color);
		add(size_color);
		
		setVisible(true);
		addWindowListener(new WinCC());
	}
	
	
	
	
	class ColorAdjust implements AdjustmentListener{
		int i;

		public ColorAdjust(int i) {
			super();
			this.i = i;
		}
		
		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			// TODO Auto-generated method stub
			colorArr[i]=e.getValue();
			Color curr = new Color(colorArr[0],colorArr[1], colorArr[2], colorArr[3]);
			gg.setColor(curr);
			ccLabel.setBackground(curr);
		}
	}
	
	void init(){
		for (int i = 0; i< editArr.length; i++) {
			JCheckBoxMenuItem cb = new JCheckBoxMenuItem(editArr[i]);
			edit_list.add(cb);
			btng.add(cb);
			if(i == 0)	mn_Edit.add(edit_list.get(i));
			else		mn_edit_brush.add(edit_list.get(i));
			cb.addActionListener(new BtnAction());
		}
		for (int i = 0; i < figurArr.length; i++) {
			JCheckBoxMenuItem cb = new JCheckBoxMenuItem(figurArr[i]);
			figure_list.add(cb);
			btng.add(cb);
			mn_Figure.add(cb);
			cb.addActionListener(new BtnAction());
		}
		edit_list.get(0).setSelected(true);
		
		menuBar.add(mn_Edit);
		menuBar.add(mn_Figure);
		mn_Edit.add(mn_edit_brush);
	}
	
	class CanvasArea extends JPanel implements MouseMotionListener, MouseWheelListener{
		
		int x1, y1, x2, y2;	// ��ǥ ����
		int buf_x1, buf_y1, buf_x2, buf_y2;	// x�� y�� �ӽ÷� ���� ��ǥ ����
		
		Image img = null;
		
		public CanvasArea() {
			// TODO Auto-generated constructor stub
			addMouseMotionListener(this);
			addMouseWheelListener(this);
			addMouseListener(new MyMouse());
		}

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			
			buf_x1 = x1;
			buf_y1 = y1; // �巡���ϴ� ���� ��ǥ�� ��� ���ϱ⶧���� buf�� ��Ƶд�.
			buf_x2 = x2;
			buf_y2 = y2;
			
			if (img == null) { // �� ó���� ����.
				img = createImage(width, height - 100);
				gg = img.getGraphics();
				gg.setColor(Color.white);	// �׸� �׸� ���� ��
				gg.fillRect(0, 0, width, height - 100);
				gg.setColor(Color.black);	// ���� ��
			}
			
			g.drawImage(img, 0, 0, this); // ���� ���� �ִ� img�� �ҷ��� �̹����� �׸���.
			
			System.out.println(x1+" "+y1+" "+x2+" "+y2);
			
			// ���콺�� drag �Ǵ� ���� g�� �׸��� �׸���. (������ �׷����� �ִ� �κ�.)
			for (int i = 0; i < figure_list.size(); i++) {
				if (figure_list.get(i).getState()) {
					if (i == 0) // ��
						g.drawLine(x1, y1, x2, y2);
					if(x1 > x2){
						buf_x1 = x2;
						buf_x2 = x1;
					}
					if(y1 > y2){
						buf_y1 = y2;
						buf_y2 = y1;
					}
					if (i == 1) // ��
						g.drawArc(buf_x1, buf_y1, buf_x2 - buf_x1, buf_y2 - buf_y1, 135, 360);
					if (i == 2) // �簢��
						g.drawRect(buf_x1, buf_y1, buf_x2 - buf_x1, buf_y2 - buf_y1);
				}
			}
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
			int[][] brushArr = brush(brushFlag); 
			
			if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
				x2 = e.getX();
				y2 = e.getY();
				for (int i = 0; i < edit_list.size(); i++) {
					if(edit_list.get(i).getState()){	// ���̳� �귯�� �϶�.
						if(i == 0)	// ��
							gg.drawLine(x1, y1, x2, y2);
						else if(i == 1)	// �⺻ �귯��
							gg.fillOval(x1, y1, 10*brushSize, 10*brushSize);
						else		// ���̳� ��Ʈ �귯��
							gg.drawPolygon(
									brushArr[0],
									brushArr[1],
									brushArr[0].length
									);
						x1 = e.getX();	// ���̳� �귯���϶� �巡�� �ϴ� ���� ��ǥ�� �޾ƿ�.
						y1 = e.getY();
					}
				}
			}
			
			if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK){
				gg.setColor(Color.white);	// ���찳
				gg.fillOval(e.getX()-25, e.getY()-25, 50,50);
			}
			repaint();	// gg�� �׷��� �׸��� �׸���.
		}
		
		@Override	// �Ƚ�~
		public void mouseMoved(MouseEvent e) {}	
		
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			brushSize+=e.getWheelRotation()*-1;	// �귯�� ũ�� ����
			if(brushSize <= 1)
				brushSize = 1;
			if(brushSize >= 10)
				brushSize = 10;
			
			size_color.repaint();
			sizeScroll.setValue(brushSize);
		}
		
		/**
		 * CanvasArea�� �̳�Ŭ����. ���콺����͸� ���.
		 */
		class MyMouse extends MouseAdapter {

			@Override
			public void mousePressed(MouseEvent e) { // ������
				// TODO Auto-generated method stub
				x1 = e.getX(); // Ŀ���� ��ǥ�� �޴´�.
				y1 = e.getY();
			}

			@Override
			public void mouseReleased(MouseEvent e) { // ����
				// TODO Auto-generated method stub

				for (int i = 0; i < figure_list.size(); i++) {
					if (figure_list.get(i).getState()) { // ������ �׸� ��
						
						if (i == 0) // ��				// �巡�׸� �ϸ鼭 ��ǥ�� ����߱� ������ �ٷ� �ִ´�.
							gg.drawLine(x1, y1, x2, y2);
						if (i == 1) // ��
							gg.drawArc(buf_x1, buf_y1, buf_x2 - buf_x1, buf_y2 - buf_y1, 135, 360);
						if (i == 2) // �簢��
							gg.drawRect(buf_x1, buf_y1, buf_x2 - buf_x1, buf_y2 - buf_y1);
					}
				}
				repaint(); // gg�� �׷��� �׸��� ���� ����.
			}
		}

		int[][] brush(int index) {	// �귯���� �����ϴ� �޼ҵ�.
			int[][][] brushArr = {
					{	// �����
						{x1, x1+2*brushSize, x1+9*brushSize, x1+4*brushSize, x1+6*brushSize, 
							x1, x1-6*brushSize, x1-4*brushSize, x1-9*brushSize, x1-2*brushSize}, 
						
						{y1, y1+8*brushSize, y1+8*brushSize, y1+12*brushSize, y1+19*brushSize, 
								y1+15*brushSize, y1+19*brushSize, y1+12*brushSize, y1+8*brushSize, y1+8*brushSize}
					},
					{	// ��Ʈ
						{x1, x1+2*brushSize, x1+5*brushSize, x1+7*brushSize, x1+9*brushSize, x1+9*brushSize, 
							x1+8*brushSize, x1+6*brushSize, x1+3*brushSize, x1, x1-3*brushSize, x1-6*brushSize, 
							x1-8*brushSize, x1-9*brushSize, x1-9*brushSize, x1-7*brushSize, x1-5*brushSize, x1-2*brushSize}, 
						
						{y1, y1-1*brushSize, y1-2*brushSize, y1-1*brushSize, y1+2*brushSize, y1+6*brushSize, y1+9*brushSize, 
								y1+12*brushSize, y1+15*brushSize, y1+16*brushSize, y1+15*brushSize, y1+12*brushSize, 
								y1+9*brushSize, y1+6*brushSize, y1+2*brushSize, y1-1*brushSize, y1-2*brushSize, y1-1*brushSize}
					}};
			return brushArr[index];
		}
	}

	class BtnAction implements ActionListener{
		
		Color cc;
		
		public BtnAction() {
			// TODO Auto-generated constructor stub
		}
		public BtnAction(Color cc) {
			// TODO Auto-generated constructor stub
			this.cc = cc;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			gg.setColor(cc);	// �̺�Ʈ �߻� �� ��ư�� ���� �� �ٲ�.
			
			for (int i = 0; i < edit_list.size(); i++) {
				if (e.getSource().equals(edit_list.get(i)) && i >= 2)
					brushFlag = i-2;	// ���̳� ��Ʈ �귯�� �϶�.
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CanvasMain();
	}
}
