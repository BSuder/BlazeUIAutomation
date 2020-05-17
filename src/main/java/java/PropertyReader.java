package java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private Properties properties;

    public PropertyReader() {
        try {
            InputStream input = new FileInputStream("Blaze.properties");
            this.properties.load(input);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public String getMainPageURL() {
        return properties.getProperty("mainPage");
    }

}
