package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class OrderEntryFormPage extends BasePage
{
	@FindBy(xpath = "//div[@class='box-content box-no-padding']//div[1]//i[text()='Search']") 
	public WebElement PatientSearch;
	
	@FindBy(xpath = "//div[@class='box-content box-no-padding']//div[2]//i[text()='Search']") 
	public WebElement PhysicianSearch;
	
	@FindBy(xpath = "//div[@class='box-content box-no-padding']//div[3]//i[text()='Search']") 
	public WebElement FacilitySearch;

	@FindBy(css = "#searchPatientModalBodyID > div.modal-footer > button.btn.btn-primary") 
	public WebElement PatientSelectButton;
	
	@FindBy(css = "#searchProvierModalBodyID > div.modal-footer > button.btn.btn-primary") 
	public WebElement PhysicianSelectButton;
	
	@FindBy(css = "#searchFacilityModalBodyID > div.modal-footer > button.btn.btn-primary") 
	public WebElement FacilitySelectButton;

	
	public void SelectPerson(String name)
	{
		Driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/..//input")).click();
	}
	
	
	public void CreateOrderForm()
	{
		PatientSearch.click();
		WaitForElement(PatientSelectButton);
		SelectPerson("John");
		PatientSelectButton.click();
		

		PhysicianSearch.click();
		WaitForElement(PhysicianSelectButton);
		SelectPerson("Smith, Steven");
		PhysicianSelectButton.click();
		

		FacilitySearch.click();
		WaitForElement(FacilitySelectButton);
		SelectPerson("Suncoast Endoscopy Center");
		FacilitySelectButton.click();
		
	}



}
