package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement kullaniciProfilIsmi;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement  hotelManagementElementi;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListElementi;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHOTELElementi;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeElementi;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement idGroupElementi;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveElementi;

    @FindBy(xpath = "//div[text()='Hotel was inserted successfully']")
    public WebElement sonText;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okElementi;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[3]")
    public WebElement hotelRoomsElementi;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement lISTOFHOTELROOMSTextElementi;

}