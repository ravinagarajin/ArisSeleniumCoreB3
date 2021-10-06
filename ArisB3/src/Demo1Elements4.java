import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.google.com");
		System.out.println("It has navigated to :"+myD.getTitle());
		myD.findElement(By.name("q")).sendKeys("SELENIUM");
		Thread.sleep(4000);
		//myD.findElementBy.name("btnk").click();
		
		myD.findElement(By.xpath("(//input[@name='btnk'])[1]")).click();
		
		
		Thread.sleep(5000);
		
		
		myD.close();
		
	}

}
