package GUI;

import java.awt.BorderLayout;  
import java.awt.Component;  
import java.awt.EventQueue;  
import java.awt.Color;  
import java.awt.event.MouseAdapter;  
import java.awt.event.MouseEvent;  
  
import javax.swing.BorderFactory;  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;  
  
  
public class DraggedTest extends JFrame {  
  
    private JPanel contentPane;  
  
    public static void main(String[] args) {  
    	DraggedTest test = new DraggedTest();
    	test.setVisible(true);
    }  
  
    public DraggedTest() {  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(660, 500);  
        setLocationRelativeTo(null);  
        contentPane = new JPanel();  
        contentPane.setLayout(new BorderLayout());  
        add(contentPane);  
          
        JPanel panel = new JPanel();  
        contentPane.add(panel, BorderLayout.CENTER);  
        panel.setBorder(BorderFactory.createLineBorder(Color.orange, 2));  
        panel.setLayout(null);  
        
        JLabel text = new JLabel("Hello Wordl");
        text.setBounds(261, 85, 130, 130);
        panel.add(text);
          
        MyListener m = new MyListener();  
        text.addMouseListener(m);
        text.addMouseMotionListener(m);  
    }  
    // 写一个类继承鼠标监听器的适配器，这样就可以免掉不用的方法。  
    class MyListener extends MouseAdapter{  
        //这两组x和y为鼠标点下时在屏幕的位置和拖动时所在的位置  
        int newX,newY,oldX,oldY;  
        //这两个坐标为组件当前的坐标  
        int startX,startY;  
      
        @Override  
        public void mousePressed(MouseEvent e) {  
            //此为得到事件源组件  
            Component cp = (Component)e.getSource();  
            //当鼠标点下的时候记录组件当前的坐标与鼠标当前在屏幕的位置  
            startX = cp.getX();  
            startY = cp.getY();  
            oldX = e.getXOnScreen();  
            oldY = e.getYOnScreen();  
        }  
        @Override  
        public void mouseDragged(MouseEvent e) {  
            Component cp = (Component)e.getSource();  
            //拖动的时候记录新坐标  
            newX = e.getXOnScreen();  
            newY = e.getYOnScreen();  
            //设置bounds,将点下时记录的组件开始坐标与鼠标拖动的距离相加  
            cp.setBounds(startX+(newX - oldX), startY+(newY - oldY), cp.getWidth(), cp.getHeight());  
        }  
  
    }  
}  
