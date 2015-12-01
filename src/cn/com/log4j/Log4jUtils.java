package cn.com.log4j;

import java.io.ObjectInputStream.GetField;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.RollingFileAppender;

public class Log4jUtils {
	
	private static Logger logger;

	static {
		PropertyConfigurator.configure(Log4jUtils.class.getResource("/")
				.getPath() + "cn/com/log4j/log4j.properties");
	}

	public Log4jUtils() {

	}
	
	public Log4jUtils(String name) {
		if(logger == null){
			logger = Logger.getLogger(name);
		}
	}
	
	public void setNewLogger(String name){
		logger.removeAllAppenders();
		logger.setLevel(Level.DEBUG);
		logger.setAdditivity(true);
		// 生成新的Appender
		FileAppender appender = new RollingFileAppender();
		PatternLayout layout = new PatternLayout();
		// log的输出形式
		String conversionPattern = "[%-5p][%d{yyyy-MM-dd HH:mm:ssS}]%c %m%n";//"[%d] %p %t %c - %m%n";
		layout.setConversionPattern(conversionPattern);
		appender.setLayout(layout);
		// log输出路径
		appender.setFile("logs/" + name + ".log");
		appender.setEncoding("UTF-8");
		// true:在已存在log文件后面追加 false:新log覆盖以前的log
		appender.setAppend(true);
		// 适用当前配置
		appender.activateOptions();
		// 将新的Appender加到Logger中
		logger.addAppender(appender);
	}
	

	public void debug(Object message) {
		logger.debug(message);
	}

	public void debug(Object message, Throwable t) {
		logger.debug(message, t);
	}

	public void error(Object message) {
		logger.error(message);
	}

	public void error(Object message, Throwable t) {
		logger.error(message, t);
	}

	public void info(Object message) {
		logger.info(message);
	}

	public void info(Object message, Throwable t) {
		logger.info(message, t);
	}
	

	
}
