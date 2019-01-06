package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/girish/Desktop/selenium1/chromedriver.exe");
		WebDriver xyz= new ChromeDriver();
		LoginPage test=new LoginPage(xyz);

		//Test Case: verify Redirection Functionality from Admin to User Interface
		xyz.get("http://www.gcrit.com/build3/admin/");
		test.typeUsername("admin");
		test.typePassword("admin@123");
		test.clickLoginButton();
		Thread.sleep(4000);
		String url=xyz.getCurrentUrl();

		if (url.contains("http://www.gcrit.com/build3/admin/index.php")){
			test.clickLink();
			System.out.println("1st Verification Point : Admin Login is Successful -Passed");
		} else {
			System.out.println("1st Verification Point : Admin Login is unsuccessful -Failed");
		}

		String url2=xyz.getCurrentUrl();

		if (url2.equals("http://www.gcrit.com/build3/")){
			System.out.println("2nd Verification Point : Application was redirected from Admin to User Interface -Passed");
		} else {
			System.out.println("2nd Verification Point : Application was redirected from Admin to User Interface -Passed");
		} 
		xyz.close();
	}

}
