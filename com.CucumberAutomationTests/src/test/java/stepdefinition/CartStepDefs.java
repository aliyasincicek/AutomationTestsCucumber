package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.CartPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class CartStepDefs {
    CartPage cartPage=new CartPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici sepet butonunu tiklar")
    public void kullanici_sepet_butonunu_tiklar() {
        cartPage.cartButonu.click();
    }
    @Given("kullanici alt bilgiye ilerler")
    public void kullanici_alt_bilgiye_ilerler() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true)",cartPage.subscriptionElementi);
    }
    @Given("kullanici abonelik metnini dogrular")
    public void kullanici_abonelik_metninin_dogrular() {
        Assert.assertTrue(cartPage.subscriptionElementi.isDisplayed());
    }
    @Given("kullanici email adresini girer ve ok butonuna tiklar")
    public void kullanici_email_adresini_girer_ve_ok_butonuna_tiklar() {
        cartPage.emailTextBox.sendKeys("almanpanzeri@gmail.com");
        cartPage.sayfaninAltTarafindaEmailOkButonu.click();
    }
    @Given("kullanici basari mesajini dogrular")
    public void kullanici_basari_mesajini_dogrular() {
        String actualBasariliAbone=cartPage.basariliAboneYazisiElementi.getText();
        Assert.assertFalse(actualBasariliAbone.contains("You have been successfully subscribed!"));
    }
    @When("kullanici ilk urun uzerine gelir ve sepete ekleyi tiklar")
    public void kullanici_ilk_urun_uzerine_gelir_ve_sepete_ekleyi_tiklar() {
        actions=new Actions(Driver.getDriver());
        actions.moveToElement(cartPage.productSayfasiIlkUrun).perform();
        actions.click(cartPage.birinciUrunAddToCartElementi).perform();
    }
    @When("kullanici alisverise devam et butonuna tiklar")
    public void kullanici_alisverise_devam_et_butonuna_tiklar() {
        actions=new Actions(Driver.getDriver());
        ReusableMethods.waitFor(1);
        actions.click(cartPage.birinciUrunContinueShoppingElementi).perform();
    }
    @When("kullanici mouse'u ikinci urun uzerine getirir ve sepete ekleyi tiklar")
    public void kullanici_mouse_u_ikinci_urun_uzerine_getirir_ve_sepete_ekleyi_tiklar() {
        actions=new Actions(Driver.getDriver());
        actions.moveToElement(cartPage.productSayfasiIkinciUrun).perform();
        ReusableMethods.waitFor(1);
        actions.click(cartPage.ikinciUrunAddToCartElementi).perform();


    }
    @When("kullanici sepeti goruntule butonunu tiklar")
    public void kullanici_sepeti_goruntule_butonunu_tiklar() {
        actions=new Actions(Driver.getDriver());
        ReusableMethods.waitFor(1);
        actions.click(cartPage.ikinciUrunViewCartElementi).perform();
    }
    @When("kullanici her iki urununde sepete eklendigini test eder")
    public void kullanici_her_iki_urununde_sepete_eklendigini_test_eder() {
        String actualIlkUrunIsmi=cartPage.sepettekiIlkUrunElementi.getText();
        Assert.assertTrue(actualIlkUrunIsmi.contains("Blue Top"));

        String actualIkinciUrunIsmi=cartPage.sepettekiIkinciUrunElementi.getText();
        Assert.assertTrue(actualIkinciUrunIsmi.contains("Men Tshirt"));

    }
    @Then("kullanici fiyatlarini, miktarini ve toplam fiyatlari test eder")
    public void kullanici_fiyatlarini_miktarini_ve_toplam_fiyatlari_test_eder() {
        String actualIlkUrunFiyati=cartPage.birinciUrunFiyatElementi.getText();
        Assert.assertTrue(actualIlkUrunFiyati.contains("500"));

        String actualIkinciUrunFiyati=cartPage.ikinciUrunFiyatElementi.getText();
        Assert.assertTrue(actualIkinciUrunFiyati.contains("400"));

        String actualBirinciUrunAdedi=cartPage.birinciUrunMiktarAdedi.getText();
        Assert.assertEquals("1",actualBirinciUrunAdedi);

        String actualIkinciUrunAdedi=cartPage.ikinciUrunMiktarAdedi.getText();
        Assert.assertEquals("1",actualIkinciUrunAdedi);

        String actualBirinciUrunTotal=cartPage.birinciUrunTotalElementi.getText();
        Assert.assertEquals("Rs. 500",actualBirinciUrunTotal);

        String actualIkinciUrunTotal=cartPage.ikinciUrunTotalElementi.getText();
        Assert.assertEquals("Rs. 400",actualIkinciUrunTotal);

        //int birinciUrunFiyati=Integer.parseInt(actualIlkUrunFiyati);
       // int ikinciUrunFiyati=Integer.parseInt(actualIkinciUrunFiyati);




    }

}
