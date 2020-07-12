import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMedia_Icon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\Selenium Setup\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.4bittechnology.com/work");
		System.out.println(driver.getTitle());

		
		
	    driver.findElement(By.cssSelector("span[class='fa-google fab']")).click();
		
		driver.findElement(By.cssSelector("span[class='fa-instagram fab']")).click();
		
        driver.findElement(By.cssSelector("span[class='fa-facebook-f fab']")).click();
		
		driver.findElement(By.cssSelector("span[class='fa-twitter fab']")).click();
		
        driver.findElement(By.cssSelector("span[class='fa-linkedin-in fab']")).click();
		
		driver.findElement(By.cssSelector("span[class='fa-youtube fab']")).click();
		
        driver.findElement(By.cssSelector("span[class='fa-skype fab']")).click();
		
		driver.findElement(By.cssSelector("span[class='fa-envelope far']")).click();
		
		driver.findElement(By.cssSelector("span[class='fa-whatsapp fab']")).click();
			
	    driver.findElement(By.cssSelector("span[class='fa-mobile fas']")).click();
	}

}
