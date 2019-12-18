package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import batchRunner.TestBatchRunner;

public class DriverUtility {
	public static WebDriver supplyDriver(String browser) {

		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		return new ChromeDriver();
		} 
		else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","c:\\WebDriver\\geckodriver.exe");
		return new FirefoxDriver();
		} 
		else if(browser.equals("ie")) {
		System.setProperty("webdriver.ie.driver","C:\\irfan drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		return new InternetExplorerDriver();
		}
		else {
		return null;
				
				
			}

		}
}
