package net_p;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
class WinClose extends WindowAdapter {
 
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        e.getWindow().dispose();
    }
}
 
public class UDPBroadCastGUI extends JFrame{
    
    static String title = "適虞戚情闘生焼たたたたたた";
    
    JPanel pn_area = new JPanel();
    JPanel pn_field = new JPanel();
    
    JTextField tf_input = new JTextField();
    JTextArea textArea = new JTextArea();
    
    JScrollPane sp_textArea = new JScrollPane(textArea);
    
    JLabel lb_today = new JLabel();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    boolean chk = false;
    
    class BroadCastReceiver extends Thread{
    	  
        @Override
        public void run() {
            // TODO Auto-generated method stub
        	DatagramSocket ds=null ;
        	try {
        		ds = new DatagramSocket(7777);
            while(true){
            	
            	byte [] arr = new byte [1024];  ///壕伸精 汽戚斗研 歯稽 閤聖 凶原陥 飴重鞠嬢 閤惟 坦軒 廃陥.
        			DatagramPacket data = new DatagramPacket(arr, arr.length);
        			ds.receive(data);
        			
        			textArea.append("["+data.getAddress()+"]"+new String(arr) + "\n");
                    sp_textArea.getVerticalScrollBar().setValue(    // 什滴継 置馬舘生稽 匝 郊嘩.
                            sp_textArea.getVerticalScrollBar().getMaximum());
        		
           
                    
            	}
        	} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}finally{
    			ds.close();
    		}  
        }
    }
    
    public UDPBroadCastGUI() {
        // TODO Auto-generated constructor stub
        super(title);
        setBounds(250, 30, 550, 700);
        setLayout(null);
        dataInit();
       
        System.out.println("辞獄 尻衣 失因");
        add(pn_area);
        add(pn_field);
        
        setVisible(true);
        addWindowListener(new WinClose());
        new BroadCastReceiver().start();

    }
    
    void dataInit(){
        pn_area.setBounds(0, 0, 550, 600);
        pn_area.setLayout(null);
        
        pn_field.setBounds(0, 605, 550, 80);
        pn_field.setLayout(null);
        
        
        sp_textArea.setBounds(20, 35, 470, 580);
        sp_textArea.setBackground(Color.white);
        
        textArea.setEditable(false);
        
        tf_input.setBounds(20, 0, 450, 30);
        tf_input.setBackground(Color.lightGray);
        
        tf_input.addActionListener(new BroadCastSender());
        
        lb_today.setBounds(20, 10, 120, 20);
        
        pn_area.add(sp_textArea);
        pn_area.add(lb_today);
        pn_field.add(tf_input);
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new UDPBroadCastGUI();
    }
    
    class BroadCastSender  implements ActionListener{
        
       @Override
    public void actionPerformed(ActionEvent e) {
    	// TODO Auto-generated method stub
    	   try {
   			DatagramSocket ds = new DatagramSocket();

   			InetAddress addr = InetAddress.getByName("192.168.30.255");
   			DatagramPacket data = new DatagramPacket(
   					tf_input.getText().getBytes(),
   					tf_input.getText().getBytes().length,
   					addr,
   					7777
   					);
   			ds.send(data);
   			tf_input.setText("");
	   		} catch (IOException ex) {
	   			// TODO Auto-generated catch block
	   			ex.printStackTrace();
	   		}
	    }
     
    }
     
}