package RegisterUser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Validation
{
	WebDriver driver;
	@Test(priority=1)
	void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
	}
	@Test(priority=2)
	void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("Apk32107@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password107");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(500);
	}
	@Test(priority=3)
	void title()
	{
		String title=driver.getTitle();
		if(title.equals("Automation Exercise"))
		{
			System.out.println("Title is :-"+title);
		}
		else
		{
			System.out.println("Title is invalid");
		}
	}
	@Test(priority=4)
	void logo() throws InterruptedException, IOException
	{
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		Thread.sleep(500);
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");
		sourcefile.renameTo(targetfile);
		FileUtils.copyFile(sourcefile, new File("./logo.png"));
		Thread.sleep(1000);
	}
	
	@Test(priority=5)
	void shutDown()
	{
		driver.quit();
	}
}
