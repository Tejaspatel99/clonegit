import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\Selenium Setup\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.4bittechnology.com/work");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='work div-light']//div[1]//div[1]//div[1]//div[4]//a[1]")).click();
		
		
		
		
	
	}

}
