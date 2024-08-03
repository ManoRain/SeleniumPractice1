package sel.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		WebDriver driver = new  EdgeDriver();
		driver.navigate().to("https://www.amazon.com"); 
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement button = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		button.click();
		
		WebElement signinButton = driver.findElement(By.className("nav-action-inner"));
		signinButton.click();
		
		WebElement signinElement = driver.findElement(By.name("email"));
		signinElement.sendKeys("manosarala25@gmail.com");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement passwordElement = driver.findElement(By.name("pass"));
		passwordElement.sendKeys("Mano@251295");
		
		WebElement signInButton = driver.findElement(By.id("continue"));
		signInButton.click();
		
		
		
		
		

		
		
	}

}
