package demoForGithub;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra_LoginPage {

//Trying to login without signing up	
	
  @Test
  public void f(){
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\annavaram.charitha\\chromedriver_win32\\chromedriver.exe");
	  WebDriver u1;
	  u1=new ChromeDriver();
	  
	  //username
	  u1.get("https://www.myntra.com/login/password");
	  u1.findElement(By.id("mobileNumberPass")).sendKeys("charithaannavaram@gmail.com");
	  
      //forgot password and click on send link
	  u1.findElement(By.xpath("//*[@id='reactPageContent']/div/div/div[2]/a")).click();	
	  u1.findElement(By.className("form-control")).sendKeys("charithaannavaram@gmail.com");
	  u1.findElement(By.xpath("//*[@id='recovery-button']")).click();
	
	
  }
}
