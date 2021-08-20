
package seri2;

import com.fazecast.jSerialComm.SerialPort;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;



public class Seri2 {

    public static void main(String[] args) throws InterruptedException, IOException {
        SerialPort port=SerialPort.getCommPort("COM3");
        port.openPort();
        port.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 0, 0);
        OutputStream serialOut=port.getOutputStream();
        System.out.println("Ledi yakmak için H sondurmek için L ye bas.");
        while(port.isOpen()){
            Scanner oku=new Scanner(System.in);
            String gonderilen= oku.next();
              if("H".equals(gonderilen)){
            serialOut.write(gonderilen.getBytes());
            serialOut.flush();
        }
        else if("L".equals(gonderilen))
        {
           serialOut.write(gonderilen.getBytes());
           serialOut.flush();
            
        }
   }
        
    }
    
}
