package searchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearhIProduct 
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
	void orderProduct() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//header[@id='header']//li[2]")).click();
		Thread.sleep(2000);
		WebElement item1=driver.findElement(By.xpath("//div[11]//div[1]//div[2]//ul[1]//li[1]//a[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", item1);
		item1.click();
		Thread.sleep(500);
		WebElement qty=driver.findElement(By.xpath("(//input[@id='quantity'])[1]"));
		qty.sendKeys(Keys.ARROW_UP);
		Thread.sleep(500);
		qty.sendKeys(Keys.ARROW_UP);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[normalize-space()='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//u[normalize-space()='View Cart'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//header[@id='header']//li[2]")).click();
	}
	@Test(priority=4)
	void kidsProduct() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='search_product'])[1]")).sendKeys("Jeans");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@id='submit_search'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='quantity'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='quantity'])[1]")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//u[normalize-space()='View Cart'])[1]")).click();
		Thread.sleep(2000);
		
	}
	@Test(priority=5)
	void placeOrder() throws InterruptedException
	{ 
		driver.findElement(By.xpath("//tr[@id='product-12']//i[@class='fa fa-times']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Proceed To Checkout'])[1]")).click();
		Thread.sleep(2000);
		WebElement order=driver.findElement(By.xpath("//textarea[@name='message']"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", order);
		Thread.sleep(2000);
		order.sendKeys("Product is too cheap");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Place Order'])[1]")).click();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	void payment() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys("American Express");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("102365798");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='ex. 311']")).sendKeys("311");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2028");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
	}
	@Test(priority=7)
	void invoice() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Download Invoice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	void shutDown()
	{
		driver.quit();
	}
}
