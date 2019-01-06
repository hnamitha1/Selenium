package testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddClass {
  @BeforeMethod
  public void login() {
	  System.out.println("Login is successful");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("Logout is successful");
  }
  @Test (priority=1)
  public void addVendor() {
	  System.out.println("Add Vendor is Successful"); 
  }

  @Test (priority=2)
  public void addProduct() {
	  System.out.println("Add Product is Successful"); 
  }
  @Test (priority=3)
  public void addCurrency() {
	  System.out.println("Add Currency is Successful"); 
  }
}
