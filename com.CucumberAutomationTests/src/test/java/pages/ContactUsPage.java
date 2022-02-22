package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
   public ContactUsPage (){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//a[text()=' Contact us']")
    public WebElement contactUsButonu;

   @FindBy (xpath = "(//input[@type='text'])[1]")
    public WebElement nameButonu;

   @FindBy (xpath = "(//h2[@class='title text-center'])[2]")
    public  WebElement getInTouchYazisi;

   @FindBy (xpath = "//input[@type='file']")
    public WebElement dosyaSecButonu;

   @FindBy (xpath = "//input[@type='submit']")
    public WebElement gonderButonu;

   @FindBy (xpath = "//div[@class='status alert alert-success']")
    public WebElement basariliGonderiYazisi;

   @FindBy (xpath = "//i[@class='fa fa-angle-double-left']")
    public WebElement homeButonu;

   @FindBy (xpath = "//a[text()=' Test Cases']")
    public WebElement testCaseButonu;

   @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement testCaseYaziElementi;


}
