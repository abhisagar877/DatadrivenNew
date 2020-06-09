package WordPressdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {
@Test(dataProvider="Testdata")
 public void loginWordpress(String userName,String password) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\DemoTesting\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		
		System.out.println(driver.getTitle());
	}
@DataProvider(name="Testdata")
public Object[][] passData()
{
	Object[][]data=new Object[2][3];
	data[0][0]="mngr264059";
	data[0][1]="ErApytY132";
	
	data[1][0]="mngr264059";
	data[1][1]="ErApytY";
	
	data[2][0]="mngr26405945";
	data[2][1]="ErApytY";
	
	return data;
}
}
