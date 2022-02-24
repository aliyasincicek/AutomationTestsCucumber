package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {
    public CartPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//a[@href='/view_cart'])[1]")
    public WebElement cartButonu;

    @FindBy (xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionElementi;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement emailTextBox;

    @FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement sayfaninAltTarafindaEmailOkButonu;

    @FindBy (xpath = "//div[@class='form-row']")
    public WebElement basariliAboneYazisiElementi;

    @FindBy (xpath = "(//div[@class='productinfo text-center'])[1]")
    public WebElement productSayfasiIlkUrun;

    @FindBy (xpath = "(//div[@class='productinfo text-center'])[2]")
    public WebElement productSayfasiIkinciUrun;

    @FindBy (xpath = "(//a[@data-product-id='1'])[1]")
    public WebElement birinciUrunAddToCartElementi;

    @FindBy (xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement birinciUrunContinueShoppingElementi;

    @FindBy (xpath = "(//a[@data-product-id='2'])[2]")
    public WebElement ikinciUrunAddToCartElementi;
    // "//u[text()='View Cart']"

    @FindBy (xpath = "(//p[@class='text-center'])[2]")
    public WebElement ikinciUrunViewCartElementi;

    @FindBy (xpath = "(//button[@class='disabled'])[1]")
    public WebElement birinciUrunMiktarAdedi;

    @FindBy (xpath = "(//button[@class='disabled'])[2]")
    public WebElement ikinciUrunMiktarAdedi;

    @FindBy (xpath = "(//td[@class='cart_price'])[1]")
    public WebElement birinciUrunFiyatElementi;

    @FindBy (xpath = "(//td[@class='cart_price'])[2]")
    public WebElement ikinciUrunFiyatElementi;

    @FindBy (xpath = "(//p[@class='cart_total_price'])[1]")
    public WebElement birinciUrunTotalElementi;

    @FindBy (xpath = "(//p[@class='cart_total_price'])[2]")
    public WebElement ikinciUrunTotalElementi;

    @FindBy (xpath = "(//td[@class='cart_description'])[1]")
    public WebElement sepettekiIlkUrunElementi;

    @FindBy (xpath = "(//td[@class='cart_description'])[2]")
    public WebElement sepettekiIkinciUrunElementi;




}
