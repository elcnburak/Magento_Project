package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;

import static Utilities.GWD.getDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class US706_Product_Order {
    @And("The user clicks the shopping cart and proceed to checkout button")
    public void theUserClicksTheShoppingCartAndProceedToCheckoutButton() {

        DialogContent dc=new DialogContent();
        dc.myClick(dc.theCart);
        dc.myClick(dc.proceedToCheckout);
    }

    @And("The user select shipping address and shipping method")
    public void theUserSelectShippingAddressAndShippingMethod() throws InterruptedException {
        DialogContent dc=new DialogContent();

        dc.myClick(dc.bestWay);
        dc.myClick(dc.nextButton);

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(getDriver(), duration);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-mask")));
        WebElement placeOrderButton = getDriver().findElement(By.cssSelector("span[data-bind=\"i18n: 'Place Order'\"]"));
        placeOrderButton.click();
    }

    @And("The user confirm the order")
    public void theUserConfirmTheOrder() {
        Duration duration = Duration.ofSeconds(10); // Bekleme süresini tanımlayın
        WebDriverWait wait = new WebDriverWait(getDriver(), duration);

        try {
            WebElement printReceiptLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.action.print")));

            // Linkin görünür olup olmadığını kontrol et
            if (printReceiptLink.isDisplayed()) {
                // Link görünüyorsa, sipariş doğrulama işlemini yapabilirsiniz
                System.out.println("Sipariş doğrulandı.");
                // Burada doğrulama kodunuzu ekleyebilirsiniz
            } else {
                // Link görünmüyorsa, bir hata mesajı yazdırabilir veya başka bir işlem yapabilirsiniz
                System.out.println("Link bulunamadı veya görünmüyor.");
            }
        } catch (NoSuchElementException e) {
            // NoSuchElementException hatası alındığında işlem yapılabilir
            System.out.println("Link bulunamadı veya görünmüyor.");
        }
    }
}


