package Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerInformationPage {

	
@FindBy(xpath="//input[@value='Delete This Customer']")	
private WebElement deleteCustomerButton;


public EditCustomerInformationPage()
{
	PageFactory.initElements(BaseClass.driver,this);
}


public void deleteCustomer()
{
	deleteCustomerButton.click();
	BaseClass.driver.switchTo().alert().accept();
}
	

}








