package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_up {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\annavaram.charitha\\chromedriver_win32\\chromedriver.exe");
	  WebDriver u1;
	  u1=new ChromeDriver();
	  
	  //username
	  u1.get("https://accounts.myntra.com/signup?pageRequested=%2Fwelcome&cidx=sis-dcfae8b8-016b-462f-ac90-0cb9a54cc647&state=");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
