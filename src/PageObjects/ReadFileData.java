package PageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {

	/**
	 * This class is created to read property file data and fetch into methods
	 *
	 * @author : Rupesh
	 * created date :15 May 2018
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		Properties obj = new Properties(); 
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\Default.properties");
		obj.load(objfile);
		String mobileTesting = obj.getProperty("MobileTesting");
	}

}
