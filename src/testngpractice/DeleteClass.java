package testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteClass {
	  @BeforeMethod
	  public void login() {
		  System.out.println("Login is successful");
	  }
	  @AfterMethod
	  public void logout() {
		  System.out.println("Logout is successful");
	  }
	  @Test (priority=4)
	  public void deleteVendor() {
		  System.out.println("Delete Vendor is Successful"); 
	  }

	  @Test (priority=5)
	  public void deleteProduct() {
		  System.out.println("Delete Product is Successful"); 
	  }
	  @Test (priority=6)
	  public void deleteCurrency() {
		  System.out.println("Delete Currency is Successful"); 
	  }
}
