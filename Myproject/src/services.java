import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class services {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\Selenium Setup\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.4bittechnology.com/services");
		System.out.println("Entered to services");
		
		driver.findElement(By.xpath("//div[@id='website']//button[@class='redirection div-light'][contains(text(),'Have a look')]")).click();
		System.out.println("Web work");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@id='graphics']//button[@class='redirection div-light'][contains(text(),'Have a look')]")).click();
		System.out.println("Graphical work");
		
        Thread.sleep(5000);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//button[contains(text(),'Contact Us')]")).click();
		System.out.println("scocial Marketing");
		
		 Thread.sleep(5000);
		 
	    driver.navigate().back();
		driver.findElement(By.xpath("//button[@class='redirection look div-light']")).click();
    	System.out.println("Our Invention");
    	
    	//driver.findElement(By.xpath("//div[@class='scroll-to-top txt-c']")).click();
			
    	
	

	}

}
