package swing_p;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalcExam extends JFrame {

	JFrame ff = new JFrame("계산기");
	JPanel lcd = new JPanel(new GridLayout(2, 1));
	JPanel btpn = new JPanel();
	JLabel a1 = new JLabel("", JLabel.RIGHT);
	JLabel a2 = new JLabel("0", JLabel.RIGHT);
	JButton bt = new JButton();
	GridLayout gr = new GridLayout(5, 4);
	String[] btArr = { "CE", "C", "←", "÷", "X", "-", "+", "±", ".", "=" };
	String log1 = "";
	String log2 = "";
	double a = 0;
	double ires = 0;
	String sres = "";
	String lastCommand = null;
	
	ArrayList<String> str = new ArrayList<>();
	ArrayList<String> chk = new ArrayList<>();

	void datainit() {
		lcd.add(a1);
		lcd.add(a2);

		for (int i = 0; i < btArr.length; i++) {
			bt = new JButton(btArr[i] + "");
			btpn.add(bt);
			bt.addActionListener(new CalcAction(btArr[i]));
		}

		for (int i = 0; i < 10; i++) {
			bt = new JButton(i + "");
			btpn.add(bt);
			bt.addActionListener(new CalcAction(i));
		}
		ff.add(lcd, "North");
		ff.add(btpn);
	}

	class CalcAction implements ActionListener {
		
		String ys;
		
		int kind;

		public CalcAction(int vv) {
			super();
			ys = vv+"";
			kind = 0;	
		}

		public CalcAction(String ys) {
			super();
			this.ys = ys;
			kind = 1;	
		}

		void calc(String ys) {
			
			if(lastCommand!=null)
			{
				switch (lastCommand) {
				case "+":
					
					ires += a;
					break;
	
				case "-":
					ires -= a;
					break;
	
				case "X":
					
					ires *= a;
					break;
	
				case "÷":
					ires /= a;
					break;
				}
			}else{
				ires = a;
			}
			lastCommand = ys;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			log1 += ys;
			a1.setText(log1);

			if (kind == 0) {
				log2 += ys;
				a2.setText(log2);
				a = Integer.parseInt(log2);
				
			}

			if (kind != 0) {
				System.out.println(a);
				log2 = "";
				a2.setText("0");

				if (!Pattern.matches("[=|CE]", ys)) {
					System.out.println("뭐지?");
					calc(ys);
					lastCommand = ys;
					sres = ires + "";
					a2.setText(sres);
				} else {

					switch (ys) {
					case "=":
						calc(null);

						sres = ires + "";
						a2.setText(sres);
						break;

					case "CE":
						a2.setText("0");
						
					}
					a1.setText("");
					log1 = "";
					log2 = "";
					lastCommand = null;
					ires = 0;

				}
				a = 0;
			}
			
		}
	}

	public CalcExam() {
		// TODO Auto-generated constructor stub

		ff.setBounds(600, 200, 300, 400);
		ff.setLayout(new BorderLayout());
		Font f1 = new Font("보통", Font.BOLD, 15);
		Font f2 = new Font("보통", Font.BOLD, 30);
		a1.setFont(f1);
		a2.setFont(f2);
		gr.setHgap(10);
		gr.setVgap(10);
		btpn.setLayout(gr);

		datainit();

		ff.setVisible(true);
		ff.addWindowListener(new WinClose());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalcExam();
	}
}