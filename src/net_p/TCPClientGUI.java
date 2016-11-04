package net_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//고객용
public class TCPClientGUI extends JFrame{

	String ip;//아이피 입력 받을 것
	int port;//포트 입력 받을 것
	JTextField iptxt;
	JTextField porttxt;
	JTextArea logArea;
	class ConnectListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//---------------클라이언트----------------------//

			if(iptxt.getText()==null||iptxt.getText().equals("")||porttxt.getText()==null||porttxt.getText().equals(""))
			{
				logArea.append("Ip나 포트번호를 확인해 주세요\n");
			}
			else
			{
				try {
					ip = iptxt.getText();
					port = Integer.parseInt(porttxt.getText());

					Socket socket = new Socket(ip, port);

					FileOutputStream fos = null;
					InputStream is = socket.getInputStream();
					
					ObjectInputStream ois = new ObjectInputStream(is);
					
					TCP_KSH ksh = (TCP_KSH)ois.readObject();
					logArea.append("서버 : "+ ksh.msg +"\n");
					logArea.append("파일명 : "+ksh.fileName+"\n");
					logArea.append("파일크기 : "+ksh.data.length+"byte\n");
					
					fos = new FileOutputStream("img/zxcv/"+ksh.fileName);
					fos.write(ksh.data);
					/*DataInputStream dis = new DataInputStream(is);
					

					String serverName = dis.readUTF();//서버 접속 받음
					String fileName = dis.readUTF();//파일 이름 받음
					int data = dis.readInt();//파일 사이즈 받음

					logArea.append("서버 : "+ serverName +"\n");
					logArea.append("파일명 : "+fileName+"\n");
					logArea.append("파일크기 : "+data+"byte\n");//파일 크기

					fos = new FileOutputStream("img/jvcv/"+fileName);
					
					byte[] buf = new byte[8];
					int len = 0;
					int size = 0;
					
					while((len=is.read(buf))!=-1){//데이터를 읽고
						fos.write(buf,0,len);//파일 아웃
						size+=len;
						logArea.append(Integer.toString(size)+"byte\n");
					}
					logArea.append(fileName+"("+size/1024+"Kbyte)"+"전송완료");
					dis.close();
					*/
					ois.close();
					is.close();
					fos.close();
					
					
					socket.close();

				} catch (UnknownHostException er) {
					er.printStackTrace();
				} catch (Exception err) {
					err.printStackTrace();
				}
			}
		}
	}
	public TCPClientGUI() {
		
		setBounds(100,100,500,400);
		setLayout(null);
		
		JLabel iplabel = new JLabel("아이피 입력");
		iplabel.setBounds(10, 10, 80, 30);
		add(iplabel);

		iptxt = new JTextField();
		iptxt.setBounds(90, 10, 90, 30);
		add(iptxt);
		JLabel portlabel = new JLabel("포트입력");
		portlabel.setBounds(190, 10, 60, 30);
		add(portlabel);

		porttxt = new JTextField();
		porttxt.setBounds(250, 10, 90, 30);
		add(porttxt);

		JButton connect = new JButton("접속");
		connect.setBounds(360, 10, 100, 30);
		connect.addActionListener(new ConnectListener());
		add(connect);

		logArea = new JTextArea();
		logArea.setEditable(false);
		JScrollPane js = new JScrollPane(logArea);
		js.setBounds(10, 50, 450, 300);
		add(js);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
		new TCPClientGUI();
	}
}
//스윙으로 서버, 클라이언트 가시화 --> 신호 들어오면 
//+ 파일 넘겨받을 수 있도록
//최초의 용량이 얼마인지 ?
