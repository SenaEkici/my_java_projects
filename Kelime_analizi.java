
package kelime_analizi;

import javax.swing.JOptionPane;


public class Kelime_analizi {

   
    public static void main(String[] args) {
     //cumle analizi
        String cumle=JOptionPane.showInputDialog("bir cumle yazınız");
        int k=cumle.length();
        System.out.println(k);
        int sesli_harf=0;
        int kelime_sayisi=0;
        if(cumle.contains("a"))
        {
            sesli_harf++;
        }
        if (cumle.contains("e")) {
            sesli_harf++;
        }
        if (cumle.contains(" ")) {
           kelime_sayisi++; 
        }
        System.out.println(sesli_harf);
        System.out.println(kelime_sayisi+1);
        System.out.println(cumle.toUpperCase());
       
        for (int i = k; i <=0; i--) {
            System.out.println(cumle.charAt(i));    
        }
    }
    
}
