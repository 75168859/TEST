package cn.com.log4j;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class Log4jTest {
	
	static Log4jUtils _log = null;
	
	public static void main(String[] args) {
		_log = new Log4jUtils("YWYY_LOG");
		_log.setNewLogger("/bb/aaanewname");
		for(int i = 0 ; i < 10000; i++){
			_log.info("xxxxx汉字乱码:" + i);
		}
		
		
	}
	
	
}
