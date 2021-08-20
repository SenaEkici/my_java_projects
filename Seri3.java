
package seri3;

import jssc.SerialPort;
import jssc.SerialPortException;


public class Seri3 {

    
    public static void main(String[] args) throws SerialPortException, InterruptedException {
        SerialPort seri=new SerialPort("COM7");
        seri.openPort();
        seri.setParams(19200, 8, 1, 0);
        while(true){
            String oku=seri.readString();
            System.out.println(oku);
            Thread.sleep(1000);
        }
 
    }
    
}
