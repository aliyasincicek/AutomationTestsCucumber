package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPageFunctionalities {

    public MainPageFunctionalities() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    //Locators

    @FindBy(partialLinkText = "Signup")
    public WebElement signupButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupText;

    @FindBy(name= "name")
    public WebElement nameBox;

    @FindBy (xpath = "(//*[@name=\"email\"])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "(//*[@type= 'submit'])[2]")
    public WebElement accountCreatSignupButton;

    @FindBy(xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement createAccountPageVerification;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement sayfaninAltındakiEmailBox;

    @FindBy (xpath = "//div[@class='single-widget']")
    public WebElement subscriptionElementi;

    @FindBy (xpath = "//i[@class='fa fa-home']")
    public WebElement sayfaninAltindakiEmailOnayButonu;

    @FindBy (xpath = "//div[@class='form-row']")
    public WebElement basariliAboneYazisiElementi;
}
