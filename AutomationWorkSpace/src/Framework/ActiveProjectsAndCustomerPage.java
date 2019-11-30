package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomerPage {
	
	@FindBy(xpath="//input[@value='Add New Customer']")
    private WebElement addNewCustomerButton;	
    
    @FindBy(className="successmsg")
	private WebElement successMessage;
    
    
    @FindBy(xpath="//input[@value='Add New Project']")
    private WebElement addNewProjectButton;
    
    public ActiveProjectsAndCustomerPage()
    {
    	PageFactory.initElements(BaseClass.driver,this);
    }
    
    public void clickOnAddNewCustomerButton() {
    	
    	addNewCustomerButton.click();
    	
    }

   public String retriveSuccessMessage()
   {
	   String s=successMessage.getText();
	   return s;
   }
   
   public void clickOnAddNewProjectButton()
   {
	   
     addNewProjectButton.click();	   
   }
   
   
   public void SelectaCustomer(String customerName)
   {
	   BaseClass.driver.findElement(By.linkText(customerName)).click();
   }
}



































