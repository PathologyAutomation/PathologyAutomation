package test;

import org.junit.Ignore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import common.BaseTest;
import entities.LoginRegisterEntity;


public class LoginTest extends BaseTest
{
	@Test
	public void VerifyLoginForAdmin()
	{
		LoginRegisterPage.login(LoginFactory.getAdminLogin());
		AdminDashBoardPage.VerifyHeader();
	}
	
	@Test
	@Ignore
	public void VerifyInvalidLoginScenario()
	{
		LoginRegisterEntity invalidLogin=LoginFactory.getAdminLogin();
		invalidLogin.Password="invalid";
		LoginRegisterPage.login(invalidLogin);
		LoginRegisterPage.verifyInvalidLoginMessage();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		LoginRegisterPage.logout();
	}

}
