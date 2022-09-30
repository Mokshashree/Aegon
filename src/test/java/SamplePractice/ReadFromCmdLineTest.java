package SamplePractice;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadFromCmdLineTest {
@Test
public void Command()
{
	
 String BROWSER = System.getProperty("Browser");
 String URL = System.getProperty("url");
 System.out.println(BROWSER);
 System.out.println(URL);
// WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
 //driver.get(URL);
 
}
	
}
