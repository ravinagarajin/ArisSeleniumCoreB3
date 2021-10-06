import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.linkedin.com/login");
		System.out.println("It has navigated to :"+myD.getTitle());
		myD.findElement(By.xpath("//input[@id='username']")).sendKeys("Sam");
		myD.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		myD.findElement(By.xpath("//*[@id='password-visibility-toggle' and @class='button__password-visibility']")).click();
		
		Thread.sleep(5000);
		
		myD.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("It has navigated to" + myD.getTitle());
		myD.findElement(By.name("userName")).sendKeys("sam@abc.com");
		myD.findElement(By.linkText("Join now")).click();
		System.out.println("It has navigated to" + myD.getTitle());
		
		myD.navigate().to("https://www.amazon.in/");
		myD.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[1]")).click();
		
		Thread.sleep(5000);
		
		myD.close();
		
	}

}
