import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	//using concept of Singleton design pattern in Selenium
	//so that singleton class has only one object(instance of class) at a time.
	//How to achieved singleton Class concept?
	//1.make constructor of class private
	//2.create static method which return the object of singleton class.it is also called Lazy Initialization.
	
	public static DriverInit instanceDriver = null; //very imp line
	
	public WebDriver driver;
	
	//private constructor
	private DriverInit() {
		
	}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Test WorkSpace\\SingletonDesignPattern_InSelenium\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}

	//static method which return singleton Class object i.e. DriverInit
	public static DriverInit getInstance() {
		if(instanceDriver == null)
			instanceDriver = new DriverInit();
		return instanceDriver;
	}
}
