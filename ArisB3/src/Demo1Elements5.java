import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Elements5 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("https://www.google.com");
		System.out.println("It has navigated to :"+myD.getTitle());
		int vSize=myD.findElements(By.tagName("a")).size();
		 for (int i=0;i<vSize;i++)
		 {
			 //String vLink=myD.findElements(By.tagName("a")).get(i).getAttribute("href");
			 String vLink=myD.findElements(By.tagName("a")).get(i).getText();
			 
			 System.out.println(vLink);
		 }
				
		
		myD.close();
		
	}

}
