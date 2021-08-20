
package fibonacci;

import javax.swing.JOptionPane;


public class Fibonacci {

    
    public static void main(String[] args) {
        
        int fibonacci[]=new int[10];
        fibonacci[0]=0;
        fibonacci[1]=1;
        fibonacci[2]=1;
        int n=Integer.parseInt(JOptionPane.showInputDialog("hangi fibi istiyon kanka"));
        
        for (int i = 2; i <= n; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        System.out.println(fibonacci[n]);
        
    }
    
}
