
package javaapplication33;

import com.fazecast.jSerialComm.SerialPort;
import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;



public class JavaApplication33 {

   
    public static void main(String[] args) throws InterruptedException  {
        
        //jframe olusturma
        JFrame pnc=new JFrame("sıcaklık grafiği");
        JPanel pnl=new JPanel();
        pnc.setSize(900,900);
        pnc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnc.setLocationRelativeTo(null);
        FlowLayout layout=new FlowLayout();
        pnc.setLayout(layout);
        pnc.add(pnl);
        
        //seri port haberleşme
        
        SerialPort port=SerialPort.getCommPort("COM5");
        port.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
        port.openPort();
        Thread.sleep(1000);
        
        
        //grafiği tanımmlama
        XYSeries series=new XYSeries("temprature");
        XYSeriesCollection dataset=new XYSeriesCollection(series);
        JFreeChart chart=ChartFactory.createXYLineChart("Sicaklik Sensoru", "zaman", "sicaklik degerleri", dataset);
        pnc.add(new ChartPanel(chart),FlowLayout.CENTER);
        
        //okuma ve graiği çizme
            Scanner oku=new Scanner(port.getInputStream());
            int x=0;
            while(oku.hasNextLine())
            {
                String line=oku.nextLine();
                int sayi=Integer.parseInt(line);
                series.add(x++, sayi);
                System.out.println(line);
                pnc.setVisible(true);
            }
    }
    
}
