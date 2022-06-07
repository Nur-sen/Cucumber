package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {
    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    public static void pegeDown() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();

    }
    @FindBy(xpath = "//tbody//tr")//satir sayisi bulunur
    public List<WebElement> satirSayisi;

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> sutunSayisi;

    @FindBy(xpath = "//tbody//tr[1]")//satir sayisi bulunur
    public List<WebElement> birinciSatirElemnti;
}


