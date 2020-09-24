package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public  class Logins {
    public static String Url()throws IOException{
        Properties url = new Properties();
        FileInputStream fa = new FileInputStream("src\\test\\java\\Properties\\Environments.properties");
        url.load(fa);
        String Url = url.getProperty("URL");
        return Url;
    }
}
