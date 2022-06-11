package Page_Calismalarim;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GittigidiyorPage {
    public GittigidiyorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='tyj39b-5 lfsBU']")
    public WebElement cereziKabulet;

    @FindBy(xpath = "(//style[@type='text/css'])[3]")
    public  WebElement ifremElementi;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement aramaKutusu;


    @FindBy(xpath = "//a[@class='sc-12aj18f-1 ubwpe']")
    public WebElement ikinciSayfayaGecisTiki;

    @FindBy(xpath = "//a[@title='2. sayfa']")
    public WebElement ikinciSayfaGorunurlugu;

    @FindBy(xpath = "//img[@data-testid='productImage']")
    public List<WebElement> ikinciSayfadakiUrunler;



    @FindBy(xpath = "//button[@id='add-to-basket']")
    public WebElement sepeteEkler;

    @FindBy(xpath = "//span[@id='sp-subTitle']")
    public WebElement urunOzellikleri;

    @FindBy(xpath = "//span[@id='sp-price-highPrice']")
    public WebElement urunFiyati;

    @FindBy(xpath = "//a[@class='header-cart-hidden-link']")
    public WebElement sepetimiTikla;

    @FindBy(xpath = "//a[@class='gg-ui-btn-default padding-none']")
    public WebElement sepetegitTikla;

    @FindBy(xpath = "//div[@class='total-price-box']")
    public WebElement sepettekiUrunFiyati;



    @FindBy(xpath = "//select[@class='amount']")
    public WebElement urunAdediGuncelleme;

    @FindBy(xpath = "//select[@class='amount']")
    public WebElement urunAdedininGuncellendigiDogrulama;

    @FindBy(xpath = "//a[@class='btn-delete btn-update-item']")
    public WebElement sepetiSil;

    @FindBy(xpath = "//*[text()='Sepetinizde ürün bulunmamaktadır.']")
    public WebElement sepetteUrunYokMetni;

}
