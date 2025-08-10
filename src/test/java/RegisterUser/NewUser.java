package RegisterUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewUser 
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
void registeration() throws InterruptedException
{
	driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pinku Jha");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Apk32107@gmail.com");
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
	Thread.sleep(500);
}
@Test(priority=3)
void signUp() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password107");
	Thread.sleep(500);
	WebElement days=driver.findElement(By.xpath("//select[@id='days']"));
	Select sc=new Select(days);
	sc.selectByVisibleText("4");
	Thread.sleep(500);
	WebElement months= driver.findElement(By.xpath("//select[@id='months']"));
	Select sc1=new Select(months);
	sc1.selectByVisibleText("December");
	Thread.sleep(500);
	WebElement years=driver.findElement(By.xpath("//select[@id='years']"));
	Select sc2=new Select(years);
	sc2.selectByVisibleText("1997");
	Thread.sleep(500);
	driver.findElement(By.xpath("//select[@id='years']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='optin']")).click();
	driver.findElement(By.xpath("//input[@id='newsletter']")).click();
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Pinku");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Jha");
	driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Paytm");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Benta Chowk Darbhanga");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Gurgaon Delhi");
	Thread.sleep(500);
	WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
	Select obj=new Select(country);
	obj.selectByVisibleText("India");
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Bihar");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Darbhanga");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("846003");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9572609279");
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
	
}
@Test(priority=4)
void shuDownt()
{
	driver.quit();
}

}
