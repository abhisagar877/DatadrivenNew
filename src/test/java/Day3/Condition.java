package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Condition {
	

	@Test(dataProvider="Gurudata")
	
	public void loginGuru(String userName, String Password) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\DemoTesting\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("userName");
		driver.findElement(By.name("")).sendKeys("Password");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
	@DataProvider(name="Gurudata")
	public Object[][] passData()
	
	{
		Object[][]data 	=new Object[3][2];
		data[0][0]="mngr264059";
		data[0][1]="ErApytY";
		
		data[1][0]="admin";
		data[1][1]="admin12";
		
		data[2][0]="admin123";
		data[2][1]="admin";
		return data;
		
	}
}
