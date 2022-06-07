package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablestepDefinitions {
    DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.newButonu.click();
    }

    @And("isim bolumune {string} yazar")
    public void isimBolumuneYazar(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);

    }

    @And("soyisim bolumune {string} yazar")
    public void soyisimBolumuneYazar(String lastname) {

        dataTablesPage.lastName.sendKeys(lastname);
    }

    @And("position bolumune {string} yazar")
    public void positionBolumuneYazar(String position) {

        dataTablesPage.position.sendKeys(position);
    }

    @And("ofis bolumune {string} yazar")
    public void ofisBolumuneYazar(String office) {
        dataTablesPage.office.sendKeys(office);

    }

    @And("extension bolumune {string} yazar")
    public void extensionBolumuneYazar(String extension) {
        dataTablesPage.extension.sendKeys(extension);

    }

    @And("startDate bolumune {string} yazar")
    public void startdateBolumuneYazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);

    }

    @And("salary bolumune {string} salary")
    public void salaryBolumuneSalary(String salary) {
        dataTablesPage.salary.sendKeys(salary);

    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.Create.click();

    }
    @When("kullanici {string}ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);

    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        Assert.assertTrue(dataTablesPage.aramasonucuElemnti.getText().contains(firstname));

    }
}
