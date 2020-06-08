package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Selenium\\DemoTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String baseUrl = "http://www.demo.guru99.com/V4/";
        String expectedTitle = "Guru99 Bank Manger HomePage";
        String actualTitle = "";
        
        
        driver.get(baseUrl);
        driver.findElement(By.name("uid")).sendKeys("mngr264059");
		driver.findElement(By.name("password")).sendKeys("ErApytY");
		
		driver.findElement(By.name("btnLogin")).click();
        // get the actual value of the title
        actualTitle= driver.getTitle();
if(actualTitle.contentEquals(expectedTitle)){
    	   System.out.println("TestPassed");}
    	   else
    	   {
    		   System.out.println("failed");
    	   }
       driver.close();
       }
	}

