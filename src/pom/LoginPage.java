package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver abcd;
	By User = By.name("username");
	By Password = By.name("password");
	By LoginButton = By.id("tdb1");
	By ErrorMessage = By.className("messageStackError");
	By link  = By.linkText("Online Catalog");
	
	public LoginPage(WebDriver driver){
		this.abcd=driver; 
	}
	//Create user actions 
	public void typeUsername(String Uname){
		abcd.findElement(User).sendKeys(Uname); 
	}
	public void captureUsername(){
		abcd.findElement(User).getAttribute("value"); 
	}
	public void clearUsername(){
		abcd.findElement(User).clear(); 
	}
	public void typePassword(String Pwd){
		abcd.findElement(Password).sendKeys(Pwd);
	}
	public void clickLoginButton(){
		abcd.findElement(LoginButton).click();
	}
	public void captureError(){
		abcd.findElement(ErrorMessage).getText();
	}
	public void clickLink(){
		abcd.findElement(link).click();
	}
}
