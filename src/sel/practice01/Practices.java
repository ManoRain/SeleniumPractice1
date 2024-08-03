package sel.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practices {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				WebDriver driver = new  EdgeDriver();
				driver.navigate().to("https://www.facebook.com/login.php/"); 
				driver.manage().window().maximize();
		         
				String title = driver.getTitle();
				System.out.println(title);
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				Thread.sleep(3000);
				//Valid UserName and Password
				WebElement userNameElement = driver.findElement(By.id("email"));
				userNameElement.sendKeys("manosarala25@gmail.com");
				
				WebElement passwordElement = driver.findElement(By.id("pass"));
				passwordElement.sendKeys("Mano@251295");
				Thread.sleep(3000);

				WebElement loginButton = driver.findElement(By.name("login"));
				loginButton.click();
				Thread.sleep(3000);
				
				
				
				
				/*//Valid UserName and Invalid Password
				WebElement validUserNameElement = driver.findElement(By.id("email"));
				validUserNameElement.sendKeys("manosarala25@gmail.com");
				
				WebElement invalidPasswordElement = driver.findElement(By.id("pass"));
				invalidPasswordElement.sendKeys("Mano1295");
				Thread.sleep(3000);

				WebElement loginButton2 = driver.findElement(By.name("login"));
				loginButton2.click();
				Thread.sleep(3000);
				
				//InvalidUserName and Valid Password
				
				WebElement invalidUserNameElement = driver.findElement(By.id("email"));
				invalidUserNameElement.sendKeys("manosaral@gmail.com");
				
				WebElement validPasswordElement = driver.findElement(By.id("pass"));
				validPasswordElement.sendKeys("Mano@251295");
				Thread.sleep(3000);

				WebElement loginButton3 = driver.findElement(By.name("login"));
				loginButton3.click();
				Thread.sleep(3000);
				
				//Invalid UserName and Invalid Password
				
				WebElement invaliduserNameElement = driver.findElement(By.id("email"));
				invaliduserNameElement.sendKeys("manos25@gmail.com");
				
				WebElement invalidpasswordElement = driver.findElement(By.id("pass"));
				invalidpasswordElement.sendKeys("M4251295");
				Thread.sleep(3000);

				WebElement loginButton4 = driver.findElement(By.name("login"));
				loginButton4.click();
				Thread.sleep(3000);
				
				//WithOut UserName and Password
				
				WebElement loginButton5 = driver.findElement(By.name("login"));
				loginButton5.click();
				Thread.sleep(3000);*/
				
				driver.close();
				
				
	}

}
