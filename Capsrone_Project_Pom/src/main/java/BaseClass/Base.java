package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public Base b;

	public Base() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("./Configaration\\Config.properties");
		prop.load(fis);
	}

	public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browserName");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers//msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
}
}
