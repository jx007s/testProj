package swing_p;
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
 
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Line_Homework extends JFrame{
    Graphics gg= null;
    int currCC;
    String [] shape ={"―","□","■","○","●"}; 
    String [] brush = {"브러쉬 " ," 지 우 개"};
    int skind; //도형종류
    int bkind; //브러쉬 종류
    int size; //두께
    boolean ckn = true;
 
    Color [] cc = {
            Color.red,
            new Color(255, 187, 0),
            new Color(255, 255, 0),
            new Color(0,255,0),
            new Color(0,0,255),
            new Color(5,0,153),
            new Color(95,0,255),
            new Color(255,255,255),
            new Color(0,0,0)
    };
 
    class Workspace extends JPanel implements MouseMotionListener,MouseListener
    {
        int x =0, y=0;
        int px = 0, py=0;
        int rx= 0,ry =0;
        Image img = null;
 
        public Workspace() {
            // TODO Auto-generated constructor stub
            addMouseListener(this);
            addMouseMotionListener(this);
        }
 
 
        @Override
        public void mouseDragged(MouseEvent e) {
            gg.setColor(cc[currCC]);
            // TODO Auto-generated method stub
 
            if(ckn)
            {
 
 
                if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
                    switch(bkind)
                    {
                    case 0 : 
                        
                        gg.fillOval(x-50, y-50, size, size);
                        repaint();
                        break;
 
                    case 1 : //지우개
                        
                        gg.setColor(Color.white);
                        gg.fillOval(e.getX()-50, e.getY()-50, 50, 50);
 
                        break;
                    }
 
                }
            }
            /*    if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
            {
                gg.setColor(Color.white);
                gg.fillOval(e.getX()-50, e.getY()-50, 100, 100);
 
            }*/
            x= e.getX();
            y= e.getY();
            repaint();
 
        }
        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO Auto-generated method stub
            x=e.getX();
            y=e.getY();
        }
 
        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            /*    gg.drawRect(x, y, e.getX()+size+70, e.getY()+size+70);
 
 
            System.out.println("Pressed");
            gg.drawRect(x, y, , );*/
 
            px= e.getX();
            py= e.getY();
            //repaint();
 
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            rx=e.getX();
            ry=e.getY();
 
            if(ckn == false){
                switch(skind)
                {
                case 0: //직선
 
                    gg.drawLine(px, py, rx, ry);
 
                    repaint();
 
                    break;
                case 1: // 사각형
                    gg.drawRect(px, py, rx-px, ry-py); // ↘
                    gg.drawRect(rx, ry, px-rx, py-ry); // ↖
                    gg.drawRect(px, ry, rx-px, py-ry); // ↗
                    gg.drawRect(rx, py, px-rx, ry-py); // ↙
 
                    repaint();
 
                    break;
                case 2: //꽉찬 사각형
                    gg.fillRect(px, py, rx-px, ry-py);
                    gg.fillRect(rx, ry, px-rx, py-ry);
                    gg.fillRect(px, ry, rx-px, py-ry);
                    gg.fillRect(rx, py, px-rx, ry-py);
 
                    repaint();
                    break;
 
                case 3 : //동그라미
                    gg.drawOval(px, py, rx-px, ry-py);
                    gg.drawOval(rx, ry, px-rx, py-ry);
                    gg.drawOval(px, ry, rx-px, py-ry);
                    gg.drawOval(rx, py, px-rx, ry-py);
 
                    repaint();
                    break;
 
                case 4 : //꽉찬 동그라미
 
                    gg.fillOval(px, py, rx-px, ry-py);
                    gg.fillOval(rx, ry, px-rx, py-ry);
                    gg.fillOval(px, ry, rx-px, py-ry);
                    gg.fillOval(rx, py, px-rx, ry-py);
 
                    repaint();
                    break;
                }
            }
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
 
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
 
        }
        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
 
        }
 
 
        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            if(img==null)
            {
                img= createImage(400,300);
                gg = img.getGraphics();
                gg.setColor(Color.white);
                gg.fillRect(0, 0, 400, 300);
 
            }
            g.drawImage(img, 0, 0, this);
        }
 
    }
 
    class ColorActionLisner implements ActionListener
    {
        int num;
        public ColorActionLisner(int num) {
            // TODO Auto-generated constructor stub
            super();
            this.num=num;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
 
            currCC = num;
        }
    }
 
    class ShapeKind implements ActionListener
    {
        int num2;
        public ShapeKind(int num2) {
            super();
            this.num2 = num2;
 
        }
 
        @Override
        public void actionPerformed(ActionEvent e) {
 
            skind= num2;
            ckn = false;
        }
    }
    class BrushKind implements ActionListener
    {
        int num3;
 
        public BrushKind(int num3) {
            super();
            this.num3 = num3;
        }
 
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            bkind = num3;
            ckn = true;
        }
    }
 
 
    class SizeKind implements ItemListener
    {
 
        @Override
        public void itemStateChanged(ItemEvent e) {
            size=(int)e.getItem();
        }
    }
 
 
    public Line_Homework(){
        currCC    = cc.length-1;
 
        setBounds(0, 0, 600, 500);
        setLayout(null);
 
        Workspace work = new Workspace();
        work.setBounds(0, 0, 400, 300);
        add(work);
 
        JPanel ccPan = new JPanel();
        ccPan.setLayout(null);
        ccPan.setBounds(0, 400, 600, 100);
        for (int i = 0; i < cc.length; i++) {
            JButton btn = new JButton();
            btn.setBounds(20+50*i, 0, 50, 50);
 
            btn.setBackground(cc[i]);
            ccPan.add(btn);
            btn.addActionListener(new ColorActionLisner(i));
        }
        ccPan.setBackground(Color.pink);
        add(ccPan);
 
 
        //
        JPanel bbArea = new JPanel();
        bbArea.setLayout(null);
        bbArea.setBackground(Color.gray);
        bbArea.setBounds(430, 20, 100, 300);
 
 
        //버튼 패널
        JPanel bb = new JPanel();
        JButton [] sb= new JButton[5]; //버튼용
 
        //선 네모 원
        bb.setLayout(new GridLayout(5, 0));
        bb.setBounds(430, 40, 100, 150);
        bb.setBackground(Color.white);
        for (int i = 0; i < shape.length; i++) {
            sb[i] = new JButton(shape[i]);
            sb[i].addActionListener(new ShapeKind(i));
            bb.add(sb[i]);
        }
        bbArea.add(bb);
 
        //add(bbArea);
        add(bb);
 
        //브러쉬 버튼
 
        JPanel bb2 = new JPanel();
        JButton [] bs= new JButton[2]; //브러쉬용
 
        //브러쉬 지우개
        bb2.setLayout(new GridLayout(2, 0));
        bb2.setBounds(430, 230, 100, 100);
        bb2.setBackground(Color.white);
        for (int i = 0; i < brush.length; i++) {
            bs[i] = new JButton(brush[i]);
            bs[i].addActionListener(new BrushKind(i));
            bb2.add(bs[i]);
        }
        bbArea.add(bb2);
        //add(bbArea);
        add(bb2);
 
 
        JLabel bushsize = new JLabel("브러쉬 크기");
        bushsize.setBounds(10, 330, 100, 30);
 
        add(bushsize);
 
        //사이즈용
        Vector<Integer> sizeArea= new Vector<>();
        for (int i = 20; i <= 60; i++) {
            sizeArea.add(i);
        }
        JComboBox sizebox = new JComboBox<>(sizeArea);
        sizebox.setBounds(100, 330, 60, 30);
        sizebox.addItemListener(new SizeKind());
        add(sizebox);
 
 
        /*Workspace wa = new Workspace();
        wa.setBounds(0, 0, 600, 400);
        add(wa);
         */
 
        setVisible(true);
 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
 
        new Line_Homework();
 
 
    }
 
}