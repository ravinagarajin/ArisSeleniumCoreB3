import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD=new EdgeDriver();
		myD.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		myD.findElement(By.id("food")).sendKeys("1000");
		myD.findElement(By.id("clothing")).sendKeys("2000");
		myD.findElement(By.id("shelter")).sendKeys("3000");
		myD.findElement(By.id("monthlyPay")).sendKeys("4000");
		myD.findElement(By.id("monthlyOther")).sendKeys("5000");
		String TME=myD.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String TMI=myD.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println("Total Monthly Expenses:"+TME);
		System.out.println("Total Monthly Income:"+TMI);
		myD.close();
		
	}

}
