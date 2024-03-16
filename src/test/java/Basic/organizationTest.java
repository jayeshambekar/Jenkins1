
package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class organizationTest {
	
	@Test
	public void createorganizationTest() {
		WebDriver d= new ChromeDriver();
		
		d.get("http://localhost:8080/");
	}

}
