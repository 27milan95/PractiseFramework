package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
    
public class GmailLoginPage {
	 WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	public void closeBrowser() {
		driver.quit();
	}

	public void openGmailPage() {
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void login(String a) {
		driver.findElement(By.id("identifierId")).sendKeys(a);
		  driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}
	public String emptyErr() {
		String acterr = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
		System.out.println(acterr);
		return acterr;
		
	}
	
	public String WrongErr() {
		String acterr = driver.findElement(By.xpath("//div[text()='Couldn’t find your Google Account']")).getText();
		System.out.println(acterr);
		return acterr;
	}
	public  String specialCharErr() {
		String acterr = driver.findElement(By.xpath("//div[text()='Enter a valid email or phone number']")).getText();
		System.out.println(acterr);
		return acterr;
	}
}
