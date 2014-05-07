package test;

import org.testng.annotations.Test;

import common.BaseTest;

public class OrderFormTest extends BaseTest
{
	@Test
	public void shouldAbleToCreateOrder()
	{
		LoginRegisterPage.login(LoginFactory.getTechnicianLogin());
		OrderDashboardPage.SelectFacility(OrderFormFactory.getFacilityType());
		OrderDashboardPage.NewOrder();
		OrderEntryFormPage.CreateOrderForm();
	}
}
