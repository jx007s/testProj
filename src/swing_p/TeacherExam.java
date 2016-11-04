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
		System.out.println("버튼을 눌렀구만?");
		
		int jum =0;
		
		for (JCheckBox box : exam.qq_1) {
			if(box.isSelected())
				jum+=20;
		}
		if(exam.qq_2.get(2).isSelected())
			jum+=20;
		
		exam.res.setText("결과:"+jum);
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
				exam.timer.setText("시간:"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		exam.timer.setText("시간종료");
		exam.btn.setEnabled(false);
	}
	
}*/

public class TeacherExam extends JFrame implements ActionListener{

	ArrayList<JCheckBox> qq_1 = new ArrayList<>();
	ArrayList<JRadioButton> qq_2 = new ArrayList<>();
	JLabel res = new JLabel("결과:");
	JLabel timer = new JLabel();
	JButton btn = new JButton("확인");
	
	class ExamTimer extends Thread
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 10; i >=0; i--) {
				try {
					sleep(1000);
					timer.setText("시간:"+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			timer.setText("시간종료");
			btn.setEnabled(false);
		}
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼을 눌렀구만?");
		
		int jum =0;
		
		for (JCheckBox box : qq_1) {
			if(box.isSelected())
				jum+=20;
		}
		if(qq_2.get(2).isSelected())
			jum+=20;
		
		res.setText("결과:"+jum);
	}
	
	
	void datainit()
	{
		qq_1.add(new JCheckBox("장동건"));
		qq_1.add(new JCheckBox("정우성"));
		qq_1.add(new JCheckBox("원빈"));
		qq_1.add(new JCheckBox("현빈"));
		
		qq_2.add(new JRadioButton("깜찍이"));
		qq_2.add(new JRadioButton("이쁜이"));
		qq_2.add(new JRadioButton("귀요미"));
		qq_2.add(new JRadioButton("멋쟁이"));
		
		add(timer);
		
		add(new JLabel("1. 선생님의 별명을 고르세요"));
		for (JCheckBox box : qq_1) {
			add(box);
		}
		
		ButtonGroup bg = new ButtonGroup();
		add(new JLabel("2. 선생님의 특기를 고르세요"));
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
