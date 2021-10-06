import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.mortgagecalculator.org/");
		myD.findElement(By.id("homeval")).sendKeys("5000");
		myD.findElement(By.name("param[downpayment]")).sendKeys("300");
		myD.findElement(By.name("param[downpayment_type]")).click();
		myD.findElement(By.id("intrstsrate")).sendKeys("5.5");
		myD.findElement(By.name("cal")).click();
		String vMpay=myD.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println(vMpay);
		myD.close();
		
	}

}
