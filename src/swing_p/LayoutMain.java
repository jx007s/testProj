package swing_p;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LayoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f1 = new JFrame("BorderLayout");
		f1.setBounds(0, 0, 300, 200);
		f1.setLayout(new BorderLayout());
		f1.add(new JButton("북쪽이다!"),"North");
		f1.add(new JButton("동쪽이다!"),"East");
		f1.add(new JButton("서쪽이다!"),"West");
		f1.add(new JButton("남쪽이다!"),"South");
		f1.add(new JButton("중앙이다!"),"Center");
		
		
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
/////////////////////////
		JFrame f2 = new JFrame("FlowLayout");
		f2.setBounds(300, 0, 300, 200);
		f2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		for (int i = 0; i < 10; i++) {
			f2.add(new JButton("버튼"+i));
		}

		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
/////////////////////////
		JFrame f3 = new JFrame("GridLayout");
		f3.setBounds(600, 0, 300, 200);
		f3.setLayout(new GridLayout(3, 2));
		for (int i = 0; i < 10; i++) {
			f3.add(new JButton("버튼"+i));
		}

		f3.setVisible(true);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
/////////////////////////
		JFrame f4 = new JFrame("BoxLayout");
		f4.setBounds(0,200, 300, 200);
		f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.Y_AXIS));
		for (int i = 0; i < 10; i++) {
			f4.add(new JButton("버튼"+i));
		}

		f4.setVisible(true);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
/////////////////////////
		JFrame f5 = new JFrame("CardLayout");
		f5.setBounds(300,200, 300, 200);
		
		CardLayout card = new CardLayout();
		f5.setLayout(card);
		
		//패널배경색배열
		Color [] bbArr ={
				Color.red,
				new Color(255, 187, 0),
				new Color(255, 255, 0),
				new Color(0,255,0),
				new Color(0,0,255),
				new Color(5,0,153),
				new Color(95,0,255)
		};
		
		//패널별칭 배열
		String [] ppName = {
				"redPP",
				"orangePP",
				"yellowPP",
				"greenPP",
				"bluePP",
				"navyPP",
				"purplePP"};
		
		//패널배열
		JPanel [] ppArr = new JPanel[bbArr.length];
		for (int i = 0; i < ppArr.length; i++) {
			ppArr[i] = new JPanel();
			ppArr[i].setBackground(bbArr[i]);
			f5.add(ppName[i],ppArr[i]);
					//패널별칭, 패널
		}
		
		///원하는 패널을 보이게 한다.
		card.show(f5.getContentPane(), "greenPP");
		

		f5.setVisible(true);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
/////////////////////////
		JFrame ff = new JFrame("종합");
		ff.setBounds(600, 200, 300, 200);
		ff.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		//p1.setLayout(new FlowLayout());
		GridLayout gr = new GridLayout(4, 5);
		p2.setLayout(gr);
		gr.setHgap(3);
		gr.setVgap(3);
		
		p1.setBackground(Color.cyan);
		p2.setBackground(Color.yellow);
		
		p1.add(new JLabel("ID"));
		p1.add(new JTextField(10));
		p1.add(new JLabel("PW"));
		p1.add(new JPasswordField(10));
		
		//Insets iss = new Insets(3, 3, 3, 3);
		
		for (int i = 0; i < 20; i++) {
			JButton btn = new JButton(((char)('A'+i))+"");
			//btn.setMargin(iss);
			p2.add(btn);
		}
		
		
		ff.add(p1,"North");
		ff.add(p2);
		
		
		
		ff.setVisible(true);
		ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
