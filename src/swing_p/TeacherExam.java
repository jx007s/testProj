package swing_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*class BtnLiten implements ActionListener
{
	TeacherExam exam;
	
	public BtnLiten(TeacherExam exam) {
		super();
		this.exam = exam;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��ư�� ��������?");
		
		int jum =0;
		
		for (JCheckBox box : exam.qq_1) {
			if(box.isSelected())
				jum+=20;
		}
		if(exam.qq_2.get(2).isSelected())
			jum+=20;
		
		exam.res.setText("���:"+jum);
	}
}

class ExamTimer extends Thread
{
	TeacherExam exam;

	public ExamTimer(TeacherExam exam) {
		super();
		this.exam = exam;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 10; i >=0; i--) {
			try {
				sleep(1000);
				exam.timer.setText("�ð�:"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		exam.timer.setText("�ð�����");
		exam.btn.setEnabled(false);
	}
	
}*/

public class TeacherExam extends JFrame implements ActionListener{

	ArrayList<JCheckBox> qq_1 = new ArrayList<>();
	ArrayList<JRadioButton> qq_2 = new ArrayList<>();
	JLabel res = new JLabel("���:");
	JLabel timer = new JLabel();
	JButton btn = new JButton("Ȯ��");
	
	class ExamTimer extends Thread
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 10; i >=0; i--) {
				try {
					sleep(1000);
					timer.setText("�ð�:"+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			timer.setText("�ð�����");
			btn.setEnabled(false);
		}
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��ư�� ��������?");
		
		int jum =0;
		
		for (JCheckBox box : qq_1) {
			if(box.isSelected())
				jum+=20;
		}
		if(qq_2.get(2).isSelected())
			jum+=20;
		
		res.setText("���:"+jum);
	}
	
	
	void datainit()
	{
		qq_1.add(new JCheckBox("�嵿��"));
		qq_1.add(new JCheckBox("���켺"));
		qq_1.add(new JCheckBox("����"));
		qq_1.add(new JCheckBox("����"));
		
		qq_2.add(new JRadioButton("������"));
		qq_2.add(new JRadioButton("�̻���"));
		qq_2.add(new JRadioButton("�Ϳ��"));
		qq_2.add(new JRadioButton("������"));
		
		add(timer);
		
		add(new JLabel("1. �������� ������ ������"));
		for (JCheckBox box : qq_1) {
			add(box);
		}
		
		ButtonGroup bg = new ButtonGroup();
		add(new JLabel("2. �������� Ư�⸦ ������"));
		for (JRadioButton btn : qq_2) {
			add(btn);
			bg.add(btn);
		}
		
		
		add(btn);
		add(res);
		
		
		//btn.addActionListener(new BtnLiten(this));
		btn.addActionListener(this);
		
		new ExamTimer().start();
	}
	
	public TeacherExam() {
		// TODO Auto-generated constructor stub
		
		
		
		setBounds(0, 0, 400, 600);
		setLayout(new GridLayout(13, 1));
		
		datainit();
		
		setVisible(true);
		addWindowListener(new WinClose());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TeacherExam();
	}

}
