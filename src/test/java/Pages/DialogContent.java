package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utilities.GWD.getDriver;

public class DialogContent extends ParentPage{

    public DialogContent() {
        PageFactory.initElements(getDriver(), this);
    }
        @FindBy(xpath = "//p[@class='fc-button-label' and text()='İzin ver']")
        public WebElement content;

        @FindBy(xpath = "//a[contains(text(), 'Create an Account')]")
        public WebElement createAccountButton;

        @FindBy(id = "firstname")
        public WebElement registerName;

        @FindBy(id = "lastname")
        public WebElement registerLastName;

        @FindBy(id = "email_address")
        public WebElement registerEmail;

        @FindBy(id = "password")
        public WebElement registerPassword;

        @FindBy(id = "password-confirmation")
        public WebElement registerPasswordConfirm;

        @FindBy(xpath = "//button[@title='Create an Account']")
        public WebElement registerButton;

        @FindBy(xpath ="//button[@data-action='customer-menu-toggle']")
        public WebElement customerMenu;

        @FindBy(xpath ="//a[text()='My Account']")
        public WebElement myAccount;

        @FindBy(xpath ="//a[contains(@class, 'edit') and contains(@href, '/customer/address/')]")
        public WebElement manageAddress;

        @FindBy(xpath ="//button[@type='button' and @role='add-address' and @title='Add New Address' and contains(@class, 'add')]")
        public WebElement addNewAddress;

        @FindBy(id = "telephone")
        public WebElement PhoneNumber;

        @FindBy(id = "street_1")
        public WebElement street;

       @FindBy(id = "city")
       public WebElement city;

       @FindBy(id = "zip")
       public WebElement zipCode;

       @FindBy(xpath = "//button[@title='Save Address']")
       public WebElement saveAddressButton;

       @FindBy(xpath = "//input[@id='primary_billing']")
       public WebElement billCheck;

       @FindBy(xpath = "//input[@id='primary_shipping']")
       public WebElement shipCheck;





}
