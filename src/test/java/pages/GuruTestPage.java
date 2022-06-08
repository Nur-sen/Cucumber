package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruTestPage {
    public GuruTestPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Accept All']")
    public WebElement cezerKabul;

    @FindBy(xpath = "//thead//tr//th")
 public List<WebElement> baslikListesi;


}
