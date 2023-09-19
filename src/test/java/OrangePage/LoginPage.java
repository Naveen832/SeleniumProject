	package OrangePage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\NVISWANA\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		//String act_title = driver.getTitle();
		//String ex_title = "OrangeHRM";
		
		//verify the  title page
//		if (act_title.equals(ex_title)) {
//			System.out.println("testcase is passed");
//			 
//		}
//		else
//		{
//			System.out.println("testcase is failed");
//		}
	//verify the label verification
		String ac_label = null;
		 
	}
}
