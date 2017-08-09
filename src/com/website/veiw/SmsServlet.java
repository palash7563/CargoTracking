package com.website.veiw;
import java.io.*;

//import javax.comm.*;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

public class SmsServlet
{
	static CommPortIdentifier portId;
	OutputStream outputStream;
    SerialPort serialPort;
    public SmsServlet(){}

 public  void SendSms(String comPort,String ph,String msg)
        {
            try
            {
            	portId = CommPortIdentifier.getPortIdentifier(comPort);
				serialPort = (SerialPort) portId.open("sms", 2000);
 				outputStream = serialPort.getOutputStream();
				serialPort.setSerialPortParams(9600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
				outputStream.write("AT+CMGF=1\r".getBytes());
                Thread.sleep(2000);
                String p="AT+CMGS=\"" + ph + "\"\r";
             	outputStream.write(p.getBytes());
                Thread.sleep(3000);
                String m=msg + (char)26 + "\r";
                outputStream.write(m.getBytes());
                Thread.sleep(3000);
                serialPort.close();
                outputStream.close();

            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
}