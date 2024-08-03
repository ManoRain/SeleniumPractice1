package sel.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IndiaMart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new  EdgeDriver();
		driver.navigate().to("https://my.indiamart.com/"); 
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement enterMobileNumber = driver.findElement(By.name("mobile"));
		enterMobileNumber.sendKeys("7338915440");
		
		WebElement button = driver.findElement(By.id("signInSubmitButton"));
		button.click();
		
		
		

	}

}
