package testngecommer;

import org.testng.annotations.Test;

public class NewTest {
  @Test(groups = {"sanity", "regression"}, priority = 1)
  public void login() {
	  System.out.println("Login is Successful");
  }
  @Test(groups = {"sanity", "regression"}, priority = 6)
  public void logout() {
	  System.out.println("Logout is Successful");
  }
  @Test (groups = {"sanity"}, priority = 2)
  public void search() {
	  System.out.println("search is Successful");
  }
  @Test (groups = {"regression"}, priority = 3)
  public void advancedSearch() {
	  System.out.println("advancedsearch is Successful");
  }
  @Test(groups = {"sanity", "regression"}, priority = 4)
  public void prepaidRecharge() {
	  System.out.println("prepaidRecharge is Successful");
  }
  @Test (groups = {"regression"}, priority = 5)
  public void billPayment() {
	  System.out.println("billpayment is Successful");
  }
}
