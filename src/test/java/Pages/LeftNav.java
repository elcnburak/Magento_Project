package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{
    public LeftNav(){
        PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath ="(//*[@class='authorization-link']/a)[1]")
    public WebElement SignInLink;

    @FindBy(id ="email")
    public WebElement logInEmail;

    @FindBy(xpath ="//*[@name='login[password]']")
    public WebElement logInPassword;

    @FindBy(xpath ="//*[@class='action login primary']/span")
    public WebElement logInButton;

    @FindBy(xpath ="(//*[@class='logged-in'])[1]")
    public WebElement verifyLogIn;

}
