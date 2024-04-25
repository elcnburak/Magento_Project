package StepDefinitions;

import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class US704_Menu_Tab extends GWD {
    LeftNav ln=new LeftNav();
    @And("the user navigates through the TAB menu sections with one level elements:")
    public void theUserNavigatesThroughTheTABMenuSectionsWithOneLevelElements() {
        ln.myClick(ln.whatsNewTab);
        Assert.assertTrue(ln.whatsNewTab.isDisplayed(), "The What is new tab menu is not displayed.");
        ln.myClick(ln.saleTab);
        Assert.assertTrue(ln.saleTab.isDisplayed(),"The Sale tab menu is not displayed.");
    }

    @And("the user navigates through the TAB menu sections with two level elements")
    public void theUserNavigatesThroughTheTABMenuSectionsWithTwoLevelElements() {
        ln.ActionHover(ln.gearTab);
        Assert.assertTrue(ln.gearTab.isDisplayed(),"The Gear tab menu is not visible.");
        ln.gearBags.click();
        Assert.assertTrue(ln.confirmationTabName.getText().equalsIgnoreCase("Bags"),"Bags webpage is not opened");
        ln.homepageLogo.click();
        ln.ActionHover(ln.gearTab);
        Assert.assertTrue(ln.gearTab.isDisplayed(),"The Gear tab menu is not visible.");
        ln.gearFitnessEquipment.click();
        Assert.assertTrue(ln.confirmationTabName.getText().toLowerCase().contains("fitness"),"Fitness Equipment webpage is not opened");
        ln.homepageLogo.click();
        ln.ActionHover(ln.gearTab);
        Assert.assertTrue(ln.gearTab.isDisplayed(),"The Gear tab menu is not visible.");
        ln.gearWatches.click();
        Assert.assertTrue(ln.confirmationTabName.getText().equalsIgnoreCase("Watches"),"Watches webpage is not opened");
        ln.homepageLogo.click();
        ln.ActionHover(ln.trainingTab);
        Assert.assertTrue(ln.trainingTab.isDisplayed(),"The Gear tab menu is not visible.");
        ln.trainingVideoDownload.click();
        Assert.assertTrue(ln.confirmationTabName.getText().equalsIgnoreCase("Video Download"),"Video Download webpage is not opened");
    }

    @And("the user navigates through the TAB menu sections with three level elements")
    public void theUserNavigatesThroughTheTABMenuSectionsWithThreeLevelElements() {
        List<WebElement> womenTopsElements=new ArrayList<>();
        womenTopsElements.add(ln.womenTopsJackets);
        womenTopsElements.add(ln.womenTopsHoodiesAndSweatshirts);
        womenTopsElements.add(ln.womenTopsTees);
        womenTopsElements.add(ln.womenTopsBrasAndTanks);
        for (int i = 0; i < womenTopsElements.size(); i++) {
            ln.homepageLogo.click();
            ln.ActionHover(ln.womenTab);
            ln.ActionHover(ln.womenTopsTab);
            womenTopsElements.get(i).click();
            Assert.assertTrue(ln.confirmationTabName.isDisplayed());
        }

        List<WebElement> womenBottomsElements=new ArrayList<>();
        womenBottomsElements.add(ln.womenBottomsPants);
        womenBottomsElements.add(ln.womenBottomsShorts);
        for (int i = 0; i < womenBottomsElements.size(); i++) {
            ln.homepageLogo.click();
            ln.ActionHover(ln.womenTab);
            ln.ActionHover(ln.womenBottoms);
            womenBottomsElements.get(i).click();
            Assert.assertTrue(ln.confirmationTabName.isDisplayed());
        }
        List<WebElement> menTopsElements=new ArrayList<>();
        menTopsElements.add(ln.menTopsJackets);
        menTopsElements.add(ln.menTopsHoodiesAndSweatshirts);
        menTopsElements.add(ln.menTopsTees);
        menTopsElements.add(ln.menTopsTanks);
        for (int i = 0; i < menTopsElements.size(); i++) {
            ln.homepageLogo.click();
            ln.ActionHover(ln.menTab);
            ln.ActionHover(ln.menTopsTab);
            menTopsElements.get(i).click();
            Assert.assertTrue(ln.confirmationTabName.isDisplayed());
        }

        List<WebElement> menBottomsElements=new ArrayList<>();
        menBottomsElements.add(ln.menBottomsPants);
        menBottomsElements.add(ln.menBottomsShorts);
        for (int i = 0; i < menBottomsElements.size(); i++) {
            ln.homepageLogo.click();
            ln.ActionHover(ln.menTab);
            ln.ActionHover(ln.menBottomsTab);
            menBottomsElements.get(i).click();
            Assert.assertTrue(ln.confirmationTabName.isDisplayed());
        }
    }

    @Then("the user verifies that the last pages are opened")
    public void theUserVerifiesThatTheLastPagesAreOpened() {
        Assert.assertTrue(ln.confirmationTabName.isDisplayed());
    }
}
