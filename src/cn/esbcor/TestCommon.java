package cn.esbcor;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

public class TestCommon {
	
	@Test
	public void testIP(){
		InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
			 String  SYSTEM_IP = addr.getHostAddress();
			 System.out.println(SYSTEM_IP);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	  
	}
}
