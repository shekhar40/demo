package com.bill.desco.configuration;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
	private Socket socket		 = null;
    // **********************Test**********************
	//private String connectionType = "TEST";
	
    private String ipAddress = "103.69.149.45";
    private int port = 8080;
    
    // ***********************LIVE***********************
//    private String ipAddress = "192.168.200.229";
//    private int port = 7395;
    
    public Client(){ 
    	
    }

    public boolean checkConnection()
    {
        try
        {
            socket = new Socket(this.ipAddress, this.port);
            if(socket.isConnected()){
                return true;
            }
            socket.close();
        }
        catch(UnknownHostException u)
        {
            System.out.println(u);
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
        return false;
    }

}

