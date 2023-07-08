package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public void takeScreenShot(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot scrShot = (TakesScreenshot)driver;                           //tkscnshotinterface obj created
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);	               //scrnshotype is converted to file,stored in file varaible
	    
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
	
		String dest = System.getProperty("user.dir") + "//Test_Evidence";             //prject from user direc, test evidence folder creatd,
		File f1 = new File(dest);                                                     //folder is cretd once, created only if test is failed       
		if (!f1.exists()) {
			f1.mkdirs();                                                             //mkdirs created folder
		}
		
		String destinationPath = System.getProperty("user.dir") + "//Test_Evidence//" + name + timeStamp + ".png"; //folder fron usr dir thn tname and time
		File finalDestination = new File(destinationPath); 
		FileHandler.copy(screenShot, finalDestination);                                                  //filehandler for comon file handlin methods
	
	}
}
