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

    @FindBy(xpath ="(//*[@id='ui-id-2']/li)[1]")
    public WebElement whatsNewTab;

    @FindBy(xpath ="(//*[@id='ui-id-2']/li)[2]")
    public WebElement womenTab;

    @FindBy(xpath ="(//*[@id='ui-id-2']/li)[3]")
    public WebElement menTab;

    @FindBy(xpath ="(//*[@id='ui-id-2']/li)[4]")
    public WebElement gearTab;

    @FindBy(xpath ="(//*[@id='ui-id-2']/li)[5]")
    public WebElement trainingTab;

    @FindBy(xpath ="//*[text()='Video Download']")
    public WebElement trainingVideoDownload;



    @FindBy(xpath ="(//*[@id='ui-id-2']/li)[6]")
    public WebElement saleTab;

    @FindBy(xpath ="//*[@class='page-title']/span")
    public WebElement confirmationTabName;

    @FindBy(xpath ="(//*[text()='Tops'])[1]")
    public WebElement womenTop;

    @FindBy(xpath ="(//*[text()='Bottoms'])[1]")
    public WebElement womenBottoms;

    @FindBy(xpath ="//*[text()='Bags']")
    public WebElement gearBags;

    @FindBy(xpath ="//*[text()='Fitness Equipment']")
    public WebElement gearFitnessEquipment;

    @FindBy(xpath ="//*[text()='Watches']")
    public WebElement gearWatches;

    @FindBy(xpath ="(//*[@class='fc-button-label'])[1]")
    public WebElement consent;

    @FindBy(xpath ="//*[@class='logo']")
    public WebElement homepageLogo;

    @FindBy(xpath ="//*[contains(@class, 'level1 nav-2-1')]/a")
    public WebElement womenTopsTab;

    @FindBy(xpath ="(//*[text()='Jackets'])[1]")
    public WebElement womenTopsJackets;

    @FindBy(xpath ="(//*[text()='Hoodies & Sweatshirts'])[1]")
    public WebElement womenTopsHoodiesAndSweatshirts;

    @FindBy(xpath ="(//*[text()='Tees'])[1]")
    public WebElement womenTopsTees;

    @FindBy(xpath ="(//*[text()='Bras & Tanks'])[1]")
    public WebElement womenTopsBrasAndTanks;

    @FindBy(xpath ="(//*[text()='Pants'])[1]")
    public WebElement womenBottomsPants;

    @FindBy(xpath ="(//*[text()='Shorts'])[1]")
    public WebElement womenBottomsShorts;

    @FindBy(xpath ="(//*[text()='Tops'])[2]")
    public WebElement menTopsTab;

    @FindBy(xpath ="(//*[text()='Bottoms'])[2]")
    public WebElement menBottomsTab;

    @FindBy(xpath ="(//*[text()='Jackets'])[2]")
    public WebElement menTopsJackets;

    @FindBy(xpath ="(//*[text()='Hoodies & Sweatshirts'])[2]")
    public WebElement menTopsHoodiesAndSweatshirts;

    @FindBy(xpath ="(//*[text()='Tees'])[2]")
    public WebElement menTopsTees;

    @FindBy(xpath ="(//*[text()='Tanks'])[1]")
    public WebElement menTopsTanks;

    @FindBy(xpath ="(//*[text()='Pants'])[2]")
    public WebElement menBottomsPants;

    @FindBy(xpath ="(//*[text()='Shorts'])[2]")
    public WebElement menBottomsShorts;

}
