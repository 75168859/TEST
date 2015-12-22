package tool;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2008</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    public static final String PROPERTY_FILE = "system-config.properties";
    private static Properties props;
    private static ConfigManager instance;

    /**
     * 私有的构造函数
     */
    private ConfigManager() {
        try {
            props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream(
                    PROPERTY_FILE));
        } catch (IOException e) {
            throw new RuntimeException("系统资源文件访问错误："+e.getMessage());
        }
    }

    /**
     * 单例模式，获取ConfigManager的引用
     * @return ConfigManager
     */
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    /**
     * 根据参数名获取系统参数值
     * @param parameterName String
     * @return String
     */
    public String getParameter(String parameterName) {
        return props.getProperty(parameterName);
    }

}
