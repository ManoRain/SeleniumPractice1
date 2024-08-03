package sel.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkedIN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new  EdgeDriver();
		driver.navigate().to("https://www.linkedin.com/login"); 
		driver.manage().window().maximize();
         
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);
		
		//Valid UserName and Password
		WebElement userNameElement = driver.findElement(By.id("username"));
		userNameElement.sendKeys("manosarala25@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("Mano@2512");
		Thread.sleep(3000);

		WebElement signinButton = driver.findElement(By.tagName("Button"));
		signinButton.click();

		
		
		
		//Valid UserName and Invalid Password
		WebElement validUserNameElement = driver.findElement(By.id("username"));
		validUserNameElement.sendKeys("manosarala25@gmail.com");
		
		WebElement invalidPasswordElement = driver.findElement(By.id("password"));
		invalidPasswordElement.sendKeys("Mano1295");
		Thread.sleep(3000);

		WebElement loginButton2 = driver.findElement(By.tagName("Button"));
		loginButton2.click();
		Thread.sleep(3000);
		driver.close();
	
		/*//InvalidUserName and Valid Password
		
		
		WebElement invalidUserNameElement = driver.findElement(By.id("username"));
		invalidUserNameElement.sendKeys("manosaral@gmail.com");
		
		WebElement validPasswordElement = driver.findElement(By.id("password"));
		validPasswordElement.sendKeys("Mano@2512");
		Thread.sleep(3000);

		WebElement loginButton3 = driver.findElement(By.tagName("Button"));
		loginButton3.click();
		Thread.sleep(3000);
		
		//Invalid UserName and Invalid Password
		
		WebElement invaliduserNameElement = driver.findElement(By.id("username"));
		invaliduserNameElement.sendKeys("manos25@gmail.com");
		
		WebElement invalidpasswordElement = driver.findElement(By.id("password"));
		invalidpasswordElement.sendKeys("M4251295");
		Thread.sleep(3000);

		WebElement loginButton4 = driver.findElement(By.tagName("Button"));
		loginButton4.click();
		Thread.sleep(3000);
		
		//WithOut UserName and Password
		
		WebElement loginButton5 = driver.findElement(By.tagName("Button"));
		loginButton5.click();
		Thread.sleep(3000);*/
		
		
		
		
		

	}

}
