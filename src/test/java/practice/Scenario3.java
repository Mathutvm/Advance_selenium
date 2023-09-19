package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		 driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TV");
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='industry']"));
		Select s=new Select(dropDown);
           s.selectByVisibleText("Chemicals");
           driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
           WebElement Admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
    	   Actions a=new Actions(driver);
           a.moveToElement(Admin).perform();
           driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
