package project_first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome", "E:\\alkhateeb\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/Desktop/Automation/index.html");
		
		String myTitle=driver.getTitle();
		System.out.println(myTitle);
		
		
		List<WebElement> listOption=driver.findElements(By.tagName("option"));
		
		for(int i =0 ; i<listOption.size();i++) {
			
			System.out.println(listOption.get(i).getText());
			
		}

	}

}
