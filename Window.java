
package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Window implements ActionListener{
            JButton buton=new JButton("tıkla");//buton kodlarını yazdık
            JButton buton1=new JButton("tıklama");
            //yapıcı method
        public Window() throws InterruptedException{
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        JFrame pencere=new JFrame("selam");
        pencere.setLocationRelativeTo(null);
        pencere.setLayout(layout);
        pencere.setSize(300,200);
        pencere.add(buton);
        pencere.add(buton1);
        pencere.setVisible(true);
         buton.addActionListener(this);
         buton1.addActionListener(this);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            /*for (int i = 0; i < 10; i++) {  
               pencere.setLocation(0+(i*100), 0+(i*100));
               Thread.sleep(300);
               pencere.setVisible(true);
        }*/  
        }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        if (e.getSource()==buton) {
            JOptionPane.showMessageDialog(null, "tıklaya bastın");
        }
        else
        JOptionPane.showMessageDialog(null, " tıklama demedim mi ??");
    }
}


    

