package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;

public class US703_Address_Addition extends GWD {
    DialogContent dc = new DialogContent();

    @When("The user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {

        dc.myClick(dc.customerMenu);
        dc.myClick(dc.myAccount);
    }

    @And("The user clicks on the {string} link in the Address Book section.")
    public void theUserClicksOnTheLinkInTheAddressBookSection(String arg0) {
        dc.myClick(dc.manageAddress);
    }

    @And("They click on the {string} button.")
    public void theyClickOnTheButton(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String Street = data.get(0).get("Street");
        String City = data.get(0).get("City");
        String Region = data.get(0).get("Region");
        String ZipCode = data.get(0).get("Zip Code");
        String Country = data.get(0).get("Country");

        dc.mySendKeys(dc.street, Street);
        dc.mySendKeys(dc.city,City);
        dc.mySendKeys(dc.region,Region);
        dc.mySendKeys(dc.zipCode,ZipCode);
        dc.mySendKeys(dc.country,Country);

    }

    @And("They fill in the required fields to add a new address.")
    public void theyFillInTheRequiredFieldsToAddANewAddress() {
    }

    @And("Optionally, they mark one of the added addresses as the default billing or shipping address")
    public void optionallyTheyMarkOneOfTheAddedAddressesAsTheDefaultBillingOrShippingAddress() {
    }

    @And("They save the changes and return to the {string} page.")
    public void theySaveTheChangesAndReturnToThePage(String arg0) {
    }

    @Then("Optionally, they edit or delete the added addresses.")
    public void optionallyTheyEditOrDeleteTheAddedAddresses() {
    }
}
