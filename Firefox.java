package Tasks9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		//maximize the windows
		driver.manage().window().maximize();
		
		//Print the Url 
		String currentUrl=driver.getCurrentUrl();
		System.out.println("CurrentUrl is: " +currentUrl);
		
		//reload the webpages
		driver.navigate().refresh();
		
		//close the browser
		driver.close();
	}

}

/*Output:
	CurrentUrl is: https://www.google.com/
	*/
