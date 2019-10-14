package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadingProperties {
    public static void main(String[] args) {
        String path = "C:\\Users\\Samsung\\IdeaProjects\\untitled3\\src\\ExceptionHandling\\test.properties";
        Properties prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream(path);
            prop.load(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("course"));

    }
}
