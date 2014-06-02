package com.browseautomata.app;

import java.net.InetAddress;
import java.util.Date;

public class NetLookup extends Thread{
	private int _timeout;
	private String _url;
	public NetLookup(String str, int nTimeOut, String url){
		super(str);// allot thread's name.
		_timeout = nTimeOut;
		_url = url;
	}
	
	public void run(){
		while(true)
		{
		 try {
		      InetAddress addresses = InetAddress.getByName(_url);
		      Date date = new Date();
		      if(addresses.isReachable(_timeout)){
		    	  // if true , means this PC is connected to Internet.
		    	  //also log this to success log-> PC is connected at this time.
		    	  System.out.println("System is connected to Internet at :" + date.toString());
		      }
		      else{
		    	  // then you have to invoke the browser and perform the required task to log in to your ISP with your creds.
		    	  System.out.println("System not connected to Internet.");
		      }
		    } 
		 
		 catch (Exception e) {
		      System.out.println(e.getMessage());
		      e.printStackTrace();
		      // raise the error flag and write the error down to error log.
		    }
		 finally{
			 try {
				 //code goes here.
				 Thread.sleep(1 * 1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		}
	}
	

}
