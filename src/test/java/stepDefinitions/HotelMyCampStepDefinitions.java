package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampStepDefinitions {
    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        hotelMyCampPage.ilkLoginButonu.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("HotelMyCampName"));

    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HotelMyCampPassword"));

    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hotelMyCampPage.ikinciLoginButonu.click();

    }

    @Then("sayfaya giris yapildigini kontrol eder")
    public void sayfayaGirisYapildiginiKontrolEder() {
      Assert.assertTrue(hotelMyCampPage.kullaniciProfilIsmi.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("HotelMyCampWrongPassword"));

    }

    @Then("sayfaya giris yapilmadigini kontrol eder")
    public void sayfayaGirisYapilmadiginiKontrolEder() {
     Assert.assertTrue(hotelMyCampPage.ikinciLoginButonu.isDisplayed());

    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("HotelMyCampWrongName"));
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hotelMyCampPage.userName.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hotelMyCampPage.password.sendKeys(password);

    }


}
