package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import common.BasePage;

public class OrderDashboardPage extends BasePage
{
	@FindBy(css = "#newOrder") 
	public WebElement NewOrderButton;
	
	@FindBy(css = "#FacilitySelectionList") 
	public WebElement FacilitySelection;

	@FindBy(css = "button.btn.btn-primary") 
	public WebElement FacilitySelectionButton;
	
	public void NewOrder()
	{
		WaitForElement(NewOrderButton);
		NewOrderButton.click();
	}
	
	public void SelectFacility(String facility)
	{
		WaitForElement(FacilitySelectionButton);
		new Select(FacilitySelection).selectByVisibleText(facility);
		FacilitySelectionButton.click();
		
	}
	

}
