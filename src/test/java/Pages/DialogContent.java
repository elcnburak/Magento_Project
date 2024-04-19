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

       @FindBy(id = "ui-id-5")
       public WebElement MenMenu;

      @FindBy(xpath = "//img[@class='product-image-photo' and @alt='Hero Hoodie']")
      public WebElement product1;

      @FindBy(xpath = "//div[@class='swatch-option text' and @option-label='M']")
      public WebElement product1M;

      @FindBy(xpath = "//div[@option-label='Green']")
      public WebElement product1Colour;

      @FindBy(xpath = "//input[@type='number' and @name='qty']")
      public WebElement product1Qty;

      @FindBy(xpath = "//button[@type='submit' and @title='Add to Cart']")
      public WebElement product1AddtoCart;

      @FindBy(xpath = "//a[@class='action showcart']")
      public WebElement theCart;

      @FindBy(xpath = "//input[contains(@class, 'item-qty') and contains(@class, 'cart-item-qty')]")
      public WebElement theCartQty;

      @FindBy(xpath = "//span[text()='Update']")
      public WebElement theCartUpdate;

      @FindBy(xpath = "//a[@class='action delete' and @title='Remove item']")
      public WebElement theCartDelete;

      @FindBy(xpath = "//button[@class='action-primary action-accept']")
      public WebElement theCartDeleteOk;

      @FindBy(id = "top-cart-btn-checkout")
      public WebElement proceedToCheckout;

      @FindBy(xpath = "//input[@value='tablerate_bestway']")
      public WebElement bestWay;

      @FindBy(xpath = "//span[text()='Next']")
      public WebElement nextButton;

      @FindBy(xpath = "//span[text()=\"Add to Wish List\"]")
      public WebElement addToWishList;

      @FindBy(xpath = " //button[@data-action=\"customer-menu-toggle\"]")
      public WebElement userMenuIcon;

      @FindBy(xpath = "//a[contains(text(), 'My Wish List')]")
      public WebElement myWishListButton;

      @FindBy(xpath = "//a[@title=\"Remove This Item\"]")
      public WebElement removeItemButton;

      @FindBy(id = "search")
      public WebElement search;

      @FindBy(xpath = "//img[@alt='Lando Gym Jacket']")
      public WebElement searchProduct;

      @FindBy(xpath = "//li[@id='qs-option-0']")
      public WebElement searchProductList;

      @FindBy(xpath = "//a[text()='Jackets']")
      public WebElement Jackets;



























































































}
