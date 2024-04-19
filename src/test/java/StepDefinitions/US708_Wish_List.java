package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import static Utilities.GWD.getDriver;

public class US708_Wish_List {
    @And("The item is added to the wish list, and a confirmation message is displayed to the user.")
    public void theItemIsAddedToTheWishListAndAConfirmationMessageIsDisplayedToTheUser() {

        DialogContent dc=new DialogContent();
        dc.myClick(dc.MenMenu);

        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", dc.product1);

        dc.myClick(dc.addToWishList);

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(getDriver(), duration);

        try {
            WebElement confirmAddToWish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']")));

            if (confirmAddToWish.isDisplayed()) {
                System.out.println("Favoriler listesine eklendi.");
            } else {
                System.out.println("Mesaj bulunamadı.");
            }
        } catch (NoSuchElementException e) {

            System.out.println("Mesaj bulunamadı veya görünmüyor.");
        }
    }

    @And("The user click my account and My favorite button")
    public void theUserClickMyAccountAndMyFavoriteButton() {
        DialogContent dc=new DialogContent();
        dc.myClick(dc.userMenuIcon);
        dc.myClick(dc.myWishListButton);
    }

    @And("The user delete the favorite product in the wish list")
    public void theUserDeleteTheFavoriteProductInTheWishList() {
        DialogContent dc=new DialogContent();
        dc.myClick(dc.removeItemButton);
    }

    @And("The item is deleted to the wish list, and a confirmation message is displayed to the user.")
    public void theItemIsDeletedToTheWishListAndAConfirmationMessageIsDisplayedToTheUser() {
        Duration duration = Duration.ofSeconds(10); //
        WebDriverWait wait = new WebDriverWait(getDriver(), duration);

        try {
            WebElement deleteToWish = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-ui-id='message-success']")));

            if (deleteToWish.isDisplayed()) {
                System.out.println("Favoriler listesine eklendi.");
            } else {
                System.out.println("Mesaj bulunamadı.");
            }
        } catch (NoSuchElementException e) {

            System.out.println("Mesaj bulunamadı veya görünmüyor.");
        }

    }
}
