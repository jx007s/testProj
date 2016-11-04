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

//����
public class TCPClientGUI extends JFrame{

	String ip;//������ �Է� ���� ��
	int port;//��Ʈ �Է� ���� ��
	JTextField iptxt;
	JTextField porttxt;
	JTextArea logArea;
	class ConnectListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//---------------Ŭ���̾�Ʈ----------------------//

			if(iptxt.getText()==null||iptxt.getText().equals("")||porttxt.getText()==null||porttxt.getText().equals(""))
			{
				logArea.append("Ip�� ��Ʈ��ȣ�� Ȯ���� �ּ���\n");
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
					logArea.append("���� : "+ ksh.msg +"\n");
					logArea.append("���ϸ� : "+ksh.fileName+"\n");
					logArea.append("����ũ�� : "+ksh.data.length+"byte\n");
					
					fos = new FileOutputStream("img/zxcv/"+ksh.fileName);
					fos.write(ksh.data);
					/*DataInputStream dis = new DataInputStream(is);
					

					String serverName = dis.readUTF();//���� ���� ����
					String fileName = dis.readUTF();//���� �̸� ����
					int data = dis.readInt();//���� ������ ����

					logArea.append("���� : "+ serverName +"\n");
					logArea.append("���ϸ� : "+fileName+"\n");
					logArea.append("����ũ�� : "+data+"byte\n");//���� ũ��

					fos = new FileOutputStream("img/jvcv/"+fileName);
					
					byte[] buf = new byte[8];
					int len = 0;
					int size = 0;
					
					while((len=is.read(buf))!=-1){//�����͸� �а�
						fos.write(buf,0,len);//���� �ƿ�
						size+=len;
						logArea.append(Integer.toString(size)+"byte\n");
					}
					logArea.append(fileName+"("+size/1024+"Kbyte)"+"���ۿϷ�");
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
		
		JLabel iplabel = new JLabel("������ �Է�");
		iplabel.setBounds(10, 10, 80, 30);
		add(iplabel);

		iptxt = new JTextField();
		iptxt.setBounds(90, 10, 90, 30);
		add(iptxt);
		JLabel portlabel = new JLabel("��Ʈ�Է�");
		portlabel.setBounds(190, 10, 60, 30);
		add(portlabel);

		porttxt = new JTextField();
		porttxt.setBounds(250, 10, 90, 30);
		add(porttxt);

		JButton connect = new JButton("����");
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
//�������� ����, Ŭ���̾�Ʈ ����ȭ --> ��ȣ ������ 
//+ ���� �Ѱܹ��� �� �ֵ���
//������ �뷮�� ������ ?
