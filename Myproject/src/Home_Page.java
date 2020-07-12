import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\Selenium Setup\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.4bittechnology.com/home");
		System.out.println(driver.getTitle());
		System.out.println("Home page Visited");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Know us well')]")).click();
		System.out.println(" know us button clicked");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@class='theme-icon']")).click();
		System.out.println("night Mode is on now");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		driver.get("https://www.4bittechnology.com/home");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Contact here')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println("Entered to Contact us");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.get("https://www.4bittechnology.com/home");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Join our team')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println("Entered for job");
		
		Thread.sleep(2000);		
		
		driver.navigate().back();
		driver.get("https://www.4bittechnology.com/home");
		driver.findElement(By.xpath("//button[contains(text(),'Our work')]")).click();
		System.out.println(driver.getTitle());
		System.out.println("This is our work");
		
		Thread.sleep(2000);		
        
		driver.navigate().back();
		driver.get("https://www.4bittechnology.com/home");
		driver.findElement(By.xpath("//video[contains(text(),'Browser not supported')]")).click();
		System.out.println(driver.getTitle());
		System.out.println("The video played");
		

		
	}

}
