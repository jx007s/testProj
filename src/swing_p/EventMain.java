package swing_p;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class WinClose extends WindowAdapter
{
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ã¢ ´Ý¾Æ");
		e.getWindow().dispose();
	}
}

class FFWinListen implements WindowListener
{
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ã¢ ´Ý¾Æ");
		e.getWindow().dispose();
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	} 
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class EventMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ff = new JFrame();
		
		ff.setBounds(0, 0, 300, 200);
		
		ff.setVisible(true);
		
		ff.addWindowListener(new WinClose());
	}

}
