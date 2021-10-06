import java.util.Set;
import java.util.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		
		// Load the website
        myD.get("http://www.naukri.com/");
 
        // It will return the parent window name as a String
        String parent=myD.getWindowHandle();
        Set<String>s=myD.getWindowHandles();
 
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
 
        while(I1.hasNext())
        {
            String child_window=I1.next();
 

            if(!parent.equals(child_window))
            {
            myD.switchTo().window(child_window);
 
            System.out.println(myD.switchTo().window(child_window).getTitle());
            Thread.sleep(5000);
            myD.close();
            }
 
            }
            //switch to the parent window
            myD.switchTo().window(parent);
            Thread.sleep(5000);
            myD.close();


            }




 
    }