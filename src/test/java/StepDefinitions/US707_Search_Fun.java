package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import static Utilities.GWD.getDriver;

public class US707_Search_Fun {
    @When("The user search the product with SKU number")
    public void theUserSearchTheProductWithSKUNumber() {
        DialogContent dc=new DialogContent();
        dc.mySendKeys(dc.search,"MJ08");
        dc.myClick(dc.searchProductList);

    }

    @And("The user see the product and click it")
    public void theUserSeeTheProductAndClickIt() {
        DialogContent dc=new DialogContent();
        dc.myClick(dc.searchProduct);
    }

    @And("The user click on menu link for the product")
    public void theUserClickOnMenuLinkForTheProduct() {
        Duration duration = Duration.ofSeconds(10); //
        WebDriverWait wait = new WebDriverWait(getDriver(), duration);

        try {
            WebElement deleteToWish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.product.attribute.sku > div.value[itemprop='sku']")));

            if (deleteToWish.isDisplayed()) {
                System.out.println("Ürün doğru.");
            } else {
                System.out.println("Ürün bulunamadı.");
            }
        } catch (NoSuchElementException e) {

            System.out.println("Ürün bulunamadı veya görünmüyor.");
        }
    }

    @And("The user see prodcut SKU number")
    public void theUserSeeProdcutSKUNumber() {
        DialogContent dc=new DialogContent();
        dc.myClick(dc.MenMenu);
        dc.myClick(dc.Jackets);
        dc.myClick(dc.searchProduct);
    }

    @Then("The user check the product SKU number")
    public void theUserCheckTheProductSKUNumber() {
        Duration duration = Duration.ofSeconds(10); //
        WebDriverWait wait = new WebDriverWait(getDriver(), duration);

        try {
            WebElement deleteToWish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.product.attribute.sku > div.value[itemprop='sku']")));

            if (deleteToWish.isDisplayed()) {
                System.out.println("Ürün doğru.");
            } else {
                System.out.println("Ürün bulunamadı.");
            }
        } catch (NoSuchElementException e) {

            System.out.println("Ürün bulunamadı veya görünmüyor.");
        }
    }
}
