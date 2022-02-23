package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {
    public ProductsPage (){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//a[text()=' Products']")
    public WebElement productsButonu;

    @FindBy (xpath = "//div[@class='col-sm-9 padding-right']")
    public WebElement allProducts;

    @FindBy (xpath = "(//a[@style='color: brown;'])[1]")
    public WebElement ilkUrunViewProduct;

    @FindBy (xpath = "//div[@class='product-information']")
    public WebElement ilkUrununAyrintiliBilgisi;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement searchBox;

    @FindBy (xpath = "//i[@class='fa fa-search']")
    public WebElement aramaButonu;

    @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductsYaziElementi;

    @FindBy (xpath = "//a[text()='Polo']")
    public WebElement poloYaziElementi;

    @FindBy (xpath = "//a[text()='H&M']")
    public WebElement hmYaziElementi;

    @FindBy (xpath = "//a[text()='Madame']")
    public WebElement madameYaziElementi;

    @FindBy(xpath = "//a[text()='Mast & Harbour']")
    public WebElement masthYaziElementi;

    @FindBy (xpath = "//a[text()='Babyhug']")
    public WebElement babyhugYaziElementi;

    @FindBy (xpath = "//a[text()='Allen Solly Junior']")
    public WebElement allensjYaziElementi;

    @FindBy (xpath = "//a[text()='Kookie Kids']")
    public WebElement kookieYzaiElementi;
    @FindBy(xpath = "//a[text()='Biba']")
    public WebElement bibaYaziElementi;

}
