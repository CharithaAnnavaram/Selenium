package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multi_Parallel_Thread {
  @Test
  public void f() {
	  
	  //chrome
	  System.setProperty("webdriver.chrome.driver","C:/Users/annavaram.charitha/chromedriver_win32/chromedriver.exe");
	  WebDriver d1;
      d1=new ChromeDriver();
	  
	  d1.get("http://www.leafground.com/");
	  
	  
	  
	  //edge
	  System.setProperty("webdriver.Microsoft Edge.driver","C:/Users/annavaram.charitha/Downloads/edgedriver_arm64/msedgedriver.exe");
	  WebDriver d2;
      d2=new ChromeDriver();
	  
	  d2.get("http://www.leafground.com/");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
