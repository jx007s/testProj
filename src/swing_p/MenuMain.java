package swing_p;

import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuMain extends JFrame{

	public MenuMain() {
		// TODO Auto-generated constructor stub
		super("메뉴");
		
		setBounds(0, 0, 300, 200);
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m_1 = new JMenu("파일");
		JMenu m_2 = new JMenu("편집");
		JMenu m_3 = new JMenu("보기");
		
		ImageIcon icon = new ImageIcon("img/one.jpeg");
		m_1.add(new JMenuItem("새로만들기",icon));
		JMenu m_1_2 = new JMenu("개로만들기");
		m_1.add(m_1_2);
		m_1_2.add(new JMenuItem("진돗개"));
		m_1_2.add(new JMenuItem("풍산개"));
		
		
		JMenuItem m_1_2_3 = new JMenuItem("아무개");
		m_1_2.add(m_1_2_3);
		m_1_2.setText("가로 만들기");
		m_1_2_3.setAccelerator(
				KeyStroke.getKeyStroke(
						KeyEvent.VK_D, KeyEvent.CTRL_MASK)
				);
		
		m_1.addSeparator();
		m_1.add(new JMenuItem("종료"));
		
		JMenuItem m_2_1 = new JMenuItem("용지");
		JMenuItem m_2_2 = new JMenuItem("인쇄방향");
		m_2_1.setEnabled(false);
		m_2_2.setSelected(true);
		
		m_2.add(m_2_1);
		m_2.add(m_2_2);
		
		JCheckBoxMenuItem m_3_1 = new JCheckBoxMenuItem("안내선");
		JCheckBoxMenuItem m_3_2 = new JCheckBoxMenuItem("격자");
		m_3_1.setSelected(true);
		m_3.add(m_3_1);
		m_3.add(m_3_2);
		
		 ButtonGroup bg = new ButtonGroup();
		JRadioButtonMenuItem m_3_3 = new JRadioButtonMenuItem("모니터");
		JRadioButtonMenuItem m_3_4 = new JRadioButtonMenuItem("재환이컴");
		JRadioButtonMenuItem m_3_5 = new JRadioButtonMenuItem("문구마우스");
		m_3.add(m_3_3);
		m_3.add(m_3_4);
		m_3.add(m_3_5);
		bg.add(m_3_3);
		bg.add(m_3_4);
		bg.add(m_3_5);
		
		
		mb.add(m_1);
		mb.add(m_2);
		mb.add(m_3);
		mb.add(new JMenuItem("도움말"));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuMain();
	}

}

