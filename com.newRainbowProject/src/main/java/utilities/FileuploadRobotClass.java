package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileuploadRobotClass { 
	public void FileUpload() throws AWTException {
		  

		// creating object of Robot class to upload file other thn sendkeys(robot class=sendkeys= autoIT tool)
		Robot rb = new Robot();    

		// Store the File path to the StringSelection class
		StringSelection filePath = new StringSelection(System.getProperty("user.dir")+"//src//test//resources//Russian Salad.jpeg");

		// Copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL); 
		rb.delay(2);
//		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_V);
		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(5);
		rb.keyRelease(KeyEvent.VK_V);
		
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(5);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("file uploaded..");
        
        
        
	}}
