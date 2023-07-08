package RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {                         //iretryanalyzer interface :

	private int retryCount=0;
	private static final int maxRetryCount=5;
	
	public boolean retry(ITestResult result) {                                  //itest reuslt is aloso an interface    
		if(retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
 
}
