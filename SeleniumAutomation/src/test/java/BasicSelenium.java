import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://demoqa.com/");
		
		driver.navigate().refresh();
		
		
		
		driver.manage().window().maximize();
		
		driver.close();
		
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
