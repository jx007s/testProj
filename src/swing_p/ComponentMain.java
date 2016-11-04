package swing_p;

import java.awt.Color;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ComponentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ff = new JFrame("회원가입");
		/*ff.setSize(600, 500);
		ff.setLocation(100, 200);*/
		ff.setBounds(100, 200, 600, 500);
		ff.setLayout(null);
		
		JButton b1 = new JButton("버튼1");
		b1.setBackground(Color.pink);
		b1.setForeground(Color.green);
		b1.setBounds(10, 30, 100, 30);
		
		JButton b2 = new JButton("버튼2");
		b2.setBackground(Color.pink);
		b2.setEnabled(false);
		b2.setBounds(120, 30, 100, 30);
		
		
		ImageIcon icon = new ImageIcon("img/one.jpeg");
		JButton b3 = new JButton(icon);
		b3.setBackground(Color.pink);
		b3.setBounds(10, 70, 100, 100);
		
		
		JButton b4 = new JButton("버튼4",icon);
		b4.setForeground(Color.blue);
		b4.setVerticalTextPosition(0);
		b4.setHorizontalTextPosition(0);
		b4.setBounds(120, 70, 100, 100);
		
		ff.add(b1);
		ff.add(b2);
		ff.add(b3);
		ff.add(b4);
		
		ButtonGroup bg = new ButtonGroup();
		JToggleButton [] tb = new JToggleButton[3];
		
		for (int i = 0; i < tb.length; i++) {
			tb[i] = new JToggleButton("토글"+i);
			tb[i].setBounds(30+i*100, 180, 80, 30);
			ff.add(tb[i]);
			bg.add(tb[i]);
		}
		tb[1].setSelected(true);
		
		
		Vector<String> emailArr = new Vector<>();
		emailArr.add("다음");
		emailArr.add("네이버");
		emailArr.add("구글");
		
		JComboBox email = new JComboBox<>(emailArr);
		email.setBounds(30, 220, 100, 30);
		/*email.addItem("다음");
		email.addItem("네이버");
		email.addItem("구글");*/
		email.setSelectedItem("네이버");
		ff.add(email);
		
		String [] listData = {"의사","판사","안사","못사","왜사"};
		
		
		JList job = new JList<>(listData);
		job.setBounds(140, 220, 100,100);
		job.setSelectedValue("안사", false);
		ff.add(job);
		
		JLabel hb = new JLabel("취미");
		hb.setBounds(30, 330, 40, 30);
		ff.add(hb);
		
		String [] hArr = {"코딩","디버깅","스터디","과제"};
		JCheckBox [] hbox = new JCheckBox[hArr.length];
		
		for (int i = 0; i < hbox.length; i++) {
			hbox[i] = new JCheckBox(hArr[i]);
			hbox[i].setBounds(80+i*70, 330, 60, 30);
			ff.add(hbox[i]);
		}
		hbox[1].setSelected(true);
		hbox[2].setSelected(true);
		
		
		JLabel gender = new JLabel("성별");
		gender.setBounds(30, 370, 40, 30);
		ff.add(gender);
		
		ButtonGroup genbg = new ButtonGroup();
		String [] genArr = {"남자","여자","개발자"};
		JRadioButton [] genRadio = new JRadioButton[genArr.length];
		
		for (int i = 0; i < genRadio.length; i++) {
			genRadio[i] = new JRadioButton(genArr[i]);
			genRadio[i].setBounds(80+i*70, 370, 60, 30);
			ff.add(genRadio[i]);
			genbg.add(genRadio[i]);
		}
		genRadio[1].setSelected(true);
		genRadio[2].setSelected(true);
		
		JTextField id = new JTextField("어른디를 입력하세요");
		id.setBounds(300, 20, 100, 30);
		ff.add(id);
		
		JPasswordField pw = new JPasswordField();
		pw.setBounds(410, 20, 100, 30);
		ff.add(pw);
		
		
		JTextArea ta = new JTextArea("남기실 말");
		//ta.setBounds(410, 130, 100, 100);
		//ff.add(ta);
		
		
		JScrollPane taJS = new JScrollPane(ta);
		taJS.setBounds(410, 130, 100, 100);
		ff.add(taJS);
		
		String [][]rowData = {
				{"김태희","010-1111-1111","37"},
				{"이다혜","010-2222-2222","34"},
				{"수지","010-3333-3333","23"},
				{"신민아","010-4444-4444","33"}
				};
		
		String [] columnNames = {"성별","전화번호","나이"};
		JTable tt = new JTable(rowData, columnNames);
		//tt.setBounds(410, 240, 180, 100);
		//ff.add(tt);
		JScrollPane ttJS = new JScrollPane(tt);
		ttJS.setBounds(410, 240, 170, 100);
		ff.add(ttJS);
		
		ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ff.setVisible(true);
	}

}
