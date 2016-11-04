package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontMain extends JFrame{

	public FontMain() {
		// TODO Auto-generated constructor stub
		setBounds(0, 0, 500, 600);
		
		GraphicsEnvironment ge = 
				GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		Font [] fs = ge.getAllFonts();
		
		for (Font font : fs) {
			System.out.println(font.getFontName());
		}
		String str = "¼±»ý´ÔÀº ±Í¿©¿ö¿ä Love 1234567890";
		
		Font [] ffArr={
				new Font("Serif", Font.PLAIN, 20),
				new Font("Serif", Font.ITALIC, 20),
				new Font("Serif", Font.BOLD, 20),
				new Font("Serif", Font.ITALIC+Font.BOLD, 20),
				new Font("±¼¸²Ã¼", Font.PLAIN, 30),
				new Font("±Ã¼­Ã¼", Font.PLAIN, 40),
				new Font("±Ã¼­Ã¼", Font.ITALIC, 40)
				
		};
		
		Color [] ccArr ={
				Color.red,
				new Color(255, 0, 0),
				new Color(255, 0, 0, 120),
				new Color(0,0,255),
				new Color(255,255,0),
				new Color(255,255,255),
				new Color(0,0,0)
		};
		
		Color [] bbArr ={
				Color.red,
				new Color(255, 187, 0),
				new Color(255, 255, 0),
				new Color(0,255,0),
				new Color(0,0,255),
				new Color(5,0,153),
				new Color(95,0,255)
		};
		
		
		setLayout(new GridLayout(ffArr.length, 1));
		
		for (int i =0; i<ffArr.length;i++) {
			JLabel lb = new JLabel(str);
			lb.setFont(ffArr[i]);
			lb.setForeground(ccArr[i]);
			lb.setBackground(bbArr[i]);
			lb.setOpaque(true);
			add(lb);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontMain();
	}

}
