
package uygulama2;

import java.util.Random;
import javax.swing.JOptionPane;

public class Uygulama2 {

    
    public static void main(String[] args) {
        
        Random rnd=new Random();
        //100-200 arası rastgele sayı tutma.
       int sayi=rnd.nextInt(100)+100;
       System.out.println(sayi);
       int hak=6;
        try {
             for ( hak = 6; hak >=0; hak--) {
            
                int thm=Integer.parseInt(JOptionPane.showInputDialog("100-200 arasında bir sayi giriniz..."));
                if (thm>sayi) {
            JOptionPane.showMessageDialog(null, "daha kucuk bir sayi giriniz"+"\n"+hak+" hakkınız kaldı");
        
                }
        else if (thm<sayi) {
            JOptionPane.showMessageDialog(null, "daha buyuk bir sayi giriniz"+"\n"+hak+" hakkınız kaldı");
        }
         
        else if (thm==sayi) {
            JOptionPane.showMessageDialog(null, "tebrikler "+(7-hak)+" denemede bildiniz");
            break;
        }
         if(hak==0)
         JOptionPane.showMessageDialog(null,"uzgunum hakkınız bitmiştir"); 
       
        }
        
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "hatalı giriş yaptınız");
            int thm=Integer.parseInt(JOptionPane.showInputDialog("bir sayi giriniz..."));
        }  
    }
      
    }
    
    
