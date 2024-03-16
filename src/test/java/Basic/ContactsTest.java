package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactsTest {
	
	public void createcontactTest() 
	{
       WebDriver d= new ChromeDriver();
	   d.get("https://www.ajio.com/");
	}
		
}

