
package guideneme2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Pencere implements ActionListener{
    JFrame pencere=new JFrame("hareket ettir");
    ImageIcon imgsag=new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\guideneme2\\src\\guideneme2\\if_arrow_full_right_103295.png");
    ImageIcon imgsol=new ImageIcon("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\guideneme2\\src\\guideneme2\\if_arrow_full_left_103292.png");
    JButton sag=new JButton("SAG", imgsag);
    JButton sol=new JButton("SOL", imgsol);
    public Pencere()
    {
        FlowLayout layout=new FlowLayout();
        pencere.setLayout(layout);
        pencere.setSize(500,300);
        pencere.setLocation(700,400);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
        pencere.add(sol);
        pencere.add(sag);
        sag.addActionListener(this);
        sol.addActionListener(this);
    }
      /*for (int i = 0; i < 10; i++) {  
               pencere.setLocation(0+(i*100), 0+(i*100));
               Thread.sleep(300);
               pencere.setVisible(true);
        }*/  

    @Override
    public void actionPerformed(ActionEvent e) {
       
       if(e.getSource()==sag)
       {
         for (int i = 0; i < 10; i++) {  
               pencere.setLocation(0+(i*10), 0);
         }
       }
       if(e.getSource()==sol)
       {
             for (int i = 0; i < 10; i++) {  
               pencere.setLocation(0-(i*10), 0);
         }   
       }
    }
    
}
