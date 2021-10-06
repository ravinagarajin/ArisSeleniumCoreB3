import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2MouseOperation {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("http://www.youcandealwithit.com/");
		System.out.println("It has navigated to :"+myD.getTitle());
			Thread.sleep(4000);	
			
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.linkText("BORROWERS"))).build().perform();
		Thread.sleep(4000);	
		
		myD.findElement(By.linkText("Calculators & Resources")).click();
		
	}
}
