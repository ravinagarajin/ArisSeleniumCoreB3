import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1BrowserChrome {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println(vTitle);
		myD.close();
	}

}
