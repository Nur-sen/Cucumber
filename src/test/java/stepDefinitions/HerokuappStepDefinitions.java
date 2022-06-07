package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;


public class HerokuappStepDefinitions {
    HerokuappPage herokuappPage =new HerokuappPage();
    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonu.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteElementButonu,2);


    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteElementButonu.isDisplayed());

    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuappPage.deleteElementButonu.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue(herokuappPage.addElementButonu.isDisplayed());

    }

}
