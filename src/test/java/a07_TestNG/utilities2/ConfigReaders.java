package a07_TestNG.utilities2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaders {
    public static Properties properties;
    static {
        String propPath = "src/test/java/Configure.properties";

        try {
            FileInputStream fis = new FileInputStream(propPath);
            properties = new Properties();
            properties.load(fis);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperties(String key) {

        return properties.getProperty(key);

    }
}
