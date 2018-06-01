package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLead typeCompany(String companyName) {
	type(eleCompanyName, companyName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLead typeLastName(String lastName) {
	type(eleLastName, lastName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLead typeFirstName(String firstName) {
	type(eleFirstName, firstName);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadBtn;
	
	public ViewLead clickCreateLeadBtn() {
	click(eleCreateLeadBtn);
		return new ViewLead();		
	}

	
	
	
	
	
	

}
