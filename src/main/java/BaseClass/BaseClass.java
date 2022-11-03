package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	 public static WebDriver driver ;
	 
	 public static void browserLaunch(String bname) {
		 
		 if(bname.equalsIgnoreCase("chrome")) {
			 
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(); 
		 }else if(bname.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
		 }else if(bname.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				
		 }
				driver.manage().window().maximize();
	}

    public static WebDriver WebDriverManager() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	return driver;
}
	
    public static void Url(String a) {
		
	driver.get(a);
}
    public static String CurrentUrl() {
    	String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
    
    public static String Tittle() {
    	
    	String title = driver.getTitle();
		return title;

	}
    public static void Quit() {
    	driver.quit();

	}
    public static void Waitt() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
    public static void SendKeys(WebElement a, String b) {
		a.sendKeys(b);
		
	}
    public static void Click(WebElement a) {
		a.click();
	}
    
    public static void MoveToElement(WebElement b) {
		Actions a = new Actions(driver);
		a.moveToElement(b).perform();
	}
    public static void DragAndDrop(WebElement x,WebElement y) {
		Actions a = new Actions(driver);
		a.dragAndDrop(x, y);
		
	}
    
    public static void SelectbyVisibleText(WebElement x , String y) {
		Select s= new Select(x);
		s.selectByVisibleText(y);
	}
    public static void SelectbyIndex(WebElement x, int y) {
		Select s = new Select(x);
		s.selectByIndex(y);
	}
    
    public static void SelectbyValue(WebElement x, String y ) {
    	Select s = new Select(x);
    	s.selectByValue(y);
    	
    }
    
    public static String attribute(WebElement x) {
    	String attribute = x.getAttribute("value");
		return attribute;
    	
		
	}
    
	
	
	
	
	
	
}
