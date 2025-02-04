package Tasks9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchHistory {

	public static void main(String[] args) {
		// Initialize the driver
		WebDriver Dr = new ChromeDriver();
		// Open the website
		Dr.get("https://www.wikipedia.org/");
		Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Maximize the browser
		Dr.manage().window().maximize();
		Dr.findElement(By.name("search")).sendKeys("Artificial Intelligence");
		Dr.findElement(By.xpath("//button[@type='submit']")).click();
		Dr.findElement(By.xpath("//div[@class=\"vector-column-start\"]")).click();
		// Dr.findElement(By.xpath("//li[vector-toc-list-item
		// vector-toc-level-1]")).click();
		String text = Dr.findElement(By.id("History")).getText();
		System.out.println("print the title of the section:" + text);

	}

}
/*
 * Output: print the title of the section:History
 */
