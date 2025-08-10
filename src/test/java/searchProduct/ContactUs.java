package searchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs
{
	WebDriver driver;
	@Test(priority=1)
	void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("Apk32107@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password107");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	void contact() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pinku Jha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kk3467@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Delay Order");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("My order is delay");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[normalize-space()='Home'])[1]")).click();
		Thread.sleep(1000);
	}
	@Test(priority=4)
	void shutDown()
	{
		driver.quit();
	}
}
