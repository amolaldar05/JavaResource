package JavaCollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {

	public static void main(String[] args) {
		String[][] loginCred = { { "Abc", "abc123" }, { "XYZ", "xyz123" } };
		String userName = loginCred[0][0];
		String pass = loginCred[0][1];
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/auth/login");
		for (int i = 0; i < loginCred.length; i++) {
			driver.findElement(By.id("userEmail")).sendKeys(userName);
			driver.findElement(By.id("userPassword")).sendKeys(pass);
			driver.findElement(By.id("login")).click();
			if (driver.getTitle().contains("shop")) {
				break;
			}
		}
	

	}

}
