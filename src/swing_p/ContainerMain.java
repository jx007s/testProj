package swing_p;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContainerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1 = new JFrame("JPanel");
		
		f1.setBounds(0, 0, 300, 200);
		f1.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.pink);
		p1.setBounds(10, 10, 100, 130);
		
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.yellow);
		p2.setBounds(140, 10, 100, 130);
		
		for (int i = 0; i <10; i++) {
			p1.add(new JButton("버튼"+i));
			p2.add(new JButton("버튼"+i));
		}
		
		
		f1.add(p1);
		f1.add(p2);
		
		
		
		/////JScrollPane
		JFrame f2 = new JFrame("JScrollPane");
		f2.setBounds(300, 0, 300, 200);
		f2.setLayout(null);
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.pink);
		JPanel p4 = new JPanel();
		p4.setBackground(Color.yellow);
		p4.setLayout(new GridLayout(10, 1));
		for (int i = 0; i <10; i++) {
			p3.add(new JButton("버튼"+i));
			p4.add(new JButton("버튼"+i));
		}
		
		JScrollPane jp3 = new JScrollPane(p3);
		jp3.setBounds(10, 10, 100, 130);
		
		JScrollPane jp4 = new JScrollPane(p4);
		jp4.setBounds(140, 10, 100, 130);
		
		f2.add(jp3);
		f2.add(jp4);
		
		
		
	/////JDialog
			JFrame f3 = new JFrame("JScrollPane");
			f3.setBounds(0, 200, 300, 200);
			f3.setLayout(null);
			
			JDialog jd3 = new JDialog(f3, "메시지창", true);
			jd3.setBounds(10, 210, 200, 150);
			jd3.setLayout(new FlowLayout());
			jd3.add(new JLabel("경고다 경고"));
			jd3.add(new JButton("버튼버튼"));
			//f3.add(jd3);
			jd3.setVisible(true);
			
			
/////JDialog
			JFrame f4 = new JFrame("JScrollPane");
			f4.setBounds(300, 200, 300, 200);
			f4.setLayout(null);
			
			FileDialog fd = new FileDialog(f4, "파일열기",FileDialog.LOAD);
			//fd.setBounds(310, 210, 300, 200);
			fd.setLocation(200, 100);
			fd.setDirectory("F:\\lee");
			
			
			fd.setVisible(true);
			
			
			System.out.println(fd.getDirectory());
			System.out.println(fd.getFile());
			
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setVisible(true);
		
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f3.setVisible(true);
		
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f4.setVisible(true);
	}

}
