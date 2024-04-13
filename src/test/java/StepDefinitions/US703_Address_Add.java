package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class US703_Address_Add extends GWD {
    DialogContent dc = new DialogContent();

    @When("The user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {
        dc.myClick(dc.customerMenu);
        dc.myClick(dc.myAccount);
    }
    @And("The user clicks on the {string} link in the Address Book section.")
    public void theUserClicksOnTheLinkInTheAddressBookSection(String arg0) {
        dc.myClick(dc.manageAddress);
        dc.myClick(dc.addNewAddress);
    }

    @And("They fill in the required fields to add a new address.")
    public void theyFillInTheRequiredFieldsToAddANewAddress(DataTable dataTable) {

        List<Map<String, String>> datatable = dataTable.asMaps(String.class, String.class);

        String street = datatable.get(0).get("Street");
        String city = datatable.get(0).get("City");

        dc.mySendKeys(dc.street, street);
        dc.mySendKeys(dc.city, city);
        dc.mySendKeys(dc.zipCode,"12345");
        dc.mySendKeys(dc.PhoneNumber,"123456789");

        WebElement stateDropdown = getDriver().findElement(By.id("region_id"));
        Select stateSelect = new Select(stateDropdown);
        stateSelect.selectByValue("1");
    }
    @And("Optionally, they mark one of the added addresses as the default billing or shipping address")
    public void optionallyTheyMarkOneOfTheAddedAddressesAsTheDefaultBillingOrShippingAddress() {
        dc.myClick(dc.billCheck);
        dc.myClick(dc.shipCheck);
    }

    @And("They save the changes and return to the {string} page.")
    public void theySaveTheChangesAndReturnToThePage(String arg0) {

        dc.myClick(dc.saveAddressButton);
    }

}
