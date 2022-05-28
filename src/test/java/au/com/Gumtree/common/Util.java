package au.com.Gumtree.common;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {



    public void threadSleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getProp(String url) {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(url);
        } catch (IOException ex) {
            System.out.println("Unable to load config.properties");
            ex.printStackTrace();
        }
        return "";
    }


}
