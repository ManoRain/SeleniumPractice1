package sel.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new  EdgeDriver();
		driver.navigate().to("https://www.instagram.com/accounts/login/"); 
		driver.manage().window().maximize();
         
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);
		
		//Valid UserName and Password
		WebElement userNameElement = driver.findElement(By.xpath("//input[@type='text']"));
		userNameElement.sendKeys("manosarala25@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.xpath("//input[@type='password']"));
		passwordElement.sendKeys("Mano@2512");
		Thread.sleep(3000);

		WebElement loginButton = driver.findElement(By.tagName("Button"));
		loginButton.click();

	}

}
