package Tasks9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitle {

	public static void main(String[] args) {
		// Initialize the driver
		WebDriver drive = new ChromeDriver();// ctrl space to import
		// open the website
		drive.get("https://www.demoblaze.com/");
		// Maximize the browser
		drive.manage().window().maximize();
		// get the title
		String title = drive.getTitle();
		System.out.println("title: " + title);
		if (title.equalsIgnoreCase("Store")) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}
	}

}

/*
 * Output: title: STORE Page landed on correct website
 */
