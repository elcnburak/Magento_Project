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

       @FindBy(xpath ="//div[@class='message-success success message']")
       public WebElement welcomeMessage;






}
