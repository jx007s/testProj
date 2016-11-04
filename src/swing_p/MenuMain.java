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
		super("�޴�");
		
		setBounds(0, 0, 300, 200);
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m_1 = new JMenu("����");
		JMenu m_2 = new JMenu("����");
		JMenu m_3 = new JMenu("����");
		
		ImageIcon icon = new ImageIcon("img/one.jpeg");
		m_1.add(new JMenuItem("���θ����",icon));
		JMenu m_1_2 = new JMenu("���θ����");
		m_1.add(m_1_2);
		m_1_2.add(new JMenuItem("������"));
		m_1_2.add(new JMenuItem("ǳ�갳"));
		
		
		JMenuItem m_1_2_3 = new JMenuItem("�ƹ���");
		m_1_2.add(m_1_2_3);
		m_1_2.setText("���� �����");
		m_1_2_3.setAccelerator(
				KeyStroke.getKeyStroke(
						KeyEvent.VK_D, KeyEvent.CTRL_MASK)
				);
		
		m_1.addSeparator();
		m_1.add(new JMenuItem("����"));
		
		JMenuItem m_2_1 = new JMenuItem("����");
		JMenuItem m_2_2 = new JMenuItem("�μ����");
		m_2_1.setEnabled(false);
		m_2_2.setSelected(true);
		
		m_2.add(m_2_1);
		m_2.add(m_2_2);
		
		JCheckBoxMenuItem m_3_1 = new JCheckBoxMenuItem("�ȳ���");
		JCheckBoxMenuItem m_3_2 = new JCheckBoxMenuItem("����");
		m_3_1.setSelected(true);
		m_3.add(m_3_1);
		m_3.add(m_3_2);
		
		 ButtonGroup bg = new ButtonGroup();
		JRadioButtonMenuItem m_3_3 = new JRadioButtonMenuItem("�����");
		JRadioButtonMenuItem m_3_4 = new JRadioButtonMenuItem("��ȯ����");
		JRadioButtonMenuItem m_3_5 = new JRadioButtonMenuItem("�������콺");
		m_3.add(m_3_3);
		m_3.add(m_3_4);
		m_3.add(m_3_5);
		bg.add(m_3_3);
		bg.add(m_3_4);
		bg.add(m_3_5);
		
		
		mb.add(m_1);
		mb.add(m_2);
		mb.add(m_3);
		mb.add(new JMenuItem("����"));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuMain();
	}

}

