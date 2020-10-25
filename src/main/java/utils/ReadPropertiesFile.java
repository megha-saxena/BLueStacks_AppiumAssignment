package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static Properties prop = null;
	public static File file = null;
	public static FileInputStream fis = null;

//Reading properties file
	public ReadPropertiesFile() {
		{
			file = new File(System.getProperty("user.dir") + "\\Config.properties");
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}
//returning the value against the required key
	public String getProperty(String key) {

		return prop.getProperty(key);

	}



}
