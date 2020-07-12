import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("this is add by clonegit");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\Selenium Setup\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.4bittechnology.com/contact-us");
	    System.out.println(driver.getTitle());

	    
	    driver.findElement(By.xpath("//input[@id='name']")).click();
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Tejas Patel");

	    driver.findElement(By.id("email")).sendKeys("suranitejas32@gmail.com");
	    
	    Select s =new Select(driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']")));
	    s.selectByVisibleText("Freelancing / Job");
	    
	    driver.findElement(By.id("sub")).sendKeys("Software Engineering");
	    
	    driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("This is just demo so please ignore it.");
	    
	    driver.findElement(By.xpath("//button[@class='container-light']")).click();
	    
	    System.out.println("sucessfully submit");
	    
	    
	    
	    
	    
	    
	     
		

	}

}
